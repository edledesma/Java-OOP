package eggit.guia5;

import java.util.Scanner;

/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar
en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
public class E2VectorAzar {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Input the size of the vector: ");
        int vSize = aScanner.nextInt();
        int [] vArray = new int[vSize];
        int vRandomNumber;
        int vCounter = 0;
        for (int i = 0; i<vSize;i++){
            vRandomNumber = (int) (Math.random()*100);
            vArray[i] = vRandomNumber;
            System.out.println("Array in position "+i+" equals to "+vArray[i]);
        }
        System.out.print("Input the number to search: ");
        int vFind = aScanner.nextInt();
        for (int j = 0; j<vSize;j++){
            if (vFind==vArray[j]) {
                vCounter++;
                }
        }
        if (vCounter>0){
            System.out.println("The number "+ vFind+ " was found a total of "+ vCounter+" time/s.");
        }else{
            System.out.println("The number was not found in the array");
        }
    }
}
