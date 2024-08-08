package homework.Eight.Library;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта класу Library
        Library library = new Library();

        // Створення кількох книг
        Book book1 = new Book("Майстер і Маргарита", "Михайло Булгаков", 1967);
        Book book2 = new Book("Пригоди Шерлока Холмса", "Артур Конан Дойл", 1892);
        Book book3 = new Book("Війна і мир", "Лев Толстой", 1869);

        // Додавання книг до бібліотеки
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Виведення списку книг у бібліотеці
        System.out.println("Список книг у бібліотеці:");
        library.printBooks();

        // Видалення книги з бібліотеки
        library.removeBook("Пригоди Шерлока Холмса");

        // Виведення оновленого списку книг
        System.out.println("\nСписок книг після видалення:");
        library.printBooks();
    }
}
