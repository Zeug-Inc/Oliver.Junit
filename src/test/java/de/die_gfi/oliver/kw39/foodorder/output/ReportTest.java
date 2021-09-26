package de.die_gfi.oliver.kw39.foodorder.output;

import de.die_gfi.oliver.kw39.foodorder.logic.OrderTest;
import de.die_gfi.oliver.kw39.foodorder.logic.WeeklyMenu;
import org.junit.jupiter.api.Test;

/** Input and Output are not tested via assertions.
 *  The test has to be done by visual inspection.
 */
class ReportTest {

    @Test
    void testPrintReport() {

        OrderTest t = new OrderTest();
        WeeklyMenu w = t.getW();
        Report r = new Report(w);

        r.printKitchenReport();

        r.printFinanceReport();

    }

}