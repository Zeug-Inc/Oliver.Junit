package de.die_gfi.oliver.playground;

import de.die_gfi.oliver.kw38.sortinteractive.SortInteractive;

import java.util.Arrays;

public class StringGames {

    public static void main(String[] args) {

    String input = "fjslkfjf99jkljlk8454jlkjljl545ljkj5454jljljj555";
            // "Peter, Franz,             Verena,Sophia";
    String[] words = input.split("[01]");
    System.out.println("'" + input + "'" + " --> " + Arrays.toString(words));



    }

    private static void extracted1() {
        String[]  array1 =  SortInteractive.extractNames("\t\t");
        if ( array1 != null) {
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
