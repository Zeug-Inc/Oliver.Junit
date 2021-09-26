package de.die_gfi.oliver.kw39.foodorder.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest {

    WeeklyMenu weeklyMenu;

    Person p1;
    Person p2;
    Person p3;

    public OrderTest() {

        weeklyMenu = WeeklyMenuTest.createMenu();

        p1 = new Person("Franz", "Meier");
        p2 = new Person("Susanne", "Müller");
        p3 = new Person("Peter", "Roth");

        weeklyMenu.orderMeal(p1, weeklyMenu.getMon().get(0), null, weeklyMenu.getWed().get(1), weeklyMenu.getThu().get(0), weeklyMenu.getFri().get(1)); // Prices: 5 0 4 12 5 = 26
        weeklyMenu.orderMeal(p2, weeklyMenu.getMon().get(0), null, weeklyMenu.getWed().get(0), weeklyMenu.getThu().get(0), weeklyMenu.getFri().get(0)); // Prices: 5 0 4 12 5 = 26
        weeklyMenu.orderMeal(p3, weeklyMenu.getMon().get(1), weeklyMenu.getTue().get(1), weeklyMenu.getWed().get(1), weeklyMenu.getThu().get(1), null); // Prices: 5 0 4 12 5 = 26

    }

    public WeeklyMenu getWeeklyMenu() {
        return weeklyMenu;
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
                () -> Assertions.assertEquals(2, weeklyMenu.getCount(WeeklyMenu.Day.MON, WeeklyMenu.Dish.DISHA)),
                () -> Assertions.assertEquals(1, weeklyMenu.getCount(WeeklyMenu.Day.MON, WeeklyMenu.Dish.DISHB)),
                () -> Assertions.assertEquals(0, weeklyMenu.getCount(WeeklyMenu.Day.TUE, WeeklyMenu.Dish.DISHA)),
                () -> Assertions.assertEquals(1, weeklyMenu.getCount(WeeklyMenu.Day.TUE, WeeklyMenu.Dish.DISHB)),
                () -> Assertions.assertEquals(1, weeklyMenu.getCount(WeeklyMenu.Day.WED, WeeklyMenu.Dish.DISHA)),
                () -> Assertions.assertEquals(2, weeklyMenu.getCount(WeeklyMenu.Day.WED, WeeklyMenu.Dish.DISHB)),
                () -> Assertions.assertEquals(2, weeklyMenu.getCount(WeeklyMenu.Day.THU, WeeklyMenu.Dish.DISHA)),
                () -> Assertions.assertEquals(1, weeklyMenu.getCount(WeeklyMenu.Day.THU, WeeklyMenu.Dish.DISHB)),
                () -> Assertions.assertEquals(1, weeklyMenu.getCount(WeeklyMenu.Day.FRI, WeeklyMenu.Dish.DISHA)),
                () -> Assertions.assertEquals(1, weeklyMenu.getCount(WeeklyMenu.Day.FRI, WeeklyMenu.Dish.DISHB))
        );

        Assertions.assertAll(
                () -> Assertions.assertEquals(26, p1.toPay),
                () -> Assertions.assertEquals(38, p2.toPay),
                () -> Assertions.assertEquals(17, p3.toPay)
        );


    }



}