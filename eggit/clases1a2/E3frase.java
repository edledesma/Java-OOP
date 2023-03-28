package eggit.clases1a2;
import java.util.Scanner;

public class E3frase {
    public static void main(String[] args) {
        System.out.print("Input a phrase: ");
        Scanner valorDeIngreso = new Scanner(System.in) ;
        String frase = valorDeIngreso.nextLine();

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}