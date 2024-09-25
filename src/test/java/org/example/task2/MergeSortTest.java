package org.example.task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {
    @Test
    public void testSortListWithPositiveNumbers() {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(5.0, 3.0, 8.0, 1.0, 2.0));
        ArrayList<Double> sortedList = new MergeSort().sortList(list);
        ArrayList<Double> expectedList = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 5.0, 8.0));
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortListWithNegativeNumbers() {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(-3.0, -1.0, -4.0, -2.0));
        ArrayList<Double> sortedList = new MergeSort().sortList(list);
        ArrayList<Double> expectedList = new ArrayList<>(Arrays.asList(-4.0, -3.0, -2.0, -1.0));
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortListWithMixedNumbers() {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(3.0, -1.0, 0.0, -2.0, 5.0));
        ArrayList<Double> sortedList = new MergeSort().sortList(list);
        ArrayList<Double> expectedList = new ArrayList<>(Arrays.asList(-2.0, -1.0, 0.0, 3.0, 5.0));
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortListWithDuplicates() {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(2.0, 3.0, 2.0, 1.0));
        ArrayList<Double> sortedList = new MergeSort().sortList(list);
        ArrayList<Double> expectedList = new ArrayList<>(Arrays.asList(1.0, 2.0, 2.0, 3.0));
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortListWithEmptyList() {
        ArrayList<Double> list = new ArrayList<>();
        ArrayList<Double> sortedList = new MergeSort().sortList(list);
        assertEquals(new ArrayList<>(), sortedList);
    }

    @Test
    public void testSortListWithSingleElement() {
        ArrayList<Double> list = new ArrayList<>(List.of(3.0));
        ArrayList<Double> sortedList = new MergeSort().sortList(list);
        assertEquals(list, sortedList);
    }

    @Test
    public void testSortListWithAlreadySortedList() {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(-1.0, 1.0, 2.0, 3.0, 4.0, 5.0));
        ArrayList<Double> sortedList = new MergeSort().sortList(list);
        assertEquals(list, sortedList);
    }
}
