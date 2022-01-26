package com.epam.prd.jjop.helpers.primitives;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Given is an array of {@code int} elements as a source for creating stream with {@code Arrays.stream(int[] array)}.
 * {@code Stream.of(T... values)} cannot be used with primitives like {@code int, long, double}. If we try to use it,
 * we will get stream with one element like {@code Stream<int[]>, Stream<long[]>, Stream<double[]>}.
 * {@code IntStream} can be mapped to {@code Stream<Integer>} using {@code Stream.mapToIng}
 *
 * @author Piotr Chowaniec
 */
public class IntStreamCreator {

    private int[] intArray = {412, 25, 6841, -58, 834, -12589, 546, 2};

    /**
     * Method {@code Arrays.stream(int[] array)} creates special type of {@code Stream} of {@code int} from array given
     * as a parameter. This method overloads {@code Arrays.stream(T[] array)} method.
     * Under the hood it invokes {@code Arrays.stream(int[] array, int startInclusive, int endExclusive)}
     * method with {@code startInclusive = 0} and {@code endExclusive = t.length}.
     */
    private IntStream createWithArraysStream() {
        return Arrays.stream(intArray);
    }

    /**
     * Method {@code Arrays.stream(T[] array, int startInclusive, int endExclusive)} creates stream of objects from array
     * given as a parameter that are in specified range.
     * The range is the reason why IndexOutOfBound exception may be thrown.
     *
     * @param startInclusive index of first element to cover.
     * @param endExclusive   number immediately after the index of last element to cover.
     */
    private IntStream createWithArraysStream(int startInclusive, int endExclusive) {
        return Arrays.stream(intArray, startInclusive, endExclusive);
    }

    /**
     * Method {@code Stream.of(T... values)} creates {@code Stream<int[]>} containing only one object which is the
     * array passed as a parameter.
     *
     */
    private Stream<int[]> createWithStreamOf() {
        return Stream.of(intArray);
    }

    /**
     * Instead {@code Stream.of(T... values)} we should use {@code IntStream.of(int... values)} that creates
     * {@code IntStream} containing all elements from fiven array.
     * Under the hood this method invokes {@code Arrays.stream(T[] array)} method.
     */
    private IntStream createWithIntStreamOf() {
        return IntStream.of(intArray);
    }

    /**
     * Alternatively we can use {@code IntStream.Builder} but this way force us to iterate over array explicitly and
     * add all elements to the stream.
     */
    private IntStream createWithIntStreamBuilder() {
        IntStream.Builder builder = IntStream.builder();
        for (int i : intArray) {
            builder.accept(i);
        }
        return builder.build();
    }
}
