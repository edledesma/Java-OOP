package eggit.guia4;

import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).

 */
public class E3Cambio {
    public static void main(String[] args) {
        Scanner vScan = new Scanner(System.in);
        System.out.print("Input the amount of euros: € ");
        double vEuros = vScan.nextDouble();
        System.out.print("Input the type of currency to exchange (USD,YEN,GBP): ");
        String vCurrency =vScan.next().toUpperCase();

        sExchange(vEuros,vCurrency);
    }

    public static void sExchange(double vEuros, String vCurrency){
        switch (vCurrency) {
            case "USD" -> System.out.println(vEuros + " € equal to U$D $" + (vEuros * 1.28611));
            case "YEN" -> System.out.println(vEuros + " € equal to YEN ¥" + (vEuros * 129.852));
            case "GBP" -> System.out.println(vEuros + " € equal to GBP £" + (vEuros * 0.86));
            default -> System.out.println("Invalid currency");
        }
    }
}
