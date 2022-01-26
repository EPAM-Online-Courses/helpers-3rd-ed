package com.epam.prd.jjop.helpers.empty_methods_on_map_and_set;


import java.util.*;

class Main {

 public static void main(String[] args) {

  //class Collections (only static methods)

  System.out.println(Collections.EMPTY_MAP);  //{}
  System.out.println(Collections.EMPTY_MAP); //{}

  System.out.println(Collections.EMPTY_SET);  //[]
  System.out.println(Collections.EMPTY_SET); //[]

  // interface Map<K,V>
  Map<String, String> map = new HashMap();
  HashMap<String, String> hashMap = new HashMap<>();

  Set<String> set = new HashSet<>();
  HashSet<String> hashSet = new HashSet<String>();

  System.out.println(map.isEmpty()); //Returns true if this map contains no key-value mappings. //true
  System.out.println(hashMap.isEmpty()); //Returns true if this map contains no key-value mappings. //true
  System.out.println(set.isEmpty()); //Returns true if this set contains no elements. //true
  System.out.println(hashSet.isEmpty()); //Returns true if this set contains no elements. //true



  System.out.println(map);
  map.put(null, null);
  System.out.println(map.isEmpty());//false
  System.out.println(map == null); //false



  hashMap.putAll(map);
  System.out.println(hashMap.isEmpty()); //false

  set.add(null);
  System.out.println(set.isEmpty()); //false

  hashSet.add(null);
  System.out.println(hashSet); // [null]
  System.out.println(hashSet == null); // false

  //Interface Set<E>
  set.add(null);
  set.add(null);
  System.out.println(set.isEmpty()); //false
  System.out.println(set.size()); //1


  //Some samples..
  Map<Integer, Integer> emptyMap = Collections.EMPTY_MAP; //immutable map throws UnsupportedOperationException when one try to add some values
  //emptyMap.put(1, 123);
  System.out.println(emptyMap);


  Map<String, Integer> mapWithNull = new HashMap<>();
  mapWithNull.put(null, 333);
  System.out.println(mapWithNull.get(null)); //333
  mapWithNull.put("Not null", null);
  System.out.println(mapWithNull.get("Not null")); //null

  Map<Integer, String> map1 = Map.of();
  System.out.println(map1.get(0)); // null
//        map1.put(null, null); // UnsupportedOperationException
  System.out.println(map1.get(0)); //null
  System.out.println(map1.isEmpty()); //true


  //      Set<Integer> set1 = Set.of(null);// NullPointerException

  Set<Integer> set2 = Set.of();
  System.out.println(set2.size()); // 0

//        Map<String, String> map2 = Map.of(null, null); // NullPointerException
//        Map<String, String> map2 = Map.of("0", null); // NullPointerException

 }

}


