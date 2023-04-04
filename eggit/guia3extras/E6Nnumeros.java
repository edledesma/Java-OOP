package eggit.guia3extras;

import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.

 */
public class E6Nnumeros {
    public static void main(String []args){
        Scanner varInput = new Scanner(System.in);
        System.out.print("How many numbers do you wish to input?(Negative numbers will be ignored): ");
        int vTotal = varInput.nextInt();
        int vNum,vSum = 0, vMin = 0,vMax = 0,vCounter = 0;
        while (vCounter<vTotal){
            do {
                System.out.print("Input a number: ");
                vNum = varInput.nextInt();
            }
            while(vNum<0);
            vSum=vSum+vNum;
            vCounter++;
            if (vNum>vMax){
                vMax=vNum;
            }
            if (vNum<vMin){
                vMin=vNum;
            }
        }
        System.out.println("The lowest value is: "+vMin);
        System.out.println("The highest value is: "+vMax);
        System.out.println("The average is: "+vSum/vTotal);
    }
}

