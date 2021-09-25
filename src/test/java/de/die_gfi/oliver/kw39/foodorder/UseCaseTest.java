package de.die_gfi.oliver.kw39.foodorder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class UseCaseTest {

    @Test
    void testUseCase() {

        // Create Persons
        Person a = new Person("Andreas", "Meier");
        Person b = new Person("Peter", "Müller");

        Person c = new Person("Hans", "Schmidt");
        Person d = new Person("Ingrid", "Schuster");
        Person e = new Person("Rupert", "Müller");


        // Create groups
        Group azubis = new Group("Azubis", new ArrayList<>(Arrays.asList(a, b)));
        Group seminarleiter = new Group("Seminarleiter", new ArrayList<>(Arrays.asList(c, d, e)));

        // Create Menu

        WeeklyMenu m = WeeklyMenuTest.createMenu();

        // Print  list for each group

        // printOrders(azubis);
        // printOrders(seminarleiter);

        // Have persons select their menu

        // Print list of ordered meals (allowing the cook to buy ingredients)

        // Print list of costs to pay for each person


    }



}
