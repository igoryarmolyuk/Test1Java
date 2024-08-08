package homework.Eight.School;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;
    private List<Grade> grades;

    // Конструктор класу StudentManager
    public StudentManager() {
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Метод для додавання нового студента
    public void addStudent(Student student) {
        students.add(student);
    }

    // Метод для додавання оцінки студенту
    public void addGrade(Student student, String subject, double grade) {
        grades.add(new Grade(student, subject, grade));
    }

    // Метод для обчислення середнього балу студента
    public double getAverageGrade(Student student) {
        double sum = 0;
        int count = 0;

        for (Grade grade : grades) {
            if (grade.getStudent().getId() == student.getId()) {
                sum += grade.getGrade();
                count++;
            }
        }

        return count > 0 ? sum / count : 0;
    }

    // Метод для виведення інформації про студентів та їх середній бал
    public void printStudentGrades() {
        for (Student student : students) {
            System.out.println(student);
            System.out.println("Середній бал: " + getAverageGrade(student));
            System.out.println();
        }
    }
}
