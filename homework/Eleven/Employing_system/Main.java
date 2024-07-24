package Employing_system;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        // Додаємо працівників
        company.addEmployee(new Manager("Vesemir", 75000, "Management"));
        company.addEmployee(new Engineer("Geralt z Rivii", 60000, "Engineering"));
        company.addEmployee(new Engineer("Lambert and Eskel", 62000, "Engineering"));

        // Відображаємо всіх працівників
        company.printAllEmployees();

        // Видаляємо працівника
        company.removeEmployee("Lambert and Eskel");

        // Відображаємо всіх працівників після видалення
        company.printAllEmployees();

        // Підрахунок загальної зарплати
        System.out.println("Total Salary: " + company.calculateTotalSalary());

        // Підрахунок середньої зарплати
        System.out.println("Average Salary: " + Company.calculateAverageSalary(company));
    }
}
