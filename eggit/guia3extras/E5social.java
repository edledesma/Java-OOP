package eggit.guia3extras;

import java.util.Scanner;

/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */
public class E5social {
    public static void main(String[] args){
        Scanner anInput = new Scanner(System.in);
        System.out.println("Input your membership level: ");
        String memberClass = anInput.next();
        System.out.println("Input the total cost of the treatment:");
        int varCost = anInput.nextInt();
        System.out.print("TOTAL AMOUNT: $");
        if (memberClass.equalsIgnoreCase("a")){
            System.out.println(varCost*0.5);
        }else if (memberClass.equalsIgnoreCase("b")){
            System.out.println(varCost*0.65);
        }else{
            System.out.println(varCost);
        }
    }
}
