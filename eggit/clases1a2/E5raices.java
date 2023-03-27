package eggit.clases1a2;
import java.util.Scanner;

public class E5raices {
    public static void main(String[] args) {

        Scanner valorDeIngreso = new Scanner(System.in) ;
        int intA = valorDeIngreso.nextInt();

        System.out.println("The double of "+ intA + " is " + (Math.pow(intA,2)));
        System.out.println("The triple of "+ intA + " is " + (Math.pow(intA,3)));
        System.out.println("The root square of "+ intA + " is " + (Math.sqrt(intA)));
    }
}