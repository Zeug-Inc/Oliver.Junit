package de.die_gfi.oliver.kw39.foodorder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupTest {

    @Test
    void testGroup() {

        Person a = new Person("Peter", "Meier");
        Person b = new Person("Petra", "Müller");
        Person c = new Person("Verena", "Schmidt");

        Group g = new Group("Seminarleiter", new ArrayList<>(Arrays.asList(a, b, c)));

        Person d = new Person("Maria Concetta", "Rossi");
        Assertions.assertFalse(g.contains(d));
        g.addMember(d);
        Assertions.assertTrue(g.contains(d));
    }



}
