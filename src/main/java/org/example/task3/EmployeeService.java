package org.example.task3;

import org.example.utils.RandomUtil;

import java.util.ArrayList;

public class EmployeeService {

    String[] names = new String[]{"Devan", "Dexter", "Dixon", "Donald", "Dylan", "Eddy", "Elton", "Erick", "Ernest", "Evan", "Forest"
            , "Francis", "Frank", "Freddie", "Fredrick", "Gabe", "Gabriel", "Gordon", "Gus", "Harry", "Homer", "Jacks", "Jaden", "John", "Lee", "Leonard"};
    String[] surnames = new String[]{"Abraham's", "Abramson", "Adamson", "Ainsworth", "Albertson", "Aniston", "Battle", "Beckett", "Beckham", "Black", "Bramson", "Brown", "Bullock",
            "Burrell", "Bush", "Clinton", "Cook", "Cox", "Cranston", "Derricks", "Disney"};

    String[] departments = new String[]{"Administrative", "HR", "Operations/Delivery", "Product/Service Development", "Sales", "Marketing", "IT"};

    private String generateFullName() {
        String name = names[RandomUtil.getRandomInt(0, names.length - 1)];
        String surname = surnames[RandomUtil.getRandomInt(0, surnames.length - 1)];
        return name + " " + surname;
    }

    public ArrayList<Employee> getEmployeesOverAge(int age, ArrayList<Employee> employees) {
        return new ArrayList<>(employees.stream().filter(employee -> employee.getAge() > age).toList());
    }

    public ArrayList<Employee> getEmployeesList(int n) {
        ArrayList<Employee> employees = new ArrayList<>();
        if (n < 5) {
            System.out.printf("Список сотрудников не может быть менее 5 человек! Добавляю еще %1$d человек.%n", 5 - n);
            n = 5;
        }
        for (int i = 0; i < n; i++) {
            Employee e = new Employee(
                    generateFullName(), RandomUtil.getRandomInt(18, 65),
                    departments[RandomUtil.getRandomInt(0, departments.length - 1)],
                    RandomUtil.getRandomDouble(1e4, 1e5));
            employees.add(e);
        }
        return employees;
    }
}
