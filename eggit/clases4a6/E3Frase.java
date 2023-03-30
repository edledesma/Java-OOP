package eggit.clases4a6;

import java.util.Scanner;

public class E3Frase {

    public static void main (String[] args) {
        Scanner inFrase = new Scanner(System.in);
        System.out.println("Ingresar una frase :");
        String frase = inFrase.nextLine();
        if (frase.length()==8) {
            System.out.println("La frase tiene la longitud correcta");
        }else{
            System.out.println("La longitud es incorrecta");
        }
    }
}
