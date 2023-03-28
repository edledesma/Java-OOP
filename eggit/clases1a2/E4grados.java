package eggit.clases1a2;
import java.util.Scanner;

public class E4grados {
    public static void main(String[] args) {

        Scanner valorDeIngreso = new Scanner(System.in) ;
        System.out.println("Welcome");
        System.out.println("How many degrees in celsius?");
        int intA = valorDeIngreso.nextInt();
        int result = 32+(9*intA/5);

        System.out.println(intA+" celsius degrees are equal to " + result + " fahrenheit");
    }
}