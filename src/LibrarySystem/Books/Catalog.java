package LibrarySystem.Books;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private final List<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(int bookId) {
        this.books.removeIf(book -> book.getId() == bookId);
    }

    public List<Book> searchBookByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for(Book book: books)
            if (book.getTitle().equalsIgnoreCase(title))
                result.add(book);
        return result;
    }
    public List<Book> searchBookByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for(Book book: books)
            if (book.getAuthor().equalsIgnoreCase(author))
                result.add(book);
        return result;
    }

    public List<Book> listAllBooks() {
        return new ArrayList<>(books);
    }

}
