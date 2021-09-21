package de.die_gfi.oliver.kw38.binarysorter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinarySorterTest {

    @Test
    @DisplayName("Conversion from binary string to decimal integer")
    void binaryToDec() {

        Assertions.assertAll(() -> Assertions.assertEquals(0, BinarySorter.binaryToDec("000")),
                () -> Assertions.assertEquals(1, BinarySorter.binaryToDec("1")),
                () -> Assertions.assertEquals(2, BinarySorter.binaryToDec("10")),
                () -> Assertions.assertEquals(6, BinarySorter.binaryToDec("0110")),
                () -> Assertions.assertEquals(7, BinarySorter.binaryToDec("111")),
                () -> Assertions.assertEquals(0, BinarySorter.binaryToDec("")),
                () -> Assertions.assertEquals(3, BinarySorter.binaryToDec("0011")));
    }

    @Test
    @DisplayName("Sorting of binary strings")
    void sortBinaryStrings() {

        Assertions.assertAll(
                () -> Assertions.assertArrayEquals(new String[]{"0", "1", "10", "11", "100"}, BinarySorter.sortBinaryStrings(new String[]{"0", "1", "10", "11", "100"})),
                () -> Assertions.assertArrayEquals(new String[]{"1", "1", "1"}, BinarySorter.sortBinaryStrings(new String[]{"1", "1", "1"})),
                () -> Assertions.assertArrayEquals(new String[]{"0", "10", "11", "11", "1101"}, BinarySorter.sortBinaryStrings(new String[]{"0", "11", "1101", "10", "11"})),
                () -> Assertions.assertArrayEquals(new String[]{"0", "1", "10", "11", "100", "101", "110"}, BinarySorter.sortBinaryStrings(new String[]{"0110", "101", "100", "11", "10", "1", "0"})),
                () -> Assertions.assertArrayEquals(new String[]{"1"}, BinarySorter.sortBinaryStrings(new String[]{"1"})),
                () -> Assertions.assertArrayEquals(new String[]{}, BinarySorter.sortBinaryStrings(new String[]{})),
                () -> Assertions.assertArrayEquals(new String[]{"0", "11", "11", "11", "11"}, BinarySorter.sortBinaryStrings(new String[]{"11", "11", "0", "11", "11"})),
                () -> Assertions.assertArrayEquals(new String[]{"1", "10", "11"}, BinarySorter.sortBinaryStrings(new String[]{"11", "10", "1"})),
                () -> Assertions.assertArrayEquals(new String[]{"0", "11", "111"}, BinarySorter.sortBinaryStrings(new String[]{"11", "111", ""})),
                () -> Assertions.assertArrayEquals(new String[]{"0", "0", "0"}, BinarySorter.sortBinaryStrings(new String[]{"0000", "0", "000"})));


    }
}