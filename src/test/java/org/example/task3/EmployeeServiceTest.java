package org.example.task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeServiceTest {
    @Test
    public void testGetEmployeesOverAge() {
        String defaultDepartment = "Default";
        double defaultSalary = 1.0;

        ArrayList<Employee> employees = new ArrayList<>(List.of(
                new Employee("John Black", 25, defaultDepartment, defaultSalary),
                new Employee("Alice White", 30, defaultDepartment, defaultSalary),
                new Employee("Bob Star", 22, defaultDepartment, defaultSalary)
        ));

        EmployeeService employeeService = new EmployeeService();
        ArrayList<Employee> result = employeeService.getEmployeesOverAge(26, employees);

        assertEquals(1, result.size());
        assertEquals("Alice White", result.get(0).getFullName());
    }

    @Test
    public void testNoGetEmployeesOverAge() {
        String defaultDepartment = "Default";
        double defaultSalary = 1.0;

        ArrayList<Employee> employees = new ArrayList<>(List.of(
                new Employee("John Black", 25, defaultDepartment, defaultSalary),
                new Employee("Alice White", 30, defaultDepartment, defaultSalary),
                new Employee("Bob Star", 22, defaultDepartment, defaultSalary)
        ));

        EmployeeService employeeService = new EmployeeService();
        ArrayList<Employee> result = employeeService.getEmployeesOverAge(40, employees);

        assertEquals(0, result.size());
    }

    @Test
    public void testNoGetEmployees() {
        EmployeeService employeeService = new EmployeeService();
        ArrayList<Employee> result = employeeService.getEmployeesOverAge(30, new ArrayList<>());
        
        assertEquals(0, result.size());
    }
}
