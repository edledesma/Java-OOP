package eggit.clases1a2;
import java.util.Scanner;

public class E2nombre {
    public static void main(String[] args) {

        Scanner valorDeIngreso = new Scanner(System.in) ;
        String varNombre = valorDeIngreso.next();

        System.out.println("Your name is "+ varNombre);
    }
}