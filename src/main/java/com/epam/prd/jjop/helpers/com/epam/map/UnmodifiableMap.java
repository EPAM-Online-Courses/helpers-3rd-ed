package com.epam.prd.jjop.helpers.com.epam.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *  UnmodifiableMap class was created to see the examples of an unmodifiable Map and mutable map
 * @author Kanybek Mukalaev
 */
class UnmodifiableMap {
    public static void main(String[] args) {
        /**
         * An unmodifiable Map is just a wrapper over a modifiable map
         * and it doesn't allow modifications to it directly
         */
        Map<String, String> mutableMap = new HashMap<>();
        mutableMap.put("city1", "Katowice");
        mutableMap.put("city2", "Krakow");
        mutableMap.put("city3", "Wroclaw");
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(mutableMap);
        //unmodifiableMap.put("city4", "Gdansk");
        System.out.println(unmodifiableMap);

        /**
         * But the underlying mutable map can still be changed
         * and the modifications are reflected in the unmodifiable map as well
         * The {@link java.util.Map#of()} on the other hand, contains its own private data and doesn't allow modifications to it.
         * Therefore, the data cannot change in any way once an instance of the immutable Map is created.
         */
        mutableMap.put("city4", "Gdansk");
        System.out.println(unmodifiableMap);
    }
}
