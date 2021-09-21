package de.die_gfi.oliver.kw38.binarysorter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySorterTest {

    @Test
    @DisplayName("Conversion from binary string to decimal integer")
    void binaryToDec() {

        Assertions.assertEquals(7, BinarySorter.binaryToDec("111"));
        Assertions.assertEquals(3, BinarySorter.binaryToDec("11"));
        Assertions.assertEquals(3, BinarySorter.binaryToDec("0011"));

        int[] a = {1,2,3};
        int[] b = {1,2,3};


        assertEquals(0, Arrays.compare(a, b));
        assertArrayEquals(a, b);
        Assertions.assertArrayEquals(a,b);





    }

    @Test
    @DisplayName("Sorting of binary strings")
    void sortBinaryStrings() {





    }
}