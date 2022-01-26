package com.epam.prd.jjop.helpers.objects;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Given is array of {@code String} elements as a source for creating streams with {@code Arrays.stream(T[] array)} and
 * {@code Stream.of(T... values)}.
 *
 * @author Piotr Chowaniec
 */
public class StreamOfStringsCreator {

    private String[] stringArray = {"Anna", "Piotr", "Marcin", "Paulina", "Szymon", "Jakub"};

    /**
     * Method {@code Arrays.stream(T[] array)} creates stream of objects from array given as a parameter.
     * Under the hood this method invokes {@code Arrays.stream(T[] array, int startInclusive, int endExclusive)} method
     * with {@code startInclusive = 0} and {@code endExclusive = t.length}.
     */
    private Stream<String> createWithArraysStream() {
        return Arrays.stream(stringArray);
    }

    /**
     * Method {@code Arrays.stream(T[] array, int startInclusive, int endExclusive)} creates stream of objects from array
     * given as a parameter that are in specified range.
     * The range is the reason why IndexOutOfBound exception may be thrown.
     *
     * @param startInclusive index of first element to cover.
     * @param endExclusive number immediately after the index of last element to cover.
     */
    private Stream<String> createWithArraysStream(int startInclusive, int endExclusive) {
        return Arrays.stream(stringArray, startInclusive, endExclusive);
    }

    /**
     * Method {@code Stream.of(T... values)} creates stream of objects from array given as a parameter.
     * Under the hood this method invokes {@code Arrays.stream(T[] array)} method.
     */
    private Stream<String> createWithStreamOf() {
        return Stream.of(stringArray);
    }
}
