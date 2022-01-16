package com.epam.prd.jjop.helpers.comparingandobjects;

import java.util.Objects;

/**
 * I would like to show how to compare objects.
 *
 * @author Dymitr Misiejuk
 */
class MainComparingObjects {
    public static void main(String[] args) {

        /*
          First we need to create objects which are different.
         */
        SomeObject a = new SomeObject("A", 1);
        SomeObject b = new SomeObject("B", 2);

        /*
        When we will check them by equals() method it should show us that they are different
         */
        System.out.println(a.equals(b));

        /*
         Their hashCodes should be  different.
        */
        System.out.println("a.hashCode() = " + a.hashCode());
        System.out.println("b.hashCode() = " + b.hashCode());

        /*
        But they are equal to itself.
         */
        System.out.println("a.equals(a) = " + a.equals(a));
        System.out.println("b.equals(b) = " + b.equals(b));
        /*
         When we create object with same attributes as one of objects before...
        */
        SomeObject c = new SomeObject("A", 1);

        /*
         It will appear that this is equal object as one created before...
        */
        System.out.println(a.equals(c));

        /*
         ...and has the same hash code.
         */
        System.out.println("c.hashCode() = " + c.hashCode());
        /*
         reason why it is so, is because java compare by reference to place in memory where objects are stacked.
         If we would like to be sure that every object even with the same attributes is different object,
         we need to override hashCode() and equals() methods in the Class of object.
         */

        /*
        Let's create different object to show what I mean by overriding equals().
         */
        DifferentObject a1 = new DifferentObject("A1", 1);
        DifferentObject b1 = new DifferentObject("B1", 2);
        //This DifferentObject will have same attributes as a1 DifferentObject.
        DifferentObject a2 = new DifferentObject("A1", 1);

        //As we can see, this DifferentObjects have different hash codes
        System.out.println("a1.hashCode() = " + a1.hashCode());
        System.out.println("b1.hashCode() = " + b1.hashCode());
        /*a2 DifferentObject has the same hashCode as a1 DifferentObject. This mean that they are both same reference
        to the memory of your computer.
         */
        System.out.println("a2.hashCode() = " + a2.hashCode());

        //As we expected, a1 is different from b1.
        System.out.println("a1.equals(b1) = " + a1.equals(b1));
        //But we have overwritten equals() method in the class DifferentObject that this method should only show, that object is equal only to itself.
        System.out.println("a1.equals(a2) = " + a1.equals(a2));

        //And they are equal only to itself
        System.out.println("a1.equals(a1) = " + a1.equals(a1));
        System.out.println("b1.equals(b1) = " + b1.equals(b1));
        System.out.println("a2.equals(a2) = " + a2.equals(a2));

    }

    static class SomeObject {
        private String name;
        private int number;

        public SomeObject(String name, int number) {
            this.name = name;
            this.number = number;
        }
    }

    static class DifferentObject {
        private String name;
        private int number;

        public DifferentObject(String name, int number) {
            this.name = name;
            this.number = number;
        }

        //this method should show that object is equal only to itself. Ii is overwritten.
        @Override
        public boolean equals(Object o) {
            return this == o;
        }

        //we should always keep the contract, so when we overwrite equals() we need to show how hashCode() is working too.
        @Override
        public int hashCode() {
            return Objects.hash(name, number);
        }
    }

}
