package Employing_system;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    // Конструктор
    public Company() {
        employees = new ArrayList<>();
    }

    // Метод для додавання працівника
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для видалення працівника за ім'ям
    public boolean removeEmployee(String name) {
        return employees.removeIf(employee -> employee.getName().equals(name));
    }

    // Метод для підрахунку загальної зарплати компанії
    public double calculateTotalSalary() {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    // Статичний метод для підрахунку середньої зарплати працівників компанії
    public static double calculateAverageSalary(Company company) {
        if (company.employees.isEmpty()) {
            return 0.0;
        }
        double totalSalary = company.calculateTotalSalary();
        return totalSalary / company.employees.size();
    }

    // Метод для відображення всіх працівників
    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
