package ru.kropotov.lesson_1;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
class Lorry extends Car {

    @Override
    public void move(){
        System.out.println("Lorry is moving");
    }

    @Override
    public void stop(){
        System.out.println("Lorry is stop");
    }

    @Override
    void open() {
        System.out.println("Lorry was opened");
    }
}

