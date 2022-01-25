package com.epam.prd.jjop.helpers.Object;

import java.util.Objects;

/**
 * Shows examples of different objects' hashcodes, with usage of {@link Objects#hash(Object...)}
 *
 * @author Jakub Usyk
 * @see java.util.Objects
 */
public class Hashcode {
    /** Object is a class, that is on top of the class hierarchy, which means, that every other class
         in java inherits from it and implements its methods. One of its methods is hashCode(), which simply
         returns a unique value of an object that it's used on, as an int. hashcode() always returns the same value of
         the given object, no matter how many times it is used on it. By default, an integer value is derived
         from the memory address of the object in a heap. In order to have the hash code value determined
         by the objects fields, it should be overwritten. */
    public static void main(String[] args) {
        //creating two identical objects
        Person person1 = new Person("Bob", 45);
        Person person2 = new Person("Bob", 45);

        //printing created objects
        System.out.println("");
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);

        //printing created objects' hashcodes
        System.out.println("");
        System.out.println("Not overwritten hashCode function: person1: " + person1.hashCodeFromClassObject() + ", person2: " + person2.hashCodeFromClassObject());
        System.out.println("Overwritten hashCode function: person1: " + person1.hashCode() + ", person2: " + person2.hashCode());

        //hash code of a given object is always the same, as long as the object remains unchanged
        System.out.println("");
        for (int i = 0; i < 10 ; i++)
            System.out.println("Overwritten hashCode function: person1: " + person1.hashCode());
    }
}
