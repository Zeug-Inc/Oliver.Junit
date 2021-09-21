package de.die_gfi.oliver.kw38.binarysorter;

public class BinarySorter {

    /**
     * Converts a string from binary (encoded with '0' and '1') to decimal.
     *
     * @param binary value that is converted to decimal
     * @return value >= 0 if success
     * -1 in case of error
     */


    public static int binaryToDec(String binary) {

        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            result = (result << 1) + ((int) binary.charAt(i) - (int) '0');
        }

        return result;
    }

    public static String[] sortBinaryStrings(String[] toSort) {

        int[] arr = new int[toSort.length];
        for (int i = 0; i < toSort.length; i++) {
            arr[i] = binaryToDec(toSort[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        String[] result = new String[toSort.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.toBinaryString(arr[i]);
        }
        return result;
    }

}
