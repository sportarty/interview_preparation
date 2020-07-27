package ru.kropotov.lesson_3;

/**
 * Created by Artem Kropotov on 27.07.2020
 */
public class PingPong {
    int count;
    String state;

    synchronized void ping() throws InterruptedException {
        System.out.print("ping ");
        notify();
        wait();
    }

    synchronized void pong() throws InterruptedException {
        System.out.println("pong");
        notify();
        wait();
    }

    synchronized public void stop() {
        notify();
    }
}
