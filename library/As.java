package library;

public class As {
        public static void main(String[] args) {
                task1();
        }
        public static void task1() {
                Library library = new Library();

                // Створюємо кілька книг
                Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997, "9780747532743");
                Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937, "9780345339683");

                // Додаємо книги до бібліотеки
                library.addBook(book1);
                library.addBook(book2);

                library.printBooks();
        }
}

