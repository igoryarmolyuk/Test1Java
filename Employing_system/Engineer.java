package Employing_system;

public class Engineer extends Employee {
    public Engineer(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", department='" + getDepartment() + '\'';
    }
}
