package homework.Twelve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                System.out.println("Employee with ID " + id + " removed.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the company.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee.getDetails());
            }
        }
    }
}