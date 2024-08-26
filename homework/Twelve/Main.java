package homework.Twelve;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Manager manager1 = new Manager("John Doe", 101, 75000, "IT");
        Engineer engineer1 = new Engineer("Jane Smith", 102, 70000, "Software Development");

        company.addEmployee(manager1);
        company.addEmployee(engineer1);

        System.out.println("List of Employees:");
        company.listEmployees();

        System.out.println("\nRemoving employee with ID 101:");
        company.removeEmployee(101);

        System.out.println("\nList of Employees after removal:");
        company.listEmployees();
    }
}
