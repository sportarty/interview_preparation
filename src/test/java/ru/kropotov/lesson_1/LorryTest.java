package ru.kropotov.lesson_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
class LorryTest {

    private Lorry lorry = new Lorry();

    @Test
    void move() {
        lorry.start();
        lorry.move();
        lorry.stop();
        lorry.open();
        lorry.setColor("red");
        lorry.setName("name");
        lorry.setEngine(new Engine());
        assertEquals("red", lorry.getColor());
        assertEquals("name", lorry.getName());
        assertNotNull(lorry.getEngine());
    }
}