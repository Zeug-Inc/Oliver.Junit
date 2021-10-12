package de.die_gfi.oliver.kw39.foodorder.logic;

import org.junit.jupiter.api.*;

public class ShowTest {

    int counter = 0;

    Person p;
    Person q;

    static int countExecutedTest = 0;

    static Object o;

    @BeforeAll
    static void beforeAll() {

        System.out.println("-- beforeAll() -- ");
        System.out.println("Log into data base");
        o = new Object();

    }

    @AfterAll
    static void afterAll() {

        System.out.println("Ausgeführte Tests: " + countExecutedTest);

        System.out.println("Log out of data base");
    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        countExecutedTest++;
    }

    ShowTest() {

        System.out.println("\nShowTest() " + this);

    }

    @Test
    void testA() {

        System.out.println("testA : vor Inkrement " + counter);
        counter += 4;
        System.out.println(o);
        System.out.println("testA : nach Inkrement " + counter + "\n\n");

    }

    @Test
    void testB() {

        System.out.println("testB : vor Inkrement " + counter);
        counter += 2;
        System.out.println(o);
        System.out.println("testB : nach Inkrement " + counter + "\n\n");
    }

}

