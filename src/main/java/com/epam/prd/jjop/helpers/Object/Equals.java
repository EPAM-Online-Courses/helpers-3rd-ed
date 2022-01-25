package com.epam.prd.jjop.helpers.Object;

import java.util.Objects;

/**
 * Shows examples of equals method, with usage of {@link Objects#equals(Object, Object)}
 *
 * @author Jakub Usyk
 * @see java.util.Objects
 */
public class Equals {
    /** Indicates whether some other object is "equal to" the one, on which we call the function.
    It is generally necessary to override the hashCode method whenever this method is overridden,
    so as to maintain the general contract for the hashCode method, which states that
    equal objects must have equal hash codes. Its default implementation simply checks the objects
    locations in memory to see if they are the same object, no matter what fields they have.
     */
    public static void main(String[] args) {
        //creating two identical objects
        Person person1 = new Person("Bob", 45);
        Person person2 = new Person("Bob", 45);
        Person person3 = new Person("Rob", 54);

        //printing created objects
        System.out.println("");
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("person3: " + person3);

        //printing results of equals() method usage on created objects
        System.out.println("");
        System.out.println("Not overwritten equals function: person1.equalsFromClassObject(person2): " + person1.equalsFromClassObject(person2));
        System.out.println("Overwritten equals function: person1.equals(person2): " + person1.equals(person2));
        System.out.println("Not overwritten equals function: person1.equalsFromClassObject(person3): " + person1.equalsFromClassObject(person3));
        System.out.println("Overwritten equals function: person1.equals(person3): " + person1.equals(person3));
    }
}
