package de.die_gfi.oliver.kw38.sortinteractive;

import java.util.Arrays;
import java.util.Scanner;

public class SortInteractive {

    // Input / Ouput Code
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String sorted = createOutputString(sortNames(extractNames(s)));
        System.out.println("Sortiert: " + sorted);
    }

    // Program logic
    public static String[] extractNames(String line) {

        return line.split(" ");

    }

    public static String[] sortNames(String[] names) {

        String[] temp = names.clone();
        Arrays.sort(temp);
        return temp;
    }

    public static String createOutputString(String[] tokens) {

        StringBuilder temp = new StringBuilder();
        for (String s : tokens) {
            temp.append(s).append(", ");
        }

        return temp.substring(0, temp.length() - 2);
    }
}
