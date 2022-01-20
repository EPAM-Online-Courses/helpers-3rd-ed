package com.epam.prd.jjop.helpers.mutablelist;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mariusz Bal
 */
class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.arraysAsList();
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

    private void print(String[] names, List<String> namesList) {
        System.out.println("Names in array: " + String.join(", ", names));
        System.out.println("Names in list: " + namesList);
    }

}
