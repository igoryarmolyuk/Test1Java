package homework.Eight.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Конструктор класу Library, що ініціалізує пустий список книг
    public Library() {
        this.books = new ArrayList<>();
    }

    // Метод для додавання нової книги до бібліотеки
    public void addBook(Book book) {
        books.add(book);
    }

    // Метод для видалення книги з бібліотеки за заголовком
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    // Метод для виведення списку всіх книг у бібліотеці
    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("Бібліотека порожня.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
