package com.epam.prd.jjop.helpers;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Jovhar Isayev
 */
@Test
public class ArraysTest {
    public void shouldAssignValuesToPassedArrayOfLongWithValues() {
        // given
        long valueToBeFilled = 100L;
        long longArr[] = new long[]{1, 2, 3, 4};
        // when
        Arrays.fill(longArr, valueToBeFilled);
        // then
        long result[] = new long[]{100, 100, 100, 100};
        assertEquals(longArr, result);
    }
}