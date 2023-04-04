package eggit.guia4;

import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas
ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona,
el programa debe preguntarle al usuario si quiere seguir mostrando personas y
frenar cuando el usuario ingrese la palabra “No”.
 */
public class E2NombreEdades {
    public static void main(String[] args) {
        do {
            vContinuar();
        }while (!vContinuar().equalsIgnoreCase("No"));
        System.out.println("Goodbye.");
    }

    public static String vContinuar(){
        Scanner vScan = new Scanner(System.in);
        System.out.print("Input name: ");
        String vPerson = vScan.nextLine();
        System.out.print("Input age: ");
        int vAge = vScan.nextInt();
        System.out.print(vPerson+" is " + vAge+ " years old. He/she is ");
        if (vAge >= 18){
            System.out.println("of legal age.");
        }else {
            System.out.println("underage.");
        }
        System.out.print("Do you wish to stop? (YES/NO): ");
        String vContinue= vScan.next();
        return vContinue;
    }
}
