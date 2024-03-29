package eggit.guia3;

import java.util.Scanner;

/*  Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
 en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
 desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
 caso contrario se vuelve a mostrar el menú.
*/
public class E6Calculadora {
    public static void main(String[] args) {


        boolean stillIn = true;
        do {
            System.out.println("Input two values: ");
            Scanner anIntIn = new Scanner(System.in);
            Scanner aStr = new Scanner(System.in);
            int value1 = anIntIn.nextInt(); int value2 = anIntIn.nextInt();
            System.out.println("Select desired operation");
            System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit");
            int oper = anIntIn.nextInt();
            switch (oper) {
                case 1:
                    System.out.println("The result of the addition is: " + (value1 + value2));
                    break;

                case 2:
                    System.out.println("The result of the subtraction is: " + (value1 - value2));
                    break;
                case 3:
                    System.out.println("The result of the multiplication is: " + (value1 * value2));
                    break;
                case 4:
                    if (value2 == 0) {
                        System.out.println("It's not possible to divide by 0");
                        break;
                    } else {
                        System.out.println("The result of the division is: " + (value1 / value2));
                        stillIn = false;
                    }

                case 5:
                    System.out.println("Are you sure you want to quit? Y/N");
                    String confir = aStr.nextLine();
                    if (confir.equalsIgnoreCase("Y")) {
                        stillIn = false;

                    }
                default:
                    System.out.println("Invalid option. Please try again.");
                    stillIn = true;
            }


        }
        while (stillIn);
    }
}