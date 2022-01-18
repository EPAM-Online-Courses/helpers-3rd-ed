package com.epam.prd.jjop.helpers.arrays;

import java.util.Arrays;

/**
 * <p>Examples of searching for elements in an array.</p>
 * <p>Arrays class provides overloaded binarySearch() methods based on
 * <a href="https://en.wikipedia.org/wiki/Binary_search_algorithm">Binary search algorithm</a>
 * Before calling binarySearch() an array must be sorted, otherwise the results are undefined.
 * Another important thing is that if an array contains multiple elements with the specified value,
 * there is no guarantee which one will be found.</p>
 *
 * @author Anna Silenko
 * @see java.util.Arrays
 */
class Search {
    public static void main(String[] args) {
        /**
         * Let's prepare some arrays to search through:
         */
        int[] simpleArrayToSearch = {1, 6, 4, 3, 9, 2, 7, 10, 5, 8};

        Item[] womanPurse = {new Item("keys"),
                new Item("lipstick"),
                new Item("handCream"),
                new Item("phone"),
                new Item("rubberDuck"),
                new Item("mirror"),
                new Item("wallet"),
                new Item("spices"),
                new Item("mascara"),
                new Item("screwdriver"),
                new Item("kindle"),
                new Item("prescription"),
                new Item("bottleOfWater"),
                new Item("banana"),
                new Item("nailFile"),
                new Item("pen"),
                new Item("ductTape"),
                new Item("newspaper"),
                new Item("sunglasses"),
                new Item("pepperSpray"),
                new Item("perfumes"),
                new Item("scissors"),
                new Item("umbrella"),
                new Item("headphones"),
                new Item("elephant"),
                new Item("coins")};

        /**
         * <p>Quoting javadoc, binarySearch() returns:</p>
         * <p><q>index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1). The insertion
         * point is defined as the point at which the key would be inserted into the array: the index of the first
         * element greater than the key, or a.length if all elements in the array are less than the specified key.
         * Note that this guarantees that the return value will be >= 0 if and only if the key is found.</q></p>
         *
         * <p>If we try to search for 8 in simpleArrayToSearch:
         * [1, 6, 4, 3, 9, 2, 7, 10, 5, 8]
         * Insertion point = 4, so -5 will be returned:</p>
         */
        System.out.println("Search for 8 in [1, 6, 4, 3, 9, 2, 7, 10, 5, 8]: " + Arrays.binarySearch(simpleArrayToSearch, 8));

        /**
         * Insertion point = 10, so -11 will be returned:
         */
        System.out.println("Search for 11 in [1, 6, 4, 3, 9, 2, 7, 10, 5, 8]: " + Arrays.binarySearch(simpleArrayToSearch, 11));

        /**
         * Insertion point = 0, so -1 will be returned:
         */
        System.out.println("Search for 0 in [1, 6, 4, 3, 9, 2, 7, 10, 5, 8]: " + Arrays.binarySearch(simpleArrayToSearch, 0));

        /**
         * Let's try to find 8 in sorted array:
         */
        Arrays.sort(simpleArrayToSearch);
        System.out.print("Search for 8 in " + Arrays.toString(simpleArrayToSearch) + ": ");
        System.out.println(Arrays.binarySearch(simpleArrayToSearch, 8));

        /**
         * Now let's try to find keys in unsorted woman's purse:
         */
        System.out.println("Purse before searching: " + Arrays.deepToString(womanPurse));
        System.out.println("Where can I find keys in unordered purse: " + Arrays.binarySearch(womanPurse, new Item("keys")));

        /**
         * Let's try to introduce some order:
         */
        Arrays.sort(womanPurse);
        System.out.println("Purse before searching: = " + Arrays.deepToString(womanPurse));
        System.out.println("Where can I find keys in ordered purse: " + Arrays.binarySearch(womanPurse, new Item("keys")));
    }
}

/**
 * This class must implement {@link java.lang.Comparable} for two reasons:
 * <ol><li> Array must be sorted before searching</li>
 * <li>binarySearch(Object[] a, Object key) uses compareTo() under the hood.</li></ol>
 */
record Item(String name) implements Comparable<Item> {
    @Override
    public int compareTo(Item otherItem) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.name(), otherItem.name());
    }

    @Override
    public String toString() {
        return "" + name;
    }
}
