package de.die_gfi.oliver.kw39.foodorder;

import de.die_gfi.oliver.kw39.foodorder.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderTest {

        @Test
        void testNewPerson() {

                Person a = new Person("Franz", "Meier");
                Assertions.assertEquals(a, new Person("Franz", "Meier"));

                Orders.orderMeal(a, null, 1 /* Option 1 on Monday */, 0 /* no order on Tuesday */, 2, 1, 2);


        }
}