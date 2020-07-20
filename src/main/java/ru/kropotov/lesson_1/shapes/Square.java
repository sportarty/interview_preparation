package ru.kropotov.lesson_1.shapes;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
public class Square extends Shape {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    double getArea() {
        return size * size;
    }

    @Override
    void draw() {
        System.out.println("Нарисован квадрат");
    }
}
