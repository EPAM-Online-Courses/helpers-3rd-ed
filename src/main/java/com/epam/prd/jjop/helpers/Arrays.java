package com.epam.prd.jjop.helpers;

import static java.util.Arrays.fill;

/**
 * Demonstrates fill and setAll static methods from {@link java.util.Arrays} helper class
 *
 * @author Jovhar Isayev
 */
class Arrays {
    /**
     * Wraps {@link java.util.Arrays#fill(Object[], Object)} for demonstration.<br/>
     * Picked this signature due to the use of the generics.<br/>
     * Other use cases of fill method includes:
     * <ul>
     *     <li>
     *          {@link java.util.Arrays#fill(byte[], byte)} - replaces elements of byte array with given byte type value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(short[], short)} - replaces elements of short array with given short value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(int[], int)} - replaces elements of int array with given int value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(long[], long)} - replaces elements of long array with given long value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(float[], float)} - replaces elements of float array with given float value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(double[], double)} - replaces elements of double array with given double value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(char[], char)} - replaces elements of char array with given char value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(boolean[], boolean)} - replaces elements of boolean array with given boolean value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(Object[], Object)} - replaces elements of object array with given object value
     *     </li>
     * </ul>
     *
     * @param arr   array which its elements will be replaced with value argument
     * @param value to replace elements of given array with
     * @since Java 7.0
     */
    private static <T> void demonstrateFillToReplaceAllElementsWithGivenElement(T[] arr, T value) {
        fill(arr, value);

        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5};
        Boolean[] boolArr = new Boolean[]{true, true, true};

        demonstrateFillToReplaceAllElementsWithGivenElement(intArr, 100);
        demonstrateFillToReplaceAllElementsWithGivenElement(boolArr, false);
    }
}
