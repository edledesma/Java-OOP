import Entidades.Pelicula;
import Servicios.PeliculaServicio;

import java.util.HashSet;

/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:

 */
public  class Main {
    public static void main(String[] args) {
        PeliculaServicio aPelicula = new PeliculaServicio();
        HashSet<Pelicula> hashPeliculas = aPelicula.crearPelicula();
        aPelicula.mostrarPeliculas(hashPeliculas);
        aPelicula.mostrarMasHora(hashPeliculas);
    }
}