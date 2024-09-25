package org.example.task1;

public class ArrayTask {
    public static int getMaxAbsValue(int[] array) {
        if (array.length == 0) return -1;
        int maxAbsValue = 0;
        for (int element : array) {
            int elementAbs = Math.abs(element);
            if (elementAbs > maxAbsValue) {
                maxAbsValue = elementAbs;
            }
        }
        return maxAbsValue;
    }
}
