package de.die_gfi.oliver.playground;

import java.util.Locale;

public class JunitGames {

    public static void main(String[] args) {

        doSomethingSystemDependent();
    }


    static void doSomethingSystemDependent() {

        String propertyOS = System.getProperty("os.name");

        if (propertyOS.toLowerCase().startsWith("mac")) {

            doSomethingMacStyle();

        }

        if (propertyOS.toLowerCase().startsWith("windows")) {

            doSomethingWindowsStyle();
        }

        if (propertyOS.toLowerCase().startsWith("linux")) {

            doSomethingLinuxStyle();

        }



    }

    private static void doSomethingLinuxStyle() {

        System.out.println("---------------------------------");
        System.out.println("Do something in the Linux fashion");
        System.out.println("---------------------------------");

    }

    private static void doSomethingWindowsStyle() {

        System.out.println("-----------------------------------");
        System.out.println("Do something in the Windows fashion");
        System.out.println("-----------------------------------");

    }

    private static void doSomethingMacStyle() {

        System.out.println("-------------------------------");
        System.out.println("Do something in the Mac fashion");
        System.out.println("-------------------------------");

    }

}
