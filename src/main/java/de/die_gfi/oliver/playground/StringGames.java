package de.die_gfi.oliver.playground;

import de.die_gfi.oliver.kw38.sortinteractive.SortInteractive;

import java.util.Arrays;
import java.util.Map;

public class StringGames {

    public static void main(String[] args) {

        Map<String, String> environment = System.getenv();
        String shell = environment.get("SHELL");
        System.out.println("Shell = '" + shell + "'");

        String propertyOS = System.getProperty("os.name");
        System.out.println("propertyOS = '" + propertyOS + "'");



    }

    private static void extracted1() {
        String[] array1 = SortInteractive.extractNames("\t\t");
        if (array1 != null) {
            System.out.println("length=" + array1.length);
            System.out.println(Arrays.toString(array1));
            System.out.println("'" + array1[0] + "'");
        }
    }

    private static void extracted() {

        String line = "           ABCD     E";
        line = line.replaceAll("^\\h+", ""); // remove leading white space
        System.out.println("'" + line + "'");

        String line2 = "A   C   D";
        String[] array = line2.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
