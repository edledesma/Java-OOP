package eggit.clase4a6Extras;

import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class E3Vocales {
    public static void main(String[] args) {
        Scanner newChar = new Scanner(System.in);
        System.out.print("Input a new letter: ");
        String vInput = newChar.nextLine().toLowerCase();
        char singleChar = vInput.charAt(0);
        if (singleChar=='a'||singleChar=='e'||singleChar=='i' || singleChar=='o'|| singleChar=='u') {
            System.out.println("It's a vowel");
        }else {
            System.out.println("It's not a vowel");
        }
    }
}
