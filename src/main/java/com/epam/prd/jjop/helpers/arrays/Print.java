package com.epam.prd.jjop.helpers.arrays;

import java.util.Arrays;

/**
 * Examples of printing arrays with different number of dimensions using {@link Arrays#toString(Object[])}
 * and {@link Arrays#deepToString(Object[])} methods.
 *
 * @author Anna Silenko
 * @see java.util.Arrays
 */
public class Print {

    public static void main(String[] args) {

        String[] array1D = {"=^._.^= ∫", "(=^･ｪ･^=))ﾉ彡☆", "(⌯’▾’⌯) ∫"};

        String[][] array2D = {{"001100"},
                {"010010"},
                {"011110"},
                {"100001"},
                {"101101"},
                {"110011"},};

        int[][][] array3D = {{{0}, {0}, {0}},
                {{1}, {1}, {1}},
                {{2}, {2}, {2}}};

        /**
         * <p>If we try to call System.out.println() method on an array, {@link Object#toString()} method will be called,
         * which returns:</p>
         * <code>getClass().getName() + "@" + Integer.toHexString(hashCode())</code>
         * <p>So for a Strings array outputs will be something like:
         * <i>[Ljava.lang.String;@7cca494b</i> which is not very useful.</p>
         */
        System.out.println("System.out.println(array1D) = " + array1D);

        /**
         * Since Java 1.5 we can return string value of content of an array toString() or deepToString() from Arrays class.
         *
         * {@link Arrays#toString(Object[] a)} only works for 1D arrays.
         *
         */
        System.out.println("Arrays.toString(array1D) = " + Arrays.toString(array1D));

        /**
         * For more than one dimension {@linkArrays.deepToString(Object[] a)} needs to be used.
         */
        System.out.println("Arrays.deepToString(array1D) = " + Arrays.deepToString(array1D));

        System.out.println("Arrays.toString(array2D) = " + Arrays.deepToString(array2D));

        System.out.println("Arrays.deepToString(array3D) = " + Arrays.deepToString(array3D));

        /**
         * Fun fact! According to JVM Specification maximum number of dimensions for an array is 255!
         * @see <a herf="https://docs.oracle.com/javase/specs/jvms/se17/html/jvms-4.html#jvms-4.4.1">JVMS 4.4.1</a>
         */
        //This one is commented out as it may not be the best idea to try it in the IDE. JShell is a much better tool for that.
//        String[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
//                [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
//                [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
//                [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
//                [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
//                [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
//                [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
//                [][][][][][][][][] arr255D = {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
//                {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
//                        {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
//                                {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
//                                        {{{{"Can deepToString() reach me here?"}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
//                                }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
//                        }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
//                }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
//        }}}}}}}}}}}}}};
//        System.out.println("Arrays.deepToString(arr255D) = " + Arrays.deepToString(arr255D));
    }
}
