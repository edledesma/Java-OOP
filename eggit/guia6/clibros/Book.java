package eggit.guia6.clibros;

import java.util.Scanner;

public class Book {
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Book() {
        // constructor vacío
    }

    public Book(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos del libro:");
        System.out.print("ISBN: ");
        isbn = sc.nextLine();
        System.out.print("Título: ");
        titulo = sc.nextLine();
        System.out.print("Autor: ");
        autor = sc.nextLine();
        System.out.print("Número de páginas: ");
        numPaginas = sc.nextInt();
    }

    public void imprimirDatos() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
}