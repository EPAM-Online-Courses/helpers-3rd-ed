package com.epam.prd.jjop.helpers;

/**
 * @author Jovhar Isayev
 */
class Arrays {
    private Arrays() {
    }

    public static void fill(long[] arr_of_long, long value) {
        if (arr_of_long.length > 0) {
            for (int i = 0; i < arr_of_long.length; i++) {
                arr_of_long[i] = value;
            }
        }
    }
}
