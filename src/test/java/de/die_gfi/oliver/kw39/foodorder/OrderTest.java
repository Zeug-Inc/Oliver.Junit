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

                Assertions.assertEquals(0, p1.toPay);
                Assertions.assertEquals(0, p2.toPay);
                Assertions.assertEquals(0, p3.toPay);

                w.orderMeal(p1, 1,0,2,1,2);
                w.orderMeal(p2, 1,0,1,1,1);
                w.orderMeal(p3, 2,2,2,2,0);

                // Number of orders per item:
                // Mon: A-2 B-1
                // Tue: A-0 B-1
                // Wed: A-1 B-2
                // Thu: A-2 B-1
                // Fri: A-1 B-2

                Assertions.assertEquals(2, w.getCount(WeeklyMenu.Day.MON, WeeklyMenu.Dish.DISHA));
                Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.MON, WeeklyMenu.Dish.DISHB));

                Assertions.assertEquals(0, w.getCount(WeeklyMenu.Day.TUE, WeeklyMenu.Dish.DISHA));
                Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.TUE, WeeklyMenu.Dish.DISHB));

                Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.WED, WeeklyMenu.Dish.DISHA));
                Assertions.assertEquals(2, w.getCount(WeeklyMenu.Day.WED, WeeklyMenu.Dish.DISHB));

                Assertions.assertEquals(2, w.getCount(WeeklyMenu.Day.THU, WeeklyMenu.Dish.DISHA));
                Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.THU, WeeklyMenu.Dish.DISHB));

                Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.FRI, WeeklyMenu.Dish.DISHA));
                Assertions.assertEquals(1, w.getCount(WeeklyMenu.Day.FRI, WeeklyMenu.Dish.DISHB));


                Assertions.assertTrue( p1.toPay > 0);
                Assertions.assertTrue( p2.toPay > 0);
                Assertions.assertTrue( p3.toPay > 0);



        }
}