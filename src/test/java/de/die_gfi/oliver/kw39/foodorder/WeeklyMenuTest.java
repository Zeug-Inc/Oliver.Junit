package de.die_gfi.oliver.kw39.foodorder;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WeeklyMenuTest {


    @Test
    void testWeeklyMenu() {

         WeeklyMenu w = createMenu();

    }

    public static WeeklyMenu createMenu() {

        Meal m1 = new Meal("Jägerschnitzel", 5);
        Meal m2 = new Meal("Gemüsepfanne", 4);
        Meal m3 = new Meal("Osso Buco", 8);
        Meal m4 = new Meal("Champignons", 4);
        Meal m5 = new Meal("Schnitzel", 7);
        Meal m6 = new Meal("Penne al Arrabbiata", 4);
        Meal m7 = new Meal("Wiener Schnitzel", 12);
        Meal m8 = new Meal("Spaghetti", 5);
        Meal m9 = new Meal("Forelle", 14);
        Meal m10 = new Meal("Tortellini", 5);

        ArrayList<Meal> mon = new ArrayList<>(Arrays.asList(m1, m2));
        ArrayList<Meal> tue = new ArrayList<>(Arrays.asList(m3, m4));
        ArrayList<Meal> wed = new ArrayList<>(Arrays.asList(m5, m6));
        ArrayList<Meal> thu = new ArrayList<>(Arrays.asList(m7, m8));
        ArrayList<Meal> fri = new ArrayList<>(Arrays.asList(m9, m10));

        return new WeeklyMenu(mon, tue, wed, thu, fri);
    }

}
