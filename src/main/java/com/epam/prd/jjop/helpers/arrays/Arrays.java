package com.epam.prd.jjop.helpers.arrays;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

import static java.util.Arrays.*;

/**
 * Demonstrates {@code <b>fill<b/>}, {@code <b>setAll<b/>} and {@code <b>parallelSetAll<b/>} static methods from {@link java.util.Arrays} helper class by using them inside documented custom methods.
 *
 * @author Jovhar Isayev
 */
class Arrays {
    /**
     * Wraps {@link java.util.Arrays#fill(Object[], Object)} for demonstration.<br/>
     * <b>Note:</b> Picked this signature due to the use of the generics.<br/>
     * Other overloaded variants of {@code <b>fill(Object[], Object)<b/>} method include:
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
     */
    private static <T> void fillArrayWithGivenElement(T[] arr, T value) {
        fill(arr, value);

        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    /**
     * Wraps {@link java.util.Arrays#fill(Object[], int, int, Object)} for demonstration.<br/>
     * <b>Note:</b> Picked this signature due to the use of the generics.<br/>
     * Other overloaded variants of {@code <b>fill(Object[], int, int, Object)<b/>} method include:
     * <ul>
     *     <li>
     *          {@link java.util.Arrays#fill(byte[], int, int, byte)} - replaces elements of byte array with given byte type value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(short[], int, int, short)} - replaces elements of short array with given short value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(int[], int, int, int)} - replaces elements of int array with given int value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(long[], int, int, long)} - replaces elements of long array with given long value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(float[], int, int, float)} - replaces elements of float array with given float value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(double[], int, int, double)} - replaces elements of double array with given double value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(char[], int, int, char)} - replaces elements of char array with given char value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(boolean[], int, int, boolean)} - replaces elements of boolean array with given boolean value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(Object[], int, int, Object)} - replaces elements of object array with given object value from specified start index to specified end index
     *     </li>
     * </ul>
     *  <p>
     *      Note: In case of {@code <u>from == to<u/>} array remains unchanged
     *  </p>
     *
     * @param arr   array which its elements will be replaced with value argument
     * @param from  inclusive index of the array to start replacing elements from
     * @param to    exclusive index of the array to stop the replacement at
     * @param value to replace elements of given array with
     * @throws IllegalArgumentException       if <code><u>fromIndex > toIndex<u/></code> is true
     * @throws ArrayIndexOutOfBoundsException if <code><u>fromIndex < 0 || toIndex < 0<u/></code> is true
     */
    private static <T> void fillArrayWithGivenElementFromStartIndexToEndIndex(T[] arr, int from, int to, T value) {
        fill(arr, from, to, value);

        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    /**
     * Wraps {@link java.util.Arrays#setAll(Object[], IntFunction)} for demonstration. <br/>
     * <b>Note:</b> Picked this signature due to use of generics.<br/>
     * Other overloaded variants of {@code <b>setAll(Object[], IntFunction)<b/>} method include:
     * <li>
     * {@link java.util.Arrays#setAll(int[], IntUnaryOperator)} - replaces elements of int array with int values returned by {@link IntUnaryOperator}
     * </li>
     * <li>
     * {@link java.util.Arrays#setAll(long[], IntToLongFunction)} - replaces elements of long array with long values returned by {@link IntToLongFunction}
     * </li>
     * <li>
     * {@link java.util.Arrays#setAll(double[], IntToDoubleFunction)} - replaces elements of double array with double values returned by {@link IntToDoubleFunction}
     * </li>
     *
     * @param arr            array which its elements will be assigned to value generated by valueGenerator of type IntFunction
     * @param valueGenerator generator of type {@code IntFunction<T>} to produce values to replace array elements with
     */
    private static <T> void linearSetAllElementsOfArrayUsingGenerator(T[] arr, IntFunction<? extends T> valueGenerator) {
        setAll(arr, valueGenerator);

        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    /**
     * Wraps {@link java.util.Arrays#parallelSetAll(Object[], IntFunction)} for demonstration. <br/>
     * <b>Note:</b> Picked this signature due to use of generics.<br/>
     * Other overloaded variants of {@code <b>parallelSetAll(Object[], IntFunction)<b/>} method include:
     * <li>
     * {@link java.util.Arrays#parallelSetAll(int[], IntUnaryOperator)} - replaces elements of int array with int values returned by {@link IntUnaryOperator} in parallel
     * </li>
     * <li>
     * {@link java.util.Arrays#parallelSetAll(long[], IntToLongFunction)} - replaces elements of long array with long values returned by {@link IntToLongFunction} in parallel
     * </li>
     * <li>
     * {@link java.util.Arrays#parallelSetAll(double[], IntToDoubleFunction)} - replaces elements of double array with double values returned by {@link IntToDoubleFunction} in parallel
     * </li>
     *
     * @param arr            array which its elements will be assigned to value generated by valueGenerator of type IntFunction
     * @param valueGenerator generator of type IntFunction<T> to produce values to replace array elements with
     */
    private static <T> void parallelSetAllElementsOfArrayUsingGenerator(T[] arr, IntFunction<? extends T> valueGenerator) {
        parallelSetAll(arr, valueGenerator);

        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // demonstration of fill method to replace all elements
        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5};
        Boolean[] boolArr = new Boolean[]{true, true, true};

        fillArrayWithGivenElement(intArr, 100);
        fillArrayWithGivenElement(boolArr, false);

        // demonstration of fill method to replace elements from startIndex(inclusive) to endIndex(exclusive)
        Character[] charArr = new Character[]{'a', 'b', 'c', 'q', 'w', 'e'};
        fillArrayWithGivenElementFromStartIndexToEndIndex(charArr, 2, 4, 'h');

        // demonstration of linear setAll method
        String[] words_1 = new String[]{"hello", "darkness", "my", "old", "friend"};
        String[] words_2 = new String[]{"hello", "darkness", "my", "old", "friend"};
        String[] words_3 = new String[]{"hello", "darkness", "my", "old", "friend"};
        String[] words_4 = new String[]{"hello", "darkness", "my", "old", "friend"};

        // initialized anonymous class object to be used as generator argument for the setAll wrapper method
        IntFunction<String> generatorAsAnonymousClassObject = new IntFunction<>() {
            @Override
            public String apply(int value) {
                return value + "-anonymous-" + value;
            }
        };
        // lambda replacement for the one above
        IntFunction<String> generatorAsLambda = value -> value + "-lambda-" + value;
        IntFunction<String> generatorAsLambdaWithTypesOfParamsDefined = (int value) -> value + "-lambdaWithTypedParam-" + value;
        IntFunction<String> generatorAsLambdaWithComplexBody = value -> {
            // extra code might happen here
            return value + "-lambdaWithComplexBody-" + value;
        };

        linearSetAllElementsOfArrayUsingGenerator(words_1, generatorAsAnonymousClassObject);
        linearSetAllElementsOfArrayUsingGenerator(words_2, generatorAsLambda);
        linearSetAllElementsOfArrayUsingGenerator(words_3, generatorAsLambdaWithComplexBody);
        linearSetAllElementsOfArrayUsingGenerator(words_4, generatorAsLambdaWithTypesOfParamsDefined);

        // demonstration of parallel setAll method
        Character[] chars = new Character[]{'a', 'b', 'c', 'd', 'e', 'f'};
        IntFunction<Character> nextCharGenerator = (index) -> (char) (chars[index] + 1);

        parallelSetAllElementsOfArrayUsingGenerator(chars, nextCharGenerator);
    }
}
