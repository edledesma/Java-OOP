package eggit.guia2;
import java.util.Scanner;

public class E5raices {
    public static void main(String[] args) {
        System.out.print("Input a value: ");
        Scanner valorDeIngreso = new Scanner(System.in) ;
        int intA = valorDeIngreso.nextInt();

        System.out.println(intA +" to the power of 2 is " + (Math.pow(intA,2)));
        System.out.println(intA +" to the power of 3 is " + (Math.pow(intA,3)));
        System.out.println("The root square of "+ intA + " is " + (Math.sqrt(intA)));
    }
}