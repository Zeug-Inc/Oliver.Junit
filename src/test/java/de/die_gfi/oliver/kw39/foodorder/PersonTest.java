package de.die_gfi.oliver.kw39.foodorder;

import de.die_gfi.oliver.kw39.foodorder.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testEquals() {

        Person a = new Person("Franz", "Meier");
        Person b = new Person("Franziska", "Mayer");

        Assertions.assertAll(
                () -> Assertions.assertNotNull(a),
                () -> Assertions.assertNotNull(b),
                () -> Assertions.assertEquals(a, a),
                () -> Assertions.assertNotEquals(a, b),
                () -> Assertions.assertNotEquals(b, a));
    }
}