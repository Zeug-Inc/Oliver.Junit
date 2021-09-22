package de.die_gfi.oliver.kw38.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testParseString() {

        Calculator c = new Calculator();
        Assertions.assertAll(
                () -> Assertions.assertEquals(new Elements(1, 2, '+'), c.parse("1+2")),
                () -> Assertions.assertEquals(new Elements(3, 4, '+'), c.parse("3+4")),
                () -> Assertions.assertEquals(new Elements(7, 8, '*'), c.parse("7*8")),
                () -> Assertions.assertEquals(new Elements(5, 5, '*'), c.parse("  5 * 5 ")),
                // Detect invalid strings
                () -> assertNull(c.parse("  5 - 5 ")),
                () -> assertNull(c.parse("  5 --- 5 ")),
                () -> assertNull(c.parse(""))
        );


    }
}