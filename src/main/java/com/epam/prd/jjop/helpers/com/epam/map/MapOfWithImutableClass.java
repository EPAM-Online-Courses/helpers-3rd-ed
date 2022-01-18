package com.epam.prd.jjop.helpers.com.epam.map;

import java.util.Map;

/**
 * @author Kanybek Mukalaev
 *
 *  immutable Map with custom immutable class
 */
class MapOfWithImutableClass {
    public static void main(String[] args) {
        EmapStudent student1 = new EmapStudent(32, "Andrii");
        EmapStudent student2 = new EmapStudent(25, "Tomasz");
        EmapStudent student3 = new EmapStudent(31, "Pawel");

        Map<Integer, EmapStudent> map = Map.of(01, student1, 02, student2, 03, student3);
        map.forEach((k,v) -> System.out.println(k + " :  "+ v.getName()));
    }
    static final class EmapStudent {
        private final int age;
        private final String name;

        public EmapStudent(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}
