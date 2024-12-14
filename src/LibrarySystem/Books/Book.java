package LibrarySystem.Books;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private final String isbn;
    private int quantity;
    private final Genre genre;

    public Book(int id, String title,
                String author,
                String isbn,
                int quantity,
                Genre genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
