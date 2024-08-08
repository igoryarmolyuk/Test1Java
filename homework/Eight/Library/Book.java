package homework.Eight.Library;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    // Конструктор класу Book
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Геттер для заголовка книги
    public String getTitle() {
        return title;
    }

    // Геттер для автора книги
    public String getAuthor() {
        return author;
    }

    // Геттер для року публікації книги
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Заголовок: " + title + ", Автор: " + author + ", Рік публікації: " + publicationYear;
    }
}
