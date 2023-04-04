package eggit.guia3;

/*Escriba un programa en el cual se ingrese un valor límite positivo,y a
 continuación solicite números al usuario hasta que la suma de los
 números introducidos supere el límite inicial.*/


import java.util.Scanner;

public class E5limite {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        System.out.print("Input a new limit: ");
        int anInt = intInput.nextInt();
        int aCounter = 0;
        while (aCounter<=anInt) {
            System.out.print("Input a new value: ");
            aCounter = aCounter + intInput.nextInt();
            System.out.println("The value is " + aCounter);
        }
        System.out.println("The starting limit was " +anInt + ", the final value was " + aCounter +". The exceeding amount was: " +(aCounter-anInt));
    }
}
