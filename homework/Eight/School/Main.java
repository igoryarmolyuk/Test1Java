package homework.Eight.School;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта StudentManager
        StudentManager studentManager = new StudentManager();

        // Додавання студентів
        Student student1 = new Student("student1", 1, 20);
        Student student2 = new Student("student2", 2, 21);
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);

        // Додавання оцінок студентам
        studentManager.addGrade(student1, "Математика", 85.5);
        studentManager.addGrade(student1, "Фізика", 92.0);
        studentManager.addGrade(student2, "Математика", 78.0);
        studentManager.addGrade(student2, "Хімія", 88.5);

        // Виведення середнього балу студентів
        studentManager.printStudentGrades();
    }
}
