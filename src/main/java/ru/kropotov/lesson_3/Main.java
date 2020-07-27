package ru.kropotov.lesson_3;

/**
 * Created by Artem Kropotov on 24.07.2020
 */
public class Main {
    public static void main(String[] args) {
        new Main().play(10);

    }

    synchronized public void play(int count) {
        PingPong pingPong = new PingPong();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                try {
                    pingPong.ping();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            pingPong.stop();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                try {
                    pingPong.pong();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            pingPong.stop();
        });

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
