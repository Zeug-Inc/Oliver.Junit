package de.die_gfi.oliver.kw39.foodorder.logic;

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

    public ArrayList<Meal> getMon() {
        return mon;
    }

    public ArrayList<Meal> getTue() {
        return tue;
    }

    public ArrayList<Meal> getWed() {
        return wed;
    }

    public ArrayList<Meal> getThu() {
        return thu;
    }

    public ArrayList<Meal> getFri() {
        return fri;
    }

    ArrayList<Meal> mon;
    ArrayList<Meal> tue;
    ArrayList<Meal> wed;
    ArrayList<Meal> thu;
    ArrayList<Meal> fri;

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
    public void orderMeal(Person p, Meal mon, Meal tue, Meal wed, Meal thu, Meal fri) {

        if (mon != null) {
            mon.count++;
            p.toPay += mon.price;
            p.makeOrder(mon);
        }
        if (tue != null) {
            tue.count++;
            p.toPay += tue.price;
            p.makeOrder(tue);
        }
        if (wed != null) {
            wed.count++;
            p.toPay += wed.price;
            p.makeOrder(wed);
        }
        if (thu != null) {
            thu.count++;
            p.toPay += thu.price;
            p.makeOrder(thu);
        }
        if (fri != null) {
            fri.count++;
            p.toPay += fri.price;
            p.makeOrder(fri);
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
