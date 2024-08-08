package homework.Eight.School;

public class Grade {
    private Student student;
    private String subject;
    private double grade;

    // Конструктор класу Grade
    public Grade(Student student, String subject, double grade) {
        this.student = student;
        this.subject = subject;
        this.grade = grade;
    }

    // Геттери для полів класу
    public Student getStudent() {
        return student;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Предмет: " + subject + ", Оцінка: " + grade + " (Студент: " + student.getName() + ")";
    }
}
