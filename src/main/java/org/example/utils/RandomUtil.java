package org.example.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomUtil {
    private static final double MIN_DOUBLE = -1000.0;
    private static final double MAX_DOUBLE = 1000.0;
    private static final int MIN_INT = -1000;
    private static final int MAX_INT = 1000;

    private static final Random rand = new Random();

    public static ArrayList<Double> generateDoubleList(int n) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(getRandomDouble());
        }
        return list;
    }

    public static double getRandomDouble(double min, double max) {
        return min + rand.nextDouble(max - min + 1);
    }

    public static double getRandomDouble() {
        return getRandomDouble(MIN_DOUBLE, MAX_DOUBLE);
    }

    public static int[] generateIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = getRandomInt();
        }
        return array;
    }

    public static int getRandomInt(int min, int max) {
        return min + rand.nextInt(max - min + 1);
    }

    private static int getRandomInt() {
        return getRandomInt(MIN_INT, MAX_INT);
    }
}
