package com.epam.prd.jjop.helpers.unmodifiablelist_vs_list_of.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Please read contents of the Main class first
 * @see com.epam.prd.jjop.helpers.unmodifiablelist_vs_list_of.Main
 *
 *
 * In this example we have a simple shopping basket functionality (1 client for simplicity).
 * There is the Basket class, that has a list of 3 products already added to the basket.
 * We also have a method that returns this list using {@link java.util.Collections#unmodifiableList(List)}.
 * Finally, we have a method simulating adding a new product to the basket.
 *
 */
class Basket {

    private final List<String> shoppingList = new ArrayList<>();

    public Basket() {
        shoppingList.add("bread");
        shoppingList.add("lentils");
        shoppingList.add("potatoes");
    }

    public List<String> getShoppingList() {
        return Collections.unmodifiableList(shoppingList);
    }

    void addBeans() {
        shoppingList.add("beans");
    }
}

/**
 * This class represents another class that uses the Basket.
 */
class Order {
    public static void main(String[] args) {

        final Basket basket = new Basket();
        /**
         * We are retrieving the list from a different class and printing its contents to the console:
         */
        List<String> customerItems = basket.getShoppingList();  // <- this uses .unmodifiableList()
        System.out.println(customerItems);

        /**
         * We can't change the list...
         * TODO: uncomment the code below
         */
//        customerItems.add("beans");   // <- causes exception

        /**
         * ...but the original list itself CAN change!
         * Note: in real-world application .addBeans method would not be in this class, it's just for demonstration purposes.
         * TODO: uncomment the code below
         */
//        basket.addBeans();
//        System.out.println(customerItems);

        /**
         * We don't operate on the original list, thus it's encapsulated and safe!
         * TODO: uncomment the code below
         */
//        basket.shoppingList.add("water");   // <- inaccessible, because of 'private'
    }
}


