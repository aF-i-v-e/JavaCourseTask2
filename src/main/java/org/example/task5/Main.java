package org.example.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №5, вариант 1, Величко А.П." );
        System.out.println("Введите начальное значение для таймера:" );

        int startTime = new Scanner(System.in).nextInt();
        Timer timer = new Timer(startTime);
        timer.start();
    }
}