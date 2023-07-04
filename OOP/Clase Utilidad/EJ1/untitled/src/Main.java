import Entidades.Cadena;
import Servicios.CadenaServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner aScan = new Scanner(System.in);
        System.out.print("Ingresar una frase: ");
        String aFrase = aScan.nextLine();
        Cadena aCadena = new Cadena(aFrase);
        CadenaServicio aServicio = new CadenaServicio(aCadena);


        aServicio.mostrarVocales();
        aServicio.invertirFrase();
        aServicio.vecesRepetido();
        System.out.println("Ingresar una frase a comparar: ");
        String bFrase = aScan.next();
        aServicio.comprarLongitud(bFrase);
        System.out.println("Ingresar una frase a unir: ");
        bFrase = aScan.next();
        aServicio.unirFrases(bFrase);
        System.out.println("Ingresar una letra para reemplazar todas las 'a': ");
        bFrase = aScan.next();
        aServicio.reemplazar(bFrase);
        System.out.println("Ingresar una letra a comprar en la cadena: ");
        bFrase = aScan.next();
        System.out.println(aServicio.contiene(bFrase));


    }
}