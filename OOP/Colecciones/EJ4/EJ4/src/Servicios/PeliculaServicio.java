/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
 */
package Servicios;

import Entidades.Pelicula;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PeliculaServicio {

    private static Scanner scanner = new Scanner(System.in);
    HashSet<Pelicula> hashPeliculas = new HashSet<>();


    public HashSet<Pelicula> crearPelicula() {
        String respuesta = "si";
        do {
            Pelicula aPelicula = new Pelicula();
            System.out.println("Ingresar nombre de la pelicula");
            aPelicula.setTitulo(scanner.nextLine());
            System.out.println("Ingresar director de la pelicula");
            aPelicula.setDirector(scanner.nextLine());
            System.out.println("Ingresar duracion de la pelicula");
            aPelicula.setDuracion(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("¿Desea agregar otra pelicula?");
            respuesta = scanner.nextLine();
            hashPeliculas.add(aPelicula);
        }while (!respuesta.equalsIgnoreCase("no"));
        return hashPeliculas;
    }

    /*


• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */

    public void mostrarPeliculas(HashSet<Pelicula> hashPeliculas){
        for (Pelicula i : hashPeliculas){
            System.out.println("Titulo:" + i.getTitulo());
        }
    }
    public void mostrarMasHora(HashSet<Pelicula> hashPeliculas){
        for (Pelicula i : hashPeliculas){
            if (i.getDuracion()>1){
                System.out.println("Titulo:" + i.getTitulo());

            }
        }


    }
    public void ordernarDuracion(HashSet<Pelicula> hashPeliculas){

    }

}



/*
ArrayList<Pelicula> arrayPelicula = new ArrayList(hashPeliculas);
 */