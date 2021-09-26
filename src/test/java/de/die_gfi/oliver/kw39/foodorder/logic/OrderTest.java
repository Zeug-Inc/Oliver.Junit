package de.die_gfi.oliver.kw39.foodorder.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest {

    WeeklyMenu w;

    Person p1;
    Person p2;
    Person p3;

    public OrderTest() {

        w = WeeklyMenuTest.createMenu();

        p1 = new Person("Franz", "Meier");
        p2 = new Person("Susanne", "Müller");
        p3 = new Person("Peter", "Roth");

        w.orderMeal(p1, w.getMon().get(0), null, w.getWed().get(1), w.getThu().get(0), w.getFri().get(1)); // Prices: 5 0 4 12 5 = 26
        w.orderMeal(p2, w.getMon().get(0), null, w.getWed().get(0), w.getThu().get(0), w.getFri().get(0)); // Prices: 5 0 4 12 5 = 26
        w.orderMeal(p3, w.getMon().get(1), w.getTue().get(1), w.getWed().get(1), w.getThu().get(1), null); // Prices: 5 0 4 12 5 = 26

    }

    public WeeklyMenu getW() {
        return w;
    }

    @Test
    void testOrder() {

        // Number of orders per item:
        // Mon: A-2 B-1
        // Tue: A-0 B-1
        // Wed: A-1 B-2
        // Thu: A-2 B-1
        // Fri: A-1 B-2

        // Check number of ordered meals
        Assertions.assertAll(
                () -> Assertions.assertEquals(2, w.getCount(WeeklyMenu.Day.MON, WeeklyMenu.Dish.DISHA)),
                () -> Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.MON, WeeklyMenu.Dish.DISHB)),
                () -> Assertions.assertEquals(0, w.getCount(WeeklyMenu.Day.TUE, WeeklyMenu.Dish.DISHA)),
                () -> Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.TUE, WeeklyMenu.Dish.DISHB)),
                () -> Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.WED, WeeklyMenu.Dish.DISHA)),
                () -> Assertions.assertEquals(2, w.getCount(WeeklyMenu.Day.WED, WeeklyMenu.Dish.DISHB)),
                () -> Assertions.assertEquals(2, w.getCount(WeeklyMenu.Day.THU, WeeklyMenu.Dish.DISHA)),
                () -> Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.THU, WeeklyMenu.Dish.DISHB)),
                () -> Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.FRI, WeeklyMenu.Dish.DISHA)),
                () -> Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.FRI, WeeklyMenu.Dish.DISHB))
        );

        Assertions.assertAll(
                () -> Assertions.assertEquals(26, p1.toPay),
                () -> Assertions.assertEquals(38, p2.toPay),
                () -> Assertions.assertEquals(17, p3.toPay)
        );


    }



}