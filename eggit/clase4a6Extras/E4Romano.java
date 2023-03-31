package eggit.clase4a6Extras;
/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */

import java.util.Scanner;

public class E4Romano {
    public static void main(String[]args) {
        int aValue;
        do {
            System.out.println("Input a new number to be converted: ");
            Scanner aNewInput = new Scanner(System.in);
            aValue = aNewInput.nextInt();
        }while ((aValue<1) || (aValue>10)) ;

        String[] romanos = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};

        System.out.println("The value of the " + aValue + " in roman numerals is " + romanos[aValue]);




    }
}
