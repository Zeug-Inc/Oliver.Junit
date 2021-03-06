package de.die_gfi.oliver.kw38.calculator;

import java.util.Objects;

public class MathExpression {
    int operandA;
    int operandB;
    char operator;

    public MathExpression(int opA, int opB, char oper) {
        operandA = opA;
        operandB = opB;
        operator = oper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathExpression elements = (MathExpression) o;
        return operandA == elements.operandA && operandB == elements.operandB && operator == elements.operator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operandA, operandB, operator);
    }
}