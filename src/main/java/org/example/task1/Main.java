package org.example.task1;

import org.example.utils.RandomUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1, вариант 1, Величко А.П." );
        System.out.println("Введите длину массива:" );
        int n = new Scanner(System.in).nextInt();

        int[] array = RandomUtil.generateIntArray(n);
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        int maxAbsValue = ArrayTask.getMaxAbsValue(array);
        if (maxAbsValue == -1) {
            System.out.println("Массив пуст." );
        } else {
            System.out.println("Максимальное значение по модулю в массиве: " + maxAbsValue);
        }
    }
}