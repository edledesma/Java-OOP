package eggit.guia3extras;

import java.util.Scanner;

import static java.lang.Math.round;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class E1Tiempo {
    public static void main(String [] args) {
        Scanner scanTime = new Scanner(System.in);
        System.out.print("Insert any amount of minutes: ");
        double varTime = scanTime.nextInt();
        int days = (int)(varTime/1400);

        System.out.println(varTime + " minutes equals to " + days +" day(s) and " + ((Math.round(varTime%1440)/60)) +" hour(s).");

    }
}
