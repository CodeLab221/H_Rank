import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class BookCatalogue {
    private List<Book> books;

    public BookCatalogue() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    public double getTotalPrice() {
        return books.stream()
                .mapToDouble(Book::getPrice)
                .sum();
    }
}

 public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 15.99);
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 24.99);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99);

        BookCatalogue catalogue = new BookCatalogue();
        catalogue.addBook(book1);
        catalogue.addBook(book2);
        catalogue.addBook(book3);

        System.out.println("All books:");
        catalogue.searchByTitle("").forEach(book -> System.out.println(book.getTitle()));

        System.out.println("\nBooks by J.K. Rowling:");
        catalogue.searchByAuthor("J.K. Rowling").forEach(book -> System.out.println(book.getTitle()));

        System.out.println("\nTotal price of all books: $" + catalogue.getTotalPrice());
    }
}
