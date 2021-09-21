package de.die_gfi.oliver.kw38.sortinteractive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortInteractiveTest {

    @Test
    void testExtractNames() {
        Assertions.assertArrayEquals(new String[]{"Peter", "Franz", "Anja"}, SortInteractive.extractNames("Peter Franz Anja"));
    }

    @Test
    void testSortNames() {
        Assertions.assertArrayEquals(new String[]{"Anja", "Franz", "Peter"}, SortInteractive.sortNames(new String[]{"Peter", "Franz", "Anja"}));
    }

    @Test
    void testCreateOutputString() {

        Assertions.assertEquals("Anja, Franz, Peter", SortInteractive.createOutputString(new String[]{"Anja", "Franz", "Peter"}));
    }
}