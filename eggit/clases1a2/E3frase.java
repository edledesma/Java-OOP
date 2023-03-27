package eggit.clases1a2;
import java.util.Scanner;

public class E3frase {
    public static void main(String[] args) {

        Scanner valorDeIngreso = new Scanner(System.in) ;
        String frase = valorDeIngreso.next();

        frase+=valorDeIngreso.nextLine();
        valorDeIngreso.close();

        String fraseMayuscula = frase.toUpperCase();
        System.out.println(fraseMayuscula);
        String fraseMinuscula = frase.toLowerCase();
        System.out.println(fraseMinuscula);
    }
}