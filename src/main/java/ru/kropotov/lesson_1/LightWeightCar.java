package ru.kropotov.lesson_1;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
class LightWeightCar extends Car {

    @Override
    void open() {
        System.out.println("LightWeightCar is open");
    }

    @Override
    public void move() {
        System.out.println("LightWeightCar is moving");
    }

    @Override
    public void stop() {
        System.out.println("LightWeightCar is stopped");
    }
}
