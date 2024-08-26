package homework.Twelve;

class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return "Manager: " + name + ", ID: " + id + ", Salary: " + salary + ", Department: " + department;
    }
}
