package eggit.guia6;
/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un
constructor con todos los atributos pasados por parámetro y un constructor vacío.
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método
el número de ISBN, el título, el autor del libro y el número de páginas.
        Libro vlibro = new Libro();
        vlibro.isbn = 123456789;
        vlibro.titulo = "100 Años de Soledad";
        vlibro.autor = "Gabriel Garcia Marquez";
        vlibro.nroPaginas = 100;

        System.out.println("ISBN: "+vlibro.isbn+"\nTitulo: "+vlibro.titulo+"\nAutor: " + vlibro.autor+"\nNumero de paginas: "+vlibro.nroPaginas );
 */

import eggit.guia6.clibros.Book;

public class E1Libro {
    public static void main(String[] args) {
        Book libro1 = new Book();
        libro1.cargarLibro();
        libro1.imprimirDatos();
    }
}
