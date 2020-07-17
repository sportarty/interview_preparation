package ru.kropotov.lesson_1;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
class Lorry extends Car, Moveable, Stopable{

    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }


}

