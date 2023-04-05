package eggit.guia3extras;

import java.util.Scanner;

public class E8Capicua {
    public static void main(String[] args){
        Scanner vScan = new Scanner(System.in);
        System.out.print("Input a new number: ");
        int n = vScan.nextInt();
        String numero = Integer.toString(n);
        String vInverse = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            vInverse += numero.charAt(i);
        }
        System.out.println("Is it a palindromic number: " + numero.equals(vInverse));
    }
}
