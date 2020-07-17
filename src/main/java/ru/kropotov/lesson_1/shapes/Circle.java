package ru.kropotov.lesson_1.shapes;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return r * r * Math.PI;
    }

    @Override
    void draw() {
        System.out.println("Нарисован крург");
    }
}
