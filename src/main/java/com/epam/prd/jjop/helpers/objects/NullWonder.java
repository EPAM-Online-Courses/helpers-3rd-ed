package com.epam.prd.jjop.helpers.objects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/**
 * Description of @see java.util.Objects regarding null problem solving
 * <p>
 * This class show examples of all methods to check for null.
 * Description of the differences between these methods can be found here.
 * </p>
 *
 * @author Krzysztof Dolański
 * Objects class form java.util @since 1.7
 */

public class NullWonder {


    public static void main(String[] args) {

        String assumeNull = null;

        /**
         * <p>
         * Using null object as parameter in this method will produce 0 as return.
         * </p>
         * <p>
         * This method under the hood is using Arrays.hashCode
         * </p>
         * <p>
         * WARNING - in case of passing more than one null parameter return value WILL NOT be 0 because of implementation of Arrays.hashCode()
         * @see java.util.Arrays.hashCode();
         * </p>
         * Object.hash(null) <p>returned value is 0</p>
         * Object.hash(null, null) <p>returned value is 961</p>
         * Object.hash(null, null, null) <p>returned value is 29791</p>
         */
        Objects.hash();

        /*
         *Will return 0 if given parameter will be null
         */
        Objects.hashCode(assumeNull);

        /*
         * Check using null as first parameter this method will return true if  second parameter will be null
         */
        Objects.equals(null, assumeNull);

        /*
         * Check by using null as first parameter this two methods will return 0 second parameter will be null
         */
        Objects.compare(null, assumeNull, Comparator.naturalOrder());
        Objects.deepEquals(null, assumeNull);

        /*
         * Will returns true if provided value is null othewise returna false
         */
        Objects.isNull(assumeNull);

        /**
         * Will returns false if provided value is null othewise returns true
         */
        Objects.nonNull(assumeNull);

        /**
         * <p>Method created for validation of provided parameter if it's not null.</p>
         * <p>In case of null will throw NullPointerException</p>
         */
            Objects.requireNonNull(assumeNull);

        /*
         * Returns the result of calling toString for a non-null argument and "null" for a null argument
         */
        Objects.toString(assumeNull);
    }
}
