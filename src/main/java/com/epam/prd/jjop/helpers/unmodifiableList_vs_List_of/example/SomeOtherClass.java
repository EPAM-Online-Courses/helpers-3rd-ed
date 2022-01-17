package com.epam.prd.jjop.helpers.unmodifiableList_vs_List_of.example;

import java.util.List;

/**
 * Please read contents of the Main class first
 * @see com.epam.prd.jjop.helpers.unmodifiableList_vs_List_of.Main
 */

class SomeOtherClass {
    public static void main(String[] args) {

        final Basket basket = new Basket();
        /**
         * Retrieving the list from a different class:
         */
        List<String> customerProductsInBasket = basket.getShoppingList();  // <- this uses .unmodifiableList()
        System.out.println(customerProductsInBasket);

        /**
         * Cannot change the list (uncomment to see)...
         */
//        customerProductsInBasket.add("beans");   // <- causes exception
        /**
         * ...but the original list itself CAN change!
         * (in real-world application .addBeans method would not be in this class, it's just for demonstration purposes)
         */
//        basket.addBeans();
//        System.out.println(customerProductsInBasket);

        /**
         * We don't operate on the original list, thus it's encapsulated and safe!
         */
//        basket.shoppingList.add("water");   // <- inaccessible
    }
}
