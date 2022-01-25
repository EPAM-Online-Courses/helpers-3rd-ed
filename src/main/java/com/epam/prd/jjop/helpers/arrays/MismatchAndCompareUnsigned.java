package com.epam.prd.jjop.helpers.arrays;

import java.util.Arrays;

/**+
 * @author Izabela Grzelecka
 */
public class MismatchAndCompareUnsigned {

    public static void main(String[] args) {

        //Example of int mismatch(int[] a, int[] b)
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 6, 7};

        int intArrayMismatch = Arrays.mismatch(array1, array2);
        int intArrayMismatch1 = Arrays.mismatch(array1,1,3, array2,2,4);

        System.out.println("Mismatched index of int array is: " + intArrayMismatch);
        System.out.println("Mismatched index of int array with specified range is: " + intArrayMismatch);

        //Examples of compareUnsigned() with int arrays:
        System.out.println("Arrays.compareUnsigned(array1, array2):  " + Arrays.compareUnsigned(array1, array2));
        System.out.println("Arrays.compareUnsigned(array1, array2) with specified range is: " +
                Arrays.compareUnsigned(array1,0, 3, array2, 0,3));

        //Example of int mismatch(String[] a, String[] b)
        String[] array3 = {"Kasia", "Ania", "Basia"};
        String[] array4 = {"Kasia", "ania", "Basia"};

        int stringArrayMismatch = Arrays.mismatch(array3, array4);
        int stringArrayMismatch1 = Arrays.mismatch(array3,1, 2, array4,1, 2);

        System.out.println("Mismatched index of String array is: " + stringArrayMismatch);
        System.out.println("Mismatched index of String array with specified range is: " + stringArrayMismatch1);


        //Example of int mismatch(boolean[] a, boolean[] b)
        boolean[] array5 = {true, false, false, true};
        boolean[] array6 = {true, false, false, true};

        int booleanArrayMismatch = Arrays.mismatch(array5, array6);
        int booleanArrayMismatch1 = Arrays.mismatch(array5, 2, 3, array6, 3, 3);

        System.out.println("Mismatched index of boolean array is: " + booleanArrayMismatch);
        System.out.println("Mismatched index of boolean array with specified range is: " + booleanArrayMismatch1);

        //Example of int mismatch(byte[] a, byte[] b)
        byte[] array7 = {3, 5, 23, 4, 6};
        byte[] array8 = {3, 5, 23, 4};

        int byteArrayMismatch = Arrays.mismatch(array7, array8);
        int byteArrayMismatch1 = Arrays.mismatch(array7, 3, 4, array8, 3, 3);

        System.out.println("Mismatched index of byte array is: " + byteArrayMismatch);
        System.out.println("Mismatched index of byte array with specified range is: " + byteArrayMismatch1);

        //Examples of compareUnsigned() with byte arrays:
        System.out.println("Arrays.compareUnsigned(array7, array8):  " + Arrays.compareUnsigned(array7, array8));
        System.out.println("Arrays.compareUnsigned(array7, array8) with specified range is: " +

                Arrays.compareUnsigned(array7,0, 3, array8, 0,3));
        //Example of int mismatch(char[] a, char[] b)
        char[] array9 = {'a', 'b', 'c', 'd', 'e'};
        char[] array10 = {'a', 'b', 'c', 'd', 'e'};
        int charArrayMismatch = Arrays.mismatch(array9, array10);
        int charArrayMismatch1 = Arrays.mismatch(array9, 3, 4, array10, 3, 4);

        System.out.println("Mismatched index in char array is: " + charArrayMismatch);
        System.out.println("Mismatched index of char array with specified range is: " + charArrayMismatch1);


        //Example of int mismatch(Object[] a, Object[] b)
        Object[] array11 = {new Vehicle("car", 4), new Vehicle("concreteMixer", 6),
                new Vehicle("motor", 2)};
        Object[] array12 = {new Vehicle("car", 7), new Vehicle("concreteMixer", 6),
                new Vehicle("motor", 2)};

        int objectArrayMismatch= Arrays.mismatch(array11, array12);
        int objectArrayMismatch1 = Arrays.mismatch(array11, 1, 2, array12, 1, 2);

        System.out.println("Mismatched index in object array is: " + objectArrayMismatch);
        System.out.println("Mismatched index of object array with specified range is: " + objectArrayMismatch1);

        //Example of int mismatch(double[] a, double[] b)
        double[] array13 = {2.4, 3.7, 7.8, 3.4, 8.8, 1.2};
        double[] array14 = {2.4, 3.7, 7.8, 3.5, 8.8, 1.1};

        int doubleArrayMismatch = Arrays.mismatch(array13, array14);
        int doubleArrayMismatch1 = Arrays.mismatch(array13, 3, 5, array14, 3, 5);

        System.out.println("Mismatched index in double array is: " + doubleArrayMismatch);
        System.out.println("Mismatched index of double array with specified range is: " + doubleArrayMismatch1);


        //Example of int mismatch(float[] a, float[] b)
        float[] array15 = {1.44f, 45, 8f, 23456f, 112.33333f, 2323f};
        float[] array16 = {1.44f, 45, 8, 23456f, 112.33333f, 2323f};

        int floatArrayMismatch = Arrays.mismatch(array15, array16);
        int floatArrayMismatch1 = Arrays.mismatch(array15, 0, 3, array16, 0, 3);

        System.out.println("Mismatched index in float array is: " + floatArrayMismatch);
        System.out.println("Mismatched index of float array with specified range is: " + floatArrayMismatch1);

        //Example of int mismatch(long[] a, long[] b)
        long[] array17 = {9029091092019201L, 323L, 323202938L, 22, 222334, 930230238L};
        long[] array18 = {9029091092019201L, 323, 323202938L, 22, 222334, 930230238};

        float longArrayMismatch = Arrays.mismatch(array17, array18);
        float longArrayMismatch1 = Arrays.mismatch(array17, 1, 3, array18, 3, 5);

        System.out.println("Mismatched index in long array is: " + longArrayMismatch);
        System.out.println("Mismatched index of long array with specified range is: " + longArrayMismatch1);

        //Examples of compareUnsigned() with short arrays:
        System.out.println("Arrays.compareUnsigned(array17, array18):  " + Arrays.compareUnsigned(array17, array18));
        System.out.println("Arrays.compareUnsigned(array17, array18) with specified range is: " +
                Arrays.compareUnsigned(array17,0, 3, array18, 0,3));

        //Example of int mismatch(short[] a, short[] b)
        short[] array19 = {1, 2, 3, 4, 5};
        short[] array20 = {1, 2, 3, 4, 5};

        int shortArrayMismatch = Arrays.mismatch(array19, array20);
        int shortArrayMismatch1 = Arrays.mismatch(array19,1, 3, array20, 1, 3);

        System.out.println("Mismatched index in short array is: " + shortArrayMismatch );
        System.out.println("Mismatched index of short array with specified range is: " + shortArrayMismatch1);

        //Examples of compareUnsigned() with short arrays:
        System.out.println("Arrays.compareUnsigned(array19, array20):  " + Arrays.compareUnsigned(array19, array20));
        System.out.println("Arrays.compareUnsigned(array19, array20) with specified range is: " +
                Arrays.compareUnsigned(array19,0, 3, array20, 0,3));










    }

}
