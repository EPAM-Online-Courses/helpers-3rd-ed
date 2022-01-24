package com.epam.prd.jjop.helpers.arrays;

import java.util.Arrays;

/**
 * Demonstrates possibilities of making copies of array by using static methods copyOf
 * and copyOfRange from {@link java.util.Arrays} helper class
 * Compares java.util.Arrays.copyOf vs java.util.Arrays.copyOfRange vs java.lang.System.arraycopy() methods
 *
 * @author Svetlana_Zubkova
 */
class Copy {

    public static void main(String[] args) {

        // Creates some arrays to copy
        int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] intsArray = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean[] booleansArray = {true, false, true, false, false, true};
        byte[] bytesArray = {4, 1, 8, 2, 2, 3, 16, 4, 4};
        char[] charsArray = {'a', 'e', 'i', 'o', 'u'};
        double[] doublesArray = {12, 3, 17, 5, 8, 17, 2, 37};
        float[] floatsArray = {4.12f, 7.3f, 8.17f, 1.5f, 7.8f, 4.17f, 3.2f, 6.37f};
        long[] longsArray = {4, 54, 56, 584, 51, 84, 5, 28, 33, 9};
        short[] shortsArray = {10, 8, 6, 4, 2, 0};
        String[] stringsArray = new String[]{"apple", "pie"};
        Number[] numbersArray = new Integer[]{1, 4};


        /**
         * Firstly lets look at  {@link java.lang.System#arraycopy(Object, int, Object, int, int)} method that
         * Copies an array from the specified source array, beginning at the specified position,
         * to the specified position of the destination array.
         * A subsequence of array components are copied from the source array referenced by <b>src/b>
         * to the destination array referenced by <b>dest</b>.
         * The number of components copied is equal to the length argument.
         * <p>Declaration method:</p>
         * public static void arraycopy(Object source_arr, int sourcePos, Object dest_arr, int destPos, int len)
         * @param source_arr - the source array.
         * @param sourcePos - starting position in the source array from where to copy.
         * @param dest_arr - array to be copied in.
         * @param destPos - starting position in the destination data, where to copy in.
         * @param len -the number of array elements to be copied.
         * Uses method java.lang.System.arraycopy() to copy part of Source array to Destination one.
         */
        //Prints source and destination arrays
        System.out.println("arraySource: " + Arrays.toString(arraySource));
        System.out.println("arrayDestination: "
                + Arrays.toString(arrayDestination));
        System.arraycopy(arraySource, 1, arrayDestination, 2, 3);
        System.out.println("arrayDestination after arrayCopy: "
                + Arrays.toString(arrayDestination));
        /**
         * Uses method java.lang.System.arraycopy() to copy Source array to Source array with overlapping areas
         */
        System.out.println("Before coping: " + Arrays.toString(intsArray));
        System.arraycopy(intsArray, 1, intsArray, 3, 3);
        System.out.println("After arraycopy: " + Arrays.toString(intsArray));

        /**
         * Secondly lets look at possibilities of java.util.Arrays.copyOf methods that
         * Copy the specified array, truncating or padding with the default values (if necessary) so the copy has the specified length.
         * <p>There are 8 overloaded types of java.util.Arrays.copyOf of primitive array
         * e.g. boolean, int, short, char, byte, long, float, and double as well as reference type array (see below).</p>
         * <b>Syntax</b>:
         * <p>copyOf(int[] original, int newLength)</p>
         * @param original – the array to be copied.
         * @param newLength – the length of the copy to be returned.
         * @throws NegativeArraySizeException if newLength is negative.
         * @throws NullPointerException if original is null.
         * @throws ArrayStoreException - if an element copied from original is not of a runtime type that can be stored in an array of class newType.
         * Arrays.copyOf methods for reference type array:
         * <ul>
         *    <li> {@link java.util.Arrays#copyOf(Object[], int)} - Copies the specified array, truncating or padding with null
         *          characters (if necessary) so the copy has the specified length.
         *    </li>
         *    <li> {@link java.util.Arrays#copyOf(Object[], int, Class)} - Copies the specified array, truncating or padding with null
         *         characters (if necessary) so the copy has the specified length.
         *    </li>
         *  </ul>
         * Prints copies of different types arrays
         * New array elements will be assigned from an existing value from an old array.
         * If the length of the new array is greater than the old array in such cases all remaining elements
         * will be assigned as zero or null.
         */

        boolean[] new_booleans = Arrays.copyOf(booleansArray, 6);
        System.out.println("New Boolean Array: " + Arrays.toString(new_booleans));
        byte[] new_bytes = Arrays.copyOf(bytesArray, 10);
        System.out.println("New Byte Array: " + Arrays.toString(new_bytes));
        char[] new_chars = Arrays.copyOf(charsArray, 7);
        System.out.println("New Char Array: " + Arrays.toString(new_chars));
        double[] new_doubles = Arrays.copyOf(doublesArray, 10);
        System.out.println("New Double Array: " + Arrays.toString(new_doubles));
        float[] new_floats = Arrays.copyOf(floatsArray, 10);
        System.out.println("New Boolean Array: " + Arrays.toString(new_floats));
        int[] new_ints = Arrays.copyOf(intsArray, 10);
        System.out.println("New Int Array: " + Arrays.toString(new_ints));
        long[] new_longs = Arrays.copyOf(longsArray, 12);
        System.out.println("New Long Array: " + Arrays.toString(new_longs));
        short[] new_shorts = Arrays.copyOf(shortsArray, 7);
        System.out.println("New Short Array: " + Arrays.toString(new_shorts));
        String[] new_strings = Arrays.copyOf(stringsArray, 5);
        System.out.println("New String Array: " + Arrays.toString(new_strings));
        Number[] new_numbers = Arrays.copyOf(numbersArray, 5, Number[].class);
        System.out.println("New Number[] Array: " + Arrays.toString(new_numbers));

