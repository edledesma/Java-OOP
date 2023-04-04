package eggit.guia4;

import java.util.Scanner;

/*

Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que
nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
public class E4primos {
    public static void main(String[] args) {
        Scanner sScan = new Scanner(System.in);
        System.out.println("Input a new number: ");
        int vNumber = sScan.nextInt();
        System.out.println("Is it prime? " + fPrime(vNumber));
    }

    public static boolean fPrime(int vNumber) {
        boolean vPrime = true;
        if (vNumber <= 1) {
            vPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(vNumber); i++) {
                if (vNumber % i == 0) {
                    vPrime = false;
                }
            }
        }
        return vPrime;
    }
}
