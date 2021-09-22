package de.die_gfi.oliver.kw38.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testParseString() {

        Calculator calc = new Calculator();
        Assertions.assertAll(
                () -> Assertions.assertEquals(new MathExpression(1, 2, '+'), calc.parse("1+2")),
                () -> Assertions.assertEquals(new MathExpression(3, 4, '+'), calc.parse("3+4")),
                () -> Assertions.assertEquals(new MathExpression(7, 8, '*'), calc.parse("7*8")),
                () -> Assertions.assertEquals(new MathExpression(5, 5, '*'), calc.parse("  5 * 5 ")),
                // Detect invalid strings
                () -> assertNull(calc.parse("  5 - 5 ")),
                () -> assertNull(calc.parse("  5 --- 5 ")),
                () -> assertNull(calc.parse(""))
        );
    }

    @Test
    void testEvaluate() {

        Calculator calc = new Calculator();
        Assertions.assertEquals(3, calc.evaluate(new MathExpression(1, 2, '+')));
        Assertions.assertEquals(7, calc.evaluate(new MathExpression(1, 7, '*')));
    }
}