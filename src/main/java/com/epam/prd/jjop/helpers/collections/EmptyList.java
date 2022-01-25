package com.epam.prd.jjop.helpers.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrating sample usage and difference between {@link Collections#emptyList()} static method and {@link Collections#EMPTY_LIST}
 * static field of {@link Collections} helper class from {@link java.util} package.
 *
 * @author Maciej Blok
 */
class EmptyList {

    /**
     * {@link Collections#EMPTY_LIST} keeps the instance of not typed List
     * {@link Collections#emptyList()} intrinsically does the casting for us
     * and returns type-safe empty list ((List<T>) EMPTY_LIST)
     */
    public static void main(String[] args) {

        /**
         * This generates unchecked assigment warning
         */
        List<String> emptyListByField = Collections.EMPTY_LIST;

        /**
         * Since we are assigning immutable empty list, we can suppress warning
         */
        @SuppressWarnings("unchecked")
        List<String> emptyListByField2 = Collections.EMPTY_LIST;

        /**
         * Since Java 1.5 we can obtain empty list in a type-safe way using {@link Collections#emptyList()}
         * This way no unchecked assigment warning is generated.
         */
        List<String> emptyListByMethod = Collections.emptyList();

        /**
         * Usage example.
         */
        String sampleText = "Abcde Fghijk";
        List<Integer> integers = extractNumbersFromText(sampleText);
        System.out.println(integers.getClass());

    }

    /**
     * Usage example.
     * Obtaining empty list from {@link Collections#EMPTY_LIST} or invoking {@link Collections#emptyList()} is useful
     * in case of a method that must return list to which we will not add objects, and we want to avoid returning null
     * and performing null judgement.
     * As {@link Collections#emptyList()} returns type-safe empty list, it should be preferred.
     * It should be remembered that in both cases the returned list is immutable, so we cannot add any object to it.
     * It is especially useful when we need to return empty list many times because it always returns the same instance
     * (singleton), thus, we can save on resources.
     */
    static List<Integer> extractNumbersFromText(String text) {
        String regex = ".*\\d.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (text == null || !matcher.matches()) {
            System.out.println("Empty list is returned");
            return Collections.emptyList();
        }

        List<Integer> integers = new ArrayList<>();
        String[] extractedIntegers = text.split("[^0-9]");

        for (int i = 0; i < extractedIntegers.length; i++) {
            if (!(extractedIntegers[i].equals(""))) integers.add(Integer.valueOf(extractedIntegers[i]));
        }

        return integers;
    }

}
