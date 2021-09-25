package de.die_gfi.oliver.kw39.foodorder;

import de.die_gfi.oliver.kw39.foodorder.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderMealsTest {

        @Test
        void testNewPerson() {

                Person a = new Person("Franz", "Meier");
                Assertions.assertEquals(a, new Person("Franz", "Meier"));

        }
}