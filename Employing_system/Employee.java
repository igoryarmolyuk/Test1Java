package Employing_system;

public class Employee {
    private String name;
    private double salary;
    private String department;

    // Конструктор
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Сеттери
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'';
    }
}
