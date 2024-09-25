package org.example.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Задание №3, вариант 1, Величко А.П." );
        System.out.println("Введите длину списка:" );

        int n = new Scanner(System.in).nextInt();
        EmployeeService employeeService = new EmployeeService();
        ArrayList<Employee> employees = employeeService.getEmployeesList(n);

        final int age = 30;
        ArrayList<Employee> employeesOverAge = employeeService.getEmployeesOverAge(age, employees);
        System.out.println("Сотрудники старше 30 лет: " );
        for (Employee employee : employeesOverAge) {
            System.out.println(employee.toBusinessString());
        }
    }
}