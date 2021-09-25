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
        Group azubis = new Group("Azubis", new Person[]{a,b});
        Group seminarleiter = new Group("Seminarleiter", new Person[]{c,d,e});

        // Create Menu
        ArrayList<String> mon =  new ArrayList(Arrays.asList("Jägerschnitzel", "Gemüsepfanne"));
        ArrayList<String> tue =  new ArrayList(Arrays.asList("Osso Buco", "Champignons"));
        ArrayList<String> wed =  new ArrayList(Arrays.asList("Schnitzel", "Penne al Arrabbiata"));
        ArrayList<String> thu =  new ArrayList(Arrays.asList("Wiener Schnitzel", "Spaghetti"));
        ArrayList<String> fri =  new ArrayList(Arrays.asList("Forelle", "Tortellini"));

        WeeklyMenu m = new WeeklyMenu(mon, tue, wed, thu, fri);

        // Print  list for each group

        // printOrders(azubis);
        // printOrders(seminarleiter);

        // Have persons select their menu

        // Print list of ordered meals (allowing the cook to buy ingredients)

        // Print list of costs to pay for each person


    }



}
