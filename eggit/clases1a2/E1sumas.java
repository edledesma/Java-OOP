package eggit.clases1a2;
import java.util.Scanner;

public class E1sumas {
    public static void main(String[] args) {

        Scanner valorDeIngreso = new Scanner(System.in) ;
        int intA = valorDeIngreso.nextInt();
        int intB = valorDeIngreso.nextInt();
        System.out.println("The result of the sum is " + (intA+intB));
    }
}