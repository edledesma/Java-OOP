package servicios;

import entidades.casa;
import persistencia.casasDAO;
import java.util.Scanner;

public class casasService {

    Scanner leer = new Scanner(System.in);
    casasDAO cas = new casasDAO();

    public void casaInsertar() {
        try {
            System.out.println("Ingrese la calle de la casa");
            String calle = leer.nextLine();

            casa casa = new casa();
            casa.setCalle(calle);
            cas.casaInsertar(casa);
        } catch (Exception e) {
            System.out.println("Error al insertar el fabricante: " + e.getMessage());
        }
    }

    // Cierre del recurso Scanner
    public void cerrarScanner() {
        leer.close();
    }
}