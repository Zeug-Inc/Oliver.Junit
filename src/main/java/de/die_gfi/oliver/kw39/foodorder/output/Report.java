package de.die_gfi.oliver.kw39.foodorder.output;

import de.die_gfi.oliver.kw39.foodorder.logic.Meal;
import de.die_gfi.oliver.kw39.foodorder.logic.Person;
import de.die_gfi.oliver.kw39.foodorder.logic.WeeklyMenu;

import java.awt.*;
import java.util.ArrayList;

public class Report {

    WeeklyMenu w;

    public Report(WeeklyMenu weeklyMenu) {
        this.w = weeklyMenu;
    }

    /**
     * Prints a report for the kitchen listing the number of all ordered menus by day
     */
    public void printKitchenReport() {

        System.out.println();
        System.out.println("----------------------");
        System.out.println("*** Kitchen Report ***");
        System.out.println("----------------------");
        System.out.println();

        System.out.println("-- Monday --");
        for (Meal m : w.getMon()) {
            System.out.println(m);
        }
        System.out.println();

        System.out.println("-- Tuesday --");
        for (Meal m : w.getTue()) {
            System.out.println(m);
        }
        System.out.println();

        System.out.println("-- Wednesday --");
        for (Meal m : w.getWed()) {
            System.out.println(m);
        }
        System.out.println();

        System.out.println("-- Thursday --");
        for (Meal m : w.getThu()) {
            System.out.println(m);
        }
        System.out.println();

        System.out.println("-- Friday --");
        for (Meal m : w.getFri()) {
            System.out.println(m);
        }
        System.out.println();

    }

    /**
     * Creates a report for use by the finance department used to bill the ordered meals to each person
     */
    public void printFinanceReport() {

        System.out.println();
        System.out.println("------------------------");
        System.out.println("*** Financial Report ***");
        System.out.println("------------------------");
        System.out.println();

        ArrayList<Person> everybody = Person.getEverybody();

        for (Person p : everybody) {
            System.out.println(p);
            System.out.println();
        }
        System.out.println();
    }


    public void printIndividualBills() {

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("*** Individual Bills Report ***");
        System.out.println("-------------------------------");
        System.out.println();

        ArrayList<Person> everybody = Person.getEverybody();

        for (Person p : everybody) {
            System.out.println("*** Bill for " + p.getFullName());
            for (Meal m : p.getOrders()) {
                System.out.printf("%-30s%10.2f\n", m.getDescription(), m.getPrice());
            }
            System.out.println("-".repeat(40));
            System.out.printf("%-30s%10.2f\n", "Sum to pay:", p.getToPay());
            System.out.println();
        }
        System.out.println();
    }
}