        /**
         * Lets look at the difference between method java.lang.System.arraycopy() and java.util.Arrays.copyOf
         * Arrays.copyOf() creates a new array object when copying the element. System.arraycopy copies into an existing array.
         * If we read the source code of Arrays.copyOf() {@link <a> her="https://developer.classpath.org/doc/java/util/Arrays-source.html"</a>},
         * we can see that it uses System.arraycopy().
         * <p>java.util.Arrays.copyOf method doesn't allow to choose range for copy as it's possible in java.lang.System.arraycopy().</p>
         */
        int[] arr = {1, 2, 3, 4, 5};
        int[] copied = new int[10];
        System.arraycopy(arr, 0, copied, 1, 5);//5 is the length to copy
        System.out.println("Array after using System.arraycopy method" + Arrays.toString(copied));

        int[] copiedTwo = Arrays.copyOf(arr, 10); //10 the the length of the new array
        System.out.println("Array after using Arrays.copyOf method" + Arrays.toString(copiedTwo));

        /**
         * Third method to copy array is java.util.Arrays.copyOfRange method. As System.arraycopy() method
         * it copies the specified range of the specified array into a new array. The initial index of the range (from)
         * must lie between zero and original.length, inclusive. As Arrays.copyOf() method
         * it creates a new array object when copying the element and uses System.arraycopy() inside it.
         * <p>There are 8 overloaded types of java.util.Arrays.copyOf of primitive array
         * e.g. boolean, int, short, char, byte, long, float, and double as well as reference type array (see below).</p>
         * <b>Syntax</b>:
         *  <p>copyOfRange(int[] original, int from, int to)</p>
         *  @param original – the array to be copied.
         *  @param from – the initial index of the range to be copied, inclusive.
         *  @param to - the final index of the range to be copied, exclusive. (This index may lie outside the array.)
         *  @throws ArrayIndexOutOfBoundsException if from < 0 or from > original.length.
         *  @throws IllegalArgumentException if from > to.
         *  @throws NullPointerException if original is null.
         *  @throws ArrayStoreException if an element copied from original is not of a runtime type that can be stored in an array of class newType.
         * Arrays.copyOf methods for reference type array:
         * <ul>
         *    <li> {@link java.util.Arrays#copyOfRange(Object[], int, int)} - Copies the specified range of the specified array into a new array.
         *    </li>
         *    <li> {@link java.util.Arrays#copyOfRange(Object[], int, int, Class)} - Copies the specified range of the specified array into a new array.
         *    </li>
         *  </ul>
         * Prints copies of different types arrays with specified range
         * New array elements will be assigned from an existing value from an old array.
         * If the length of the new array is greater than the old array in such cases all remaining elements
         * will be assigned as zero or null.
         */
        boolean[] new_booleansRange = Arrays.copyOfRange(booleansArray, 2, 5);
        System.out.println("New Boolean Array with range: " + Arrays.toString(new_booleansRange));
        byte[] new_bytesRange = Arrays.copyOfRange(bytesArray, 3, 5);
        System.out.println("New Byte Array with range: " + Arrays.toString(new_bytesRange));
        char[] new_charsRange = Arrays.copyOfRange(charsArray, 0, 5);
        System.out.println("New Char Array with range: " + Arrays.toString(new_charsRange));
        double[] new_doublesRange = Arrays.copyOfRange(doublesArray, 4, 5);
        System.out.println("New Double Array with range: " + Arrays.toString(new_doublesRange));
        float[] new_floatsRange = Arrays.copyOfRange(floatsArray, 1, 10);
        System.out.println("New Float Array with range: " + Arrays.toString(new_floatsRange));
        int[] new_intsRange = Arrays.copyOfRange(intsArray, 3, 7);
        System.out.println("New Ints Array with range: " + Arrays.toString(new_intsRange));
        long[] new_longsRange = Arrays.copyOfRange(longsArray, 8, 11);
        System.out.println("New Long Array with range: " + Arrays.toString(new_longsRange));
        short[] new_shortsRange = Arrays.copyOfRange(shortsArray, 2, 5);
        System.out.println("New Short Array with range: " + Arrays.toString(new_shortsRange));
        String[] new_stringsRange = Arrays.copyOfRange(stringsArray, 0, 3);
        System.out.println("New String Array with range: " + Arrays.toString(new_stringsRange));
        Number[] new_numbersRange = Arrays.copyOfRange(numbersArray, 1, 3, Number[].class);
        System.out.println("New Number[] with range: " + Arrays.toString(new_numbersRange));
    }
}
