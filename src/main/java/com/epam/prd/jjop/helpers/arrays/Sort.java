package com.epam.prd.jjop.helpers.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Examples of sorting an array using methods from Arrays class.
 *
 * @author Anna Silenko
 * @see java.util.Arrays
 */
class Sort {
    public static void main(String[] args) {
        /**
         * Let's prepare some arrays to sort:
         */
        Cat noisyCat = new Cat("Noisy cat", 1, 16);
        Cat sleepingCat = new Cat("Sleeping cat", 2, 7);
        Cat purringCat = new Cat("Purring cat", 6, 2);
        Cat[] cats = {sleepingCat, purringCat, noisyCat};

        Dog goodBoy = new Dog("Good boy", 1);
        Dog badBoy = new Dog("Bad boy", 10);
        Dog fafik = new Dog("Fafik", 3);
        Dog[] dogs = {fafik, badBoy, goodBoy};

        int[] simpleArrayToSort = {7, 6, 9, 3, 5, 2, 1, 10, 8, 4};

        /**
         * <p>Arrays class provide several overloaded method for sorting an Array.</p>
         * <p><b>Default sort order is ascending.</p></b>
         * <p>We may sort only specific range of an array using {@link java.util.Arrays#sort(int[], int, int)}
         * As usual the first index is inclusive and the second one is exclusive.</p>
         */
        System.out.println("simpleArrayToSort before sorting: " + Arrays.toString(simpleArrayToSort));
        Arrays.sort(simpleArrayToSort, 2, 6);
        System.out.println("simpleArrayToSort after sorting in range [2, 6): " + Arrays.toString(simpleArrayToSort));

        /**
         * We may simply skip the range parameters and sort the entire array with {@link Arrays#sort(int[])}
         */
        Arrays.sort(simpleArrayToSort);
        System.out.println("simpleArrayToSort after sorting: " + Arrays.toString(simpleArrayToSort));

        /**
         * Arrays of Object are sorted according to the natural ordering of its elements. Natural ordering use
         * {@link Comparable#compareTo(Object)}
         * So to be able to sort an array of objects using this method, class that wrap these objects needs to implement
         * Comparable.
         */

        //Arrays.sort(dogs); //this will throw an Exception, because Dog do not implement Comparable.

        /**
         * According to Cat implementation natural ordering compare Cat's age. After sorting Cats should be ordered
         * from youngest to oldest.
         */
        System.out.println("cats before sorting: " + Arrays.toString(cats));
        Arrays.sort(cats);
        System.out.println("cats after sorting using natural order: " + Arrays.toString(cats));

        /**
         * We can sort arrays of objects using the implemented Comparators and {@link Arrays#sort(Object[], Comparator)}
         * Our Cats can be compared by purring time, as cat's niceness indicator.
         * Again, we can sort only part of the array or the entire array:
         */
        Arrays.sort(cats, 0, 2, new NiceCatComparator());
        System.out.println("cats after sorting using NiceCatComparator in range [0, 2): " + Arrays.toString(cats));

        Arrays.sort(cats, new NiceCatComparator());
        System.out.println("cats after sorting using NiceCatComparator: " + Arrays.toString(cats));

    }
}

record Cat(String name, int purringTimeLength, int age) implements Comparable<Cat> {

    @Override
    public int compareTo(Cat otherCat) {
        return Integer.compare(this.age(), otherCat.age());
    }

    @Override
    public String toString() {
        return "" + name;
    }
}

/**
 * Nice cats purr a lot!
 */
class NiceCatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat firstCat, Cat secondCat) {
        return Integer.compare(firstCat.purringTimeLength(), secondCat.purringTimeLength());
    }
}

record Dog(String name, int barkingTime) {
    @Override
    public String toString() {
        return "" + name;
    }
}
