package com.epam.prd.jjop.helpers.objects;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Given is array of String elements as a source for creating streams with {@code Arrays.stream(T[] array)} and
 * {@code Stream.of(T... values)}.
 *
 * @author Piotr Chowaniec
 */
public class StreamOfIntegersCreator {

    private Integer[] integersArray = {412, 25, 6841, -58, 834, -12589, 546, 2};
    /**
     * Method {@code Arrays.stream(T[] array)} creates stream of objects from array given as a parameter.
     * Under the hood this method invokes {@code Arrays.stream(T[] array, int startInclusive, int endExclusive)} method
     * with {@code startInclusive = 0} and {@code endExclusive = t.length}.
     */
    private Stream<Integer> createWithArraysStream() {
        return Arrays.stream(integersArray);
    }

    /**
     * Method {@code Arrays.stream(T[] array, int startInclusive, int endExclusive)} creates stream of objects, in
     * this case {@code Integer} elements, from array given as a parameter that are in specified range.
     * The range is the reason why IndexOutOfBound exception may be thrown.
     *
     * @param startInclusive index of first element to cover.
     * @param endExclusive number immediately after the index of last element to cover.
     */
    private Stream<Integer> createWithArraysStream(int startInclusive, int endExclusive) {
        return Arrays.stream(integersArray, startInclusive, endExclusive);
    }

    /**
     * Method {@code Stream.of(T... values)} creates stream of objects from array given as a parameter.
     * Under the hood this method invokes {@code Arrays.stream(T[] array)} method.
     */
    private Stream<Integer> createWithStreamOfMethod() {
        return Stream.of(integersArray);
    }
}
