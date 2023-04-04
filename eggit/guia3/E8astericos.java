package eggit.guia3;

import java.util.Scanner;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

*/
public class E8astericos {
    public static void main(String[] args) {
        Scanner scanElements = new Scanner(System.in);
        System.out.print("Input the amout of elements that will compose the table: ");
        int varElements = scanElements.nextInt();
        for (int i = 0; i<varElements;i++){
            System.out.println("");
            for (int j=0;j<varElements;j++){
                if (i==0 || i==varElements-1||j==0||j==varElements-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

        }
    }
}