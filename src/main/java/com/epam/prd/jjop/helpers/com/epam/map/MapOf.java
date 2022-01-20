package com.epam.prd.jjop.helpers.com.epam.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * MapOf class was created to see the examples of method Map.of with immutable List.of and mutable list
 * @author Kanybek Mukalaev
 */
class MapOf {
    public static void main(String[] args) {
        /**
         * The {@link java.util.Map#of()} returns unmodifiable Map. We need to pass key and value pairs.
         * The number of key and value pairs that can be passed are from 0 to 10.
         * Find the method signature of Map.of for some key and value pairs.
         * */

        Map<Integer, String> mapOf = Map.of(01, "Katowice", 02, "Wroclaw", 03, "Gdansk",
                04, "Katowice", 05, "Wroclaw", 06, "Gdansk");
        mapOf.forEach((k,v)-> System.out.println(k + " : " + v));
        /**
         * Try to put one more element.
         * mapOf.put(04, "Sosnowiec");
         * You will get : Exception in thread "main" java.lang.UnsupportedOperationException
         * */
        //mapOf.forEach((k,v)-> System.out.println(k + " : " + v));

        /**
         * We will create immutable Map with immutable List.
         * try to put one more element to immutable list and it will throw list1.add("Rodomsko");
         * Exception in thread "main" java.lang.UnsupportedOperationException
         * */
        List<String> list1 = List.of("England", "Kyrgyzstan");
        List<String> list2 = List.of("Poland", "Germany");

        Map<Integer, List<String>> mapOfList = Map.of(01,list1, 02, list2);
        System.out.println(mapOfList);

        /*
        *  If we don't use immutable List as value, then the unmodifiable Map with mutable List will also not be immutable.
        *   Output:
        *   {Katowice=[1, 2, 3]}
        *   {Katowice=[1, 2, 3, 4]}
        * */

        List<Integer> mutList = new ArrayList<>();
        mutList.add(1);
        mutList.add(2);
        mutList.add(3);
        Map<String, List<Integer>> mutableMap = Map.of("Katowice", mutList);
        System.out.println(mutableMap);
        mutList.add(4);
        System.out.println(mutableMap);

    }
}
