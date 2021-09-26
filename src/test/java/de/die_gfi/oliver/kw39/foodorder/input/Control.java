package de.die_gfi.oliver.kw39.foodorder.input;

// TODO Implement the control (text-based) user interface

import de.die_gfi.oliver.kw39.foodorder.logic.Person;

import java.util.Scanner;

public class Control {


    public static void main(String[] args) {

        // The control needs to be able to invoke (all?) the public methods from the logic package

        Scanner scanner = new Scanner(System.in);

        // Functions for the person
        // - Create / select a person

        System.out.println("Enter first name(s):");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name(s):");
        String lastName = scanner.nextLine();

        Person p = new Person(firstName,lastName);



        System.out.println("The current menu is");


        // - Print individual report

        // Functions for the kitchen
        // - print report
        // - change menu (phase 2)
    }


}
