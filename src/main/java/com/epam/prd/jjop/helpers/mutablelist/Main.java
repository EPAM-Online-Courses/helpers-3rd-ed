package com.epam.prd.jjop.helpers.mutablelist;

import java.util.*;

/**
 * @author Mariusz Bal
 */
class Main {
    public static void main(String[] args) {
        Main m = new Main();
        //m.arraysAsList();
        //m.collectionsList();
        m.listOf();
    }

    /**
     * The list created with {@link Arrays#asList(Object[])} is modifiable.
     * It is a view attached to the original array and all the changes in the array result
     * in changes in the list.
     * Changes in the list have the same effect in the array. However, not all of the
     * {@link java.util.Collection} methods can be used on such list. The valid ones are
     * these that do not change the list's size. Those leave the list unchanged and throw
     * {@link UnsupportedOperationException}.
     * <p>
     * The list is not the copy of the array, but operate on the same data in the memory.
     */
    private void arraysAsList() {
        String[] names = {"John", "Sam", "Kevin", "Eva", "Victoria", "Alice"};
        List<String> namesList = Arrays.asList(names);
        print(names, namesList);

        System.out.printf("%nChanging an item in the array%n%n");
        names[0] = "changed item";
        print(names, namesList);

        System.out.printf("%nChanging an item in the list%n%n");
        try {
            namesList.remove(2);
        } catch (UnsupportedOperationException e) {
            System.out.println("Could not remove from the list");
        }
        try {
            namesList.add("added item");
        } catch (UnsupportedOperationException e) {
            System.out.println("Could not add to the list");
        }
        namesList.set(3, "replaced item");
        print(names, namesList);
    }

    private void print(String[] array, List<String> list) {
        System.out.println("Names in array: " + String.join(", ", array));
        System.out.println("Names in list: " + list);
    }

    /**
     * The {@link Collections#list(Enumeration)} method returns an {@link ArrayList}.
     * The list is created as a copy of the initial data source, so changes are not shared across
     * list and enumeration data.
     * One can simply modify the data source as needed,
     * even if the modification results in collection size change.
     */
    private void collectionsList() {
        Vector<String> fruits = new Vector<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        List<String> list = Collections.list(fruits.elements());
        print(fruits, list);

        System.out.printf("%nChanging an item in the vector%n%n");
        fruits.set(1, "peach");
        fruits.add(2, "plum");
        print(fruits, list);

        System.out.printf("%nChanging an item in the list%n%n");
        list.set(2, "pineapple");
        list.add(1, "watermelon");
        print(fruits, list);
    }

    private void print(Vector<String> vector, List<String> list) {
        System.out.println("Fruits in vector: " + String.join(", ", vector));
        System.out.println("Fruits in list: " + String.join(", ", list));
    }

    /**
     * The {@link List#of()} method allows us to create a list of elements passed as arguments.
     * The returned object is an unmodifiable list. We cannot modify its size by adding or removing items.
     * We cannot replace an item as well. Change in the original data source does not reflect in
     * a change in the list.
     * <br />
     * If we would like to have it as a mutable list we may wrap it using
     * <code>new ArrayList<>(List.of(x,y,z))</code>. This will create a new, modifiable ArrayList using
     * unmodifiable List.of() copied elements.
     *
     * @see ArrayList
     */
    private void listOf() {
        String[] vegetables = {"Cucumber", "Tomato", "Potato"};
        List<String> list = List.of(vegetables);
        print(vegetables, list);

        System.out.printf("%nChanging an item in the array%n%n");
        vegetables[1] = "Garlic";
        print(vegetables, list);

        System.out.printf("%nChanging an item in the list%n%n");
        try {
            list.set(2, "horse radish");
        } catch (UnsupportedOperationException e) {
            System.out.println("Could not replace an item");
        }
        try {
            list.add("carrot");
        } catch (UnsupportedOperationException e) {
            System.out.println("Could not add an item");
        }
        try {
            list.remove(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("Could not remove an item");
        }
        print(vegetables, list);
    }

}
