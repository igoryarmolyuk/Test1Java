package homework.Eight.School;

public class Student {
    private String name;
    private int id;
    private int age;

    // Конструктор класу Student
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Геттери для полів класу
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", ID: " + id + ", Вік: " + age;
    }
}
