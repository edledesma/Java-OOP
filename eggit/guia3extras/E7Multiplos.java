package eggit.guia3extras;

import java.util.Scanner;

/*
Escriba un programa que lea números enteros.
Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben sumarse.
 Nota: recordar el uso de la sentencia break.
 */
public class E7Multiplos {
    public static void main(String[]args){
        Scanner aInput = new Scanner(System.in);
        boolean vCont=true;
        int vCounter = 0, vNumber= 0,vOdd=0,vEven=0;
        while (vCont==true){
            do {
                System.out.print("Input a number: ");
                vNumber = aInput.nextInt();
            }
            while (vNumber<0);
            vCounter++;
            if (vNumber%2==0){
                vEven++;
            }else{
                vOdd++;
                }
            if (vNumber%5==0){
                break;

            }

        }
        System.out.println("Total amount of numbers:" +vCounter);
        System.out.println("Total amount of even numbers:" +vEven);
        System.out.println("Total amount of odd numbers:" +vOdd);
    }
   }

