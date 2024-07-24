package library;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books;

    // Конструктор
    public Library() {
        books = new ArrayList<>();
    }

    // Метод для додавання книги до бібліотеки
    public void addBook(Book book) {
        books.add(book);
    }

    // Метод для видалення книги з бібліотеки за ISBN
    public boolean removeBook(String isbn) {
        return books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    // Метод для пошуку книг за автором
    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    // Метод для пошуку книг за назвою
    public List<Book> findBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    // Статичний метод для підрахунку кількості книг у бібліотеці
    public static int getTotalBooks(Library library) {
        return library.books.size();
    }

    // Метод для відображення всіх книг у бібліотеці
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Метод для відображення всієї бібліотеки
    @Override
    public String toString() {
        return "Library{" + "books=" + books + '}';
    }
}
