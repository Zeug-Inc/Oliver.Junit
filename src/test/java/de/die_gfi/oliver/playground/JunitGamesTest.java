package de.die_gfi.oliver.playground;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class JunitGamesTest {


    /** This test only runs on Linux
     */
    @Test
    void doSomethingLinuxStyle() {

        Assumptions.assumeTrue(
                System.getProperty("os.name").toLowerCase().startsWith("linux")
        );

        System.out.println("We are on Linux :-)");
        // open KDE

    }

    /** This test only runs on Linux
     */
    @Test
    void doSomethingMacStyle() {

        Assumptions.assumeTrue(System.getProperty("os.name").toLowerCase().startsWith("mac"));

        System.out.println("We are on Mac :-)))");
        // open Finder

    }

    /** This test runs only on Windows machines */
    @Test
    void doSomethingWindowsStyle() {

        Assumptions.assumeTrue(System.getProperty("os.name").toLowerCase().startsWith("windows"));

        System.out.println("We are on Windows.");
        // open Windows Explorer

    }
}