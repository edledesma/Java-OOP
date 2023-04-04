package eggit.guia3;

import java.util.Scanner;

public class E1paroimpar {
    public static void main(String[] args){
        System.out.println("Input a number: ");
        Scanner anInput = new Scanner(System.in);
        int intA = anInput.nextInt();
        System.out.print("The value "+ intA + " is ");
        if (intA%2 == 1) {
            System.out.print("odd.");
        }else{
            System.out.print("even.");

        }

    }

}
