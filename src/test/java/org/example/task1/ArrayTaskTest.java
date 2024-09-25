package org.example.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTaskTest {
    @Test
    public void testGetMaxAbsValueWithPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(5, ArrayTask.getMaxAbsValue(array));
    }

    @Test
    public void testGetMaxAbsValueWithNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        assertEquals(5, ArrayTask.getMaxAbsValue(array));
    }

    @Test
    public void testGetMaxAbsValueWithMixedNumbers() {
        int[] array = {-5, 3, -2, 4, -1};
        assertEquals(5, ArrayTask.getMaxAbsValue(array));
    }

    @Test
    public void testGetMaxAbsValueWithZeros() {
        int[] array = {0, -1, 1, 0};
        assertEquals(1, ArrayTask.getMaxAbsValue(array));
    }

    @Test
    public void testGetMaxAbsValueWithEmptyArray() {
        int[] array = {};
        assertEquals(-1, ArrayTask.getMaxAbsValue(array));
    }

    @Test
    public void testGetMaxAbsValueWithSingleElement() {
        int[] array = {-10};
        assertEquals(10, ArrayTask.getMaxAbsValue(array));
    }
}
