package ru.kropotov.lesson_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
class MainAppTest {

    @Test
    public void helloWorldTest() {
        assertEquals("Hello World!", new MainApp().helloWorld());
    }
}