package de.die_gfi.oliver.playground;

public class ExplainStatic {

    int attribute;

    static int staticVariable = 32;

    ExplainStatic(int param) {
        attribute = param;
    }

    void printVariables() {

        System.out.println("attribute = " + attribute);
        System.out.println("staticVariable = " + staticVariable);
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("\n\n\n--------------------------");

        ExplainStatic o4 = new ExplainStatic(4);
        o4.printVariables();
        staticVariable++;

        ExplainStatic o7 = new ExplainStatic(7);
        o7.printVariables();
        staticVariable++;

        ExplainStatic o9 = new ExplainStatic(9);
        o9.printVariables();
        staticVariable++;

        System.out.println("staticVariable = " + staticVariable);

        System.out.println("\n\n\n--------------------------\n\n\n");
    }

}
