package de.die_gfi.oliver.kw39.foodorder;

import java.util.ArrayList;

public class WeeklyMenu {

    enum Dish {
        DISHA(0), DISHB(1);

        Dish(int i) {
        }
    }

    enum Day {
        MON(0), TUE(1), WED(2), THU(3), FRI(4);

        Day(int i) {
        }
    }

    ArrayList<Meal> mon;
    ArrayList<Meal> tue;
    ArrayList<Meal> wed;
    ArrayList<Meal> thu;
    ArrayList<Meal> fri;

    Integer[] orderCount = new Integer[5];

    /**
     * @param mon choice of meals for Monday
     * @param tue choice of meals for Tuesday
     * @param wed choice of meals for Wednesday
     * @param thu choice of meals for Thursday
     * @param fri choice of meals for Friday
     */
    public WeeklyMenu(ArrayList<Meal> mon, ArrayList<Meal> tue, ArrayList<Meal> wed, ArrayList<Meal> thu, ArrayList<Meal> fri) {
        this.mon = mon;
        this.tue = tue;
        this.wed = wed;
        this.thu = thu;
        this.fri = fri;
    }

    /**
     * @param p   Person ordering the meal
     * @param mon choice for Monday, where 0 is no selection, 1 dish A, 2 dish B
     * @param tue choice for Tuesday
     * @param wed choice for Wednesday
     * @param thu choice for Thursday
     * @param fri choice for Friday
     */
    public void orderMeal(Person p, int mon, int tue, int wed, int thu, int fri) {

        if (mon != 0) {
            Meal m = this.mon.get(mon - 1);
            m.count++;
            p.toPay += m.price;
        }
        if (tue != 0) {
            Meal m = this.tue.get(tue - 1);
            m.count++;
            p.toPay += m.price;
        }
        if (wed != 0) {
            Meal m = this.wed.get(wed - 1);
            m.count++;
            p.toPay += m.price;
        }
        if (thu != 0) {
            Meal m = this.thu.get(thu - 1);
            m.count++;
            p.toPay += m.price;
        }
        if (fri != 0) {
            Meal m = this.fri.get(fri - 1);
            m.count++;
            p.toPay += m.price;
        }

    }

    public int getCount(Day i, Dish choice) {

        return switch (i) {

            case MON -> this.mon.get(choice.ordinal()).count;
            case TUE -> this.tue.get(choice.ordinal()).count;
            case WED -> this.wed.get(choice.ordinal()).count;
            case THU -> this.thu.get(choice.ordinal()).count;
            case FRI -> this.fri.get(choice.ordinal()).count;

        };

    }
}
