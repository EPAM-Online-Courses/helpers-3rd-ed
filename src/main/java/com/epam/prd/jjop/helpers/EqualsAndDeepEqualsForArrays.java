package com.epam.prd.jjop.helpers;

import java.util.Arrays;

/**
 * Demonstrates equals and deep equals methods on arrays and shows the difference between them.
 *
 * @author Andrzej Budzynski
 */
class EqualsAndDeepEqualsForArrays {
    static int[] array1 = new int[]{1, 2, 3};
    static int[] array2 = new int[]{3, 2, 1};
    static int[] array3 = new int[]{1, 2, 3};

    static int[] nullArray = null;

    static Object[] objectArray1 = new Object[]{1, 2, 3};
    static Object[] objectArray2 = new Object[]{3, 2, 1};
    static Object[] objectArray3 = new Object[]{1, 2, 3};

    static void equalsExamples() {
        /**Returns true if the two specified arrays of Objects are equal to one another.
         * The two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal.
         * Two objects e1 and e2 are considered equal if Objects.equals(e1, e2).
         * In other words, the two arrays are equal if they contain the same elements in the same order.
         * Also, two array references are considered equal if both are null.
         */

        System.out.println("Arrays with same values and different order");
        System.out.println(Arrays.equals(array1,array2));

        System.out.println("Arrays with same values and order");
        System.out.println(Arrays.equals(array1,array3));

        System.out.println("It is different to classic equals because when we compare two nulls, we get true:");
        System.out.println("Arrays.equals(null,null) = " + Arrays.equals(nullArray,nullArray));



        // Will work the same with all other types of Arrays. I used arrays of int for simplicity.
    }

    static void deepEqualsExamples() {

        /**Returns true if the two specified arrays are deeply equal to one another. Unlike the equals(Object[],Object[]) method, this method is appropriate for use with nested arrays of arbitrary depth.
         Two array references are considered deeply equal if both are null, or if they refer to arrays that contain the same number of elements and all corresponding pairs of elements in the two arrays are deeply equal.

         Two possibly null elements e1 and e2 are deeply equal if any of the following conditions hold:

         e1 and e2 are both arrays of object reference types, and Arrays.deepEquals(e1, e2) would return true
         e1 and e2 are arrays of the same primitive type, and the appropriate overloading of Arrays.equals(e1, e2) would return true.
         e1 == e2
         e1.equals(e2) would return true.
         Note that this definition permits null elements at any depth.
         If either of the specified arrays contain themselves as elements either directly or indirectly through one or more levels of arrays, the behavior of this method is undefined.
         */

        System.out.println("Arrays with same values and different order");
        System.out.println(Arrays.deepEquals(objectArray1, objectArray2));

        System.out.println("Arrays with same values and order");
        System.out.println(Arrays.deepEquals(objectArray1, objectArray3));

        System.out.println("It is different to classic equals because when we compare two nulls, we get true:");
        System.out.println("Arrays.deepEquals(null,null) = " + Arrays.deepEquals(null, null));


    }

    public static void main(String[] args) {

        equalsExamples();
        deepEqualsExamples();
    }
}