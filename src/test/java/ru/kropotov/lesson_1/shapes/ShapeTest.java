package ru.kropotov.lesson_1.shapes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
class ShapeTest {

    ArrayList<Shape> arr = new ArrayList<>();

    @Test
    void test() {
        arr.add(new Square(5));
        arr.add(new Circle(2.5));
        arr.add(new Triangle(3, 4, 5));

        assertEquals(25.0, arr.get(0).getArea());
        assertEquals(6.0, arr.get(2).getArea());

        for(Shape s : arr) {
            s.draw();
        }
    }
}