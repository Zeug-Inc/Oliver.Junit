package de.die_gfi.oliver.kw38.calculator;

public class Calculator {

    public static void main(String[] args) {




    }


    /**
     * Parse a string comprised of an operator and two operands
     *
     * @param line to parse
     * @return an Elements object or in case of parse error null
     */
    public MathExpression parse(String line) {

        line = line.replaceAll("\\s*", ""); // remove all white space

        String[] elements = line.split("[+*]");
        if (elements.length != 2) {  // We expected exactly two operands
            return null;
        }

        int operandA = Integer.parseInt(elements[0]);
        int operandB = Integer.parseInt(elements[1]);

        String op = line.replaceAll("\\d*", ""); // remove all digits
        if (op.length() > 1) {  // We expect exactly one operator
            return null;
        }
        char operator = op.charAt(0);
        return new MathExpression(operandA, operandB, operator);
    }

    public int evaluate(MathExpression expr) {

        return switch (expr.operator) {
            case '+' -> expr.operandA + expr.operandB;
            case '*' -> expr.operandA * expr.operandB;
            default -> 0;
        };
    }
}
