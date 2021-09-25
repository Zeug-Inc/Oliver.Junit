package de.die_gfi.oliver.kw39.foodorder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    void testOrder() {

        WeeklyMenu w = WeeklyMenuTest.createMenu();

        Person p1 = new Person("Franz", "Meier");
        Person p2 = new Person("Susanne", "Müller");
        Person p3 = new Person("Peter", "Roth");

        Assertions.assertAll(
                () -> Assertions.assertEquals(0, p1.toPay),
                () -> Assertions.assertEquals(0, p2.toPay),
                () -> Assertions.assertEquals(0, p3.toPay)
        );

        w.orderMeal(p1, 1, 0, 2, 1, 2); // Prices: 5 0 4 12 5 = 26
        w.orderMeal(p2, 1, 0, 1, 1, 1); // Prices: 5 0 7 12 14 = 38
        w.orderMeal(p3, 2, 2, 2, 2, 0); // Prices: 4 4 4 5 0 = 17

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