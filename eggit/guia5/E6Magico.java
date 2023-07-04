package eggit.guia5;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y
sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */

import java.util.Scanner;

public class E6Magico {
    public static void main(String[] args) {
        Scanner vScan = new Scanner(System.in);
        System.out.print("Input the size of the first dimension: ");
        int vFirstDim = vScan.nextInt();
        System.out.print("Input the size of the second dimension: ");
        int vSecondDim = vScan.nextInt();
        int [][] vMagicCube = new int[vFirstDim][vSecondDim];
        boolean vSquare = false;

        if (vFirstDim==vSecondDim){
            System.out.println(" ");
            System.out.println("The matrix is square.");
            System.out.println(" ");
            vSquare= true;
        }else{
            System.out.println("The matrix is not square.");
        }

        for (int i = 0; i<vFirstDim;i++){
            for (int j=0 ; j<vSecondDim;j++){
                do {
                    System.out.print("What's the value of I "+ i +" J "+j+" : ");
                    vMagicCube[i][j] = vScan.nextInt();
                }while (vMagicCube[i][j]<0 || vMagicCube[i][j]>9);
            }
        }
        if (vSquare=true){
            System.out.println("Damn, it's magic baby");
        }else{
            System.out.println("This is not a magic square");
        }
    }
}
