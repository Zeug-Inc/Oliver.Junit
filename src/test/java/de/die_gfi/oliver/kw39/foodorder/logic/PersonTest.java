package de.die_gfi.oliver.kw39.foodorder.logic;

import de.die_gfi.oliver.kw39.foodorder.logic.Person;
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
                () -> Assertions.assertNotEquals(b, a)
        );

        Assertions.assertAll(
                () -> Assertions.assertEquals(0, a.toPay),
                () -> Assertions.assertEquals(0, b.toPay)
        );
    }
}