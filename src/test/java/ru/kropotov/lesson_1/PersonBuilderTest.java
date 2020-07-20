package ru.kropotov.lesson_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
class PersonBuilderTest {

    @Test
    public void createEmptyPerson() {
        Person person = PersonBuilder.builder().build();
        assertNull(person.lastName);
        assertEquals(0, (person.age));
        assertNotEquals(null, person);
    }

    @Test
    public void createFilledPerson() {
        Person person = PersonBuilder.builder()
                .lastName("lastName")
                .firstName("firstName")
                .age(15)
            .build();
        assertEquals("lastName", (person.lastName));
        assertEquals("firstName", (person.firstName));
        assertEquals(15, (person.age));
    }
}