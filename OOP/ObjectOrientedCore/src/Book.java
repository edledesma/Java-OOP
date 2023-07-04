import java.util.Scanner;

public class Book {
    int isbn;
    String title;
    String author;
    int numPages;

    public Book() {
    }

    public Book(int isbn, String title, String author, int numPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

}
