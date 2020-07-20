package ru.kropotov.lesson_1;

/**
 * Created by Artem Kropotov on 17.07.2020
 */
public class PersonBuilder {

    private Person person = new Person();

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public Person build() {
        return this.person;
    }

    public PersonBuilder firstName(String firstName) {
        this.person.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.person.lastName = lastName;
        return this;
    }

    public PersonBuilder middleName(String middleName) {
        this.person.middleName = middleName;
        return this;
    }

    public PersonBuilder country(String country) {
        this.person.country = country;
        return this;
    }

    public PersonBuilder address(String address) {
        this.person.address = address;
        return this;
    }

    public PersonBuilder phone(String phone) {
        this.person.phone = phone;
        return this;
    }

    public PersonBuilder age(int age) {
        this.person.age = age;
        return this;
    }

    public PersonBuilder gender(String gender) {
        this.person.gender = gender;
        return this;
    }
}
