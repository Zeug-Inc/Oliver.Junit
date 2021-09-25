package de.die_gfi.oliver.kw39.foodorder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WeeklyMenuTest {


    @Test
    void testWeeklyMenu() {

        ArrayList<String> mon =  new ArrayList(Arrays.asList("Jägerschnitzel", "Gemüsepfanne"));
        ArrayList<String> tue =  new ArrayList(Arrays.asList("Osso Buco", "Champignons"));
        ArrayList<String> wed =  new ArrayList(Arrays.asList("Schnitzel", "Penne al Arrabbiata"));
        ArrayList<String> thu =  new ArrayList(Arrays.asList("Wiener Schnitzel", "Spaghetti"));
        ArrayList<String> fri =  new ArrayList(Arrays.asList("Forelle", "Tortellini"));

        System.out.println(mon);
        System.out.println(tue);

        WeeklyMenu w = new WeeklyMenu(mon, tue, wed, thu, fri);

    }


}
