package org.example.task2;

import org.example.utils.RandomUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №2, вариант 1, Величко А.П.");
        System.out.println("Введите длину списка:");
        int n = new Scanner(System.in).nextInt();

        ArrayList<Double> list = RandomUtil.generateDoubleList(n);
        System.out.println("Сгенерированный список: " + list);

        MergeSort mergeSort = new MergeSort();
        ArrayList<Double> sortedList = mergeSort.sortList(list);
        System.out.println("Отсортированный список: " + sortedList);
    }
}