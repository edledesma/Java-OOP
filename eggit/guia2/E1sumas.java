package eggit.guia2;
import java.util.Scanner;

public class E1sumas {
    public static void main(String[] args) {

        System.out.print("Input two values: ");
        Scanner valorDeIngreso = new Scanner(System.in) ;
        int intA = valorDeIngreso.nextInt();
        int intB = valorDeIngreso.nextInt();
        System.out.println("The result of the sum is " + (intA+intB));
    }
}