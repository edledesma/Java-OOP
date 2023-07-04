package eggit.guia5;

import java.util.Scanner;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class E3Digitos {
    public static void main(String[] args) {
        Scanner vScan = new Scanner(System.in);
        System.out.print("How many numbers do you wish to add? : ");
        int vSize = vScan.nextInt();
        String vNumber;
        int [] vArray = new int[5];
        for (int i = 0; i<vSize;i++) {
            do {
                System.out.println(" ");
                System.out.print("Input a number (Maximum of 5 digits): ");
                vNumber = vScan.next();
            } while (vNumber.length()>5);
            switch (vNumber.length()){
                case 1 -> vArray[0]++;
                case 2 -> vArray[1]++;
                case 3 -> vArray[2]++;
                case 4 -> vArray[3]++;
                case 5 -> vArray[4]++;
            }
        }
        System.out.println(" ");
        System.out.println("Numbers with 1 digit: " +vArray[0]);
        System.out.println("Numbers with 2 digits: " +vArray[1]);
        System.out.println("Numbers with 3 digits: " +vArray[2]);
        System.out.println("Numbers with 4 digits: " +vArray[3]);
        System.out.println("Numbers with 5 digits: " +vArray[4]);
    }
}
