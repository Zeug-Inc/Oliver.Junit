package de.die_gfi.oliver.kw38.sortinteractive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortInteractiveTest {

    @Test
    void testExtractNames() {

        Assertions.assertAll(
                () -> Assertions.assertArrayEquals(new String[]{"Peter", "Andreas"},
                        SortInteractive.extractNames("   Peter     Andreas    ")),
                () -> Assertions.assertArrayEquals(new String[]{"Peter", "Franz", "Anja"},
                        SortInteractive.extractNames("Peter Franz Anja")),
                () -> Assertions.assertArrayEquals(new String[]{"Peter", "Andreas"},
                        SortInteractive.extractNames("           Peter      Andreas    ")),
                () -> Assertions.assertArrayEquals(new String[]{"Peter", "Andreas", "Verena", "Simona", "Franz"},
                        SortInteractive.extractNames("\t\tPeter\t\t  \tAndreas\t\tVerena\t Simona\tFranz    ")),
                () -> Assertions.assertNull(SortInteractive.extractNames("\t\t")),
                () -> Assertions.assertNull(SortInteractive.extractNames(""))

        );
    }

    @Test
    void testSortNames() {
        Assertions.assertAll(
                () -> Assertions.assertArrayEquals(new String[]{"Anja", "Franz", "Peter"},
                        SortInteractive.sortNames(new String[]{"Peter", "Franz", "Anja"})),
                () -> Assertions.assertArrayEquals(new String[]{"Anja", "Anja", "Franz", "Peter"},  // Test for duplicate names
                        SortInteractive.sortNames(new String[]{"Anja", "Peter", "Franz", "Anja"}))
        );
    }

    @Test
    void testCreateOutputString() {

        Assertions.assertEquals("Anja, Franz, Peter", SortInteractive.createOutputString(new String[]{"Anja", "Franz", "Peter"}));
    }
}