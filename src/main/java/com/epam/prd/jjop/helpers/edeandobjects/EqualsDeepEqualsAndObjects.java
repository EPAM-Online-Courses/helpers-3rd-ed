package com.epam.prd.jjop.helpers.edeandobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class EqualsDeepEqualsAndObjects {


    static void showMeHowEqualsWorks() {
        Integer obj1 = 1;
        Integer obj2 = 2;
        System.out.println("................................................EQUALS........................................................");
        System.out.println("When we compare two objects and first argument has no overrided equals method, then these objects are compared by reference:");
        System.out.println("Objects.equals(new ExampleWithoutEquals(\"first\"),new ExampleWithoutEquals(\"second\")) = " + Objects.equals(new ExampleWithoutEquals("first"), new ExampleWithoutEquals("second")));
        System.out.println("Otherwise, equals method of the first object is used:");
        System.out.println("Objects.equals(new ExampleWithEquals(\"first\"),new ExampleWithEquals(\"second\")) = " + Objects.equals(new ExampleWithEquals("first"), new ExampleWithEquals("second")));


        System.out.println("Objects.equals(obj1,obj2) = " + Objects.equals(obj1, obj2));
        System.out.println("Objects.equals(obj1,obj1) = " + Objects.equals(obj1, obj1));
        System.out.println("Objects.equals(obj1,obj1) = " + Objects.equals(obj2, obj2));

        System.out.println("Objects.equals(null,obj2) = " + Objects.equals(null, obj2));
        System.out.println("Objects.equals(null,obj2) = " + Objects.equals(obj1, null));
        System.out.println("It is different to classic equals because when we compare two nulls, we get true:");
        System.out.println("Objects.equals(null,null) = " + Objects.equals(null, null));

    }

    static void showMeHowDeepEqualsWork() {
        System.out.println("...........................................DEEP.EQUALS........................................................");
        System.out.println("Deep equals works as equals, but when it comes to arrays, then Arrays.deepEquals is used to check equality: ");
        System.out.println("Objects.deepEquals(List.of(1,2,3),List.of(1,2,3)) = " + Objects.deepEquals(List.of(1, 2, 3), List.of(1, 2, 3)));
        System.out.println("Objects.deepEquals(List.of(1, 2, 3), List.of(2,1, 3)) = " + Objects.deepEquals(List.of(1, 2, 3), List.of(2, 1, 3)));
        System.out.println("It is different to classic equals because when we compare two nulls, we get true:");
        System.out.println("Objects.deepEquals(null,null) = " + Objects.deepEquals(null, null));

    }


    public static void main(String[] args) {
        showMeHowEqualsWorks();
    showMeHowDeepEqualsWork();
    }
}


class ExampleWithEquals {
    final String name;

    ExampleWithEquals(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals method used by: "+name +" to check equality with other object");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExampleWithEquals that = (ExampleWithEquals) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class ExampleWithoutEquals{
    final String name;

    ExampleWithoutEquals(String name) {
        this.name = name;
    }


}