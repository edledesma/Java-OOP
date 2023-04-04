package eggit.guia2;
import java.util.Scanner;

public class E2nombre {
    public static void main(String[] args) {
        System.out.print("Input a name: ");
        Scanner valorDeIngreso = new Scanner(System.in) ;
        String varNombre = valorDeIngreso.next();

        System.out.println("Your name is "+ varNombre);
    }
}