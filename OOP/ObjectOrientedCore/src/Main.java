import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book lib1 = new Book();

        setBook(lib1);
        getBook(lib1);

    }
    public static void setBook(Book bookIn) {
        Scanner aScan = new Scanner(System.in);
        System.out.println("What's the ISBN of the book?");
        bookIn.setIsbn(aScan.nextInt());
        aScan.nextLine();
        System.out.println("What's the title of the book?");
        bookIn.setTitle(aScan.nextLine());
        System.out.println("Who's the author of the book?");
        bookIn.setAuthor(aScan.nextLine());
        System.out.println("What's the amount of pages of the book?");
        bookIn.setNumPages(aScan.nextInt());
    }
    public static void getBook(Book bookIn) {
        System.out.println("The ISBN of the book is: " + bookIn.getIsbn());
        System.out.println("The title of the book is: " + bookIn.getTitle());
        System.out.println("The author of the book is: " + bookIn.getAuthor());
        System.out.println("The amount of pages of the book is: " + bookIn.getNumPages());
    }
}