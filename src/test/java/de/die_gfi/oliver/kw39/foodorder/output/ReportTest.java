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

        Report r = new Report(new OrderTest().getWeeklyMenu());

        r.printKitchenReport();

        r.printFinanceReport();

        r.printIndividualBills();

    }

}