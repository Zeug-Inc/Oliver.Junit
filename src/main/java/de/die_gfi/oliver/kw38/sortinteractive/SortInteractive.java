package de.die_gfi.oliver.kw38.sortinteractive;

import java.util.Arrays;
import java.util.Scanner;

public class SortInteractive {

    // Input / Ouput Code
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Namen ein: ");
        String s = scanner.nextLine();

        String[] names = extractNames(s);
        if (names != null) {
            String sorted = createOutputString(sortNames(names));
            System.out.println("Sortiert: " + sorted);
        } else {
            System.out.println("You did not enter any names. Terminating program");
        }

    }

    // Program logic


    /**
     * Parses the text line and returns an array containing the names
     * @param line containing the names, separated by space, tab or other white space
     * @return an array with elements containg the names or null if no name was entered
     */
    public static String[] extractNames(String line) {

        line = line.replaceAll("^\\h+", ""); // remove leading white space
        String[] array = line.split("\\h+"); // split, treating multiple white space characters as one

        if ((array.length ==1) && (array[0].equals(""))){
            return null; // Special case where user did not input any sensible data
        }

        return array;

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
