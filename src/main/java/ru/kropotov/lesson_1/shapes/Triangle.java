package ru.kropotov.lesson_1.shapes;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double p  = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    void draw() {
        System.out.println("Нарисован треугольник");
    }
}
