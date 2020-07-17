package ru.kropotov.lesson_1;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
class LightWeightCar extends Car implements Moveable{

    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

}
