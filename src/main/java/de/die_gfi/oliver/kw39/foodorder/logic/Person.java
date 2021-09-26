package de.die_gfi.oliver.kw39.foodorder.logic;

import java.util.ArrayList;
import java.util.Objects;

public class Person {

    String firstName;
    String lastName;
    double toPay;

    public static ArrayList<Person> everybody = new ArrayList<>();



    public static ArrayList<Person> getEverybody() {
        return everybody;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.toPay = 0;

        everybody.add(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", toPay=" + toPay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
