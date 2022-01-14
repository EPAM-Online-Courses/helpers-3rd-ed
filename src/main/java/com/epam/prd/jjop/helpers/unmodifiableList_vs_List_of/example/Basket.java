package com.epam.prd.jjop.helpers.unmodifiableList_vs_List_of.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
