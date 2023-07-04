/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año,
en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array
(por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.
Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package Servicios;

import Entidades.Meses;

import java.util.Random;
import java.util.Scanner;


public class MesesServicio {
    public static String mesSecreto() {
        Meses aMeses = new Meses();
        Random random = new Random();

        return aMeses.aMeses[random.nextInt(11)];
    }
    public static void aDivinarMeses(String aMes){
        String respuesta = "";
        int i = 1;
        Scanner aScanner = new Scanner(System.in);
        System.out.println("Adivinar el mes secreto.");
        System.out.println("Ingresar un mes: ");
        respuesta = aScanner.nextLine();
        while(!respuesta.equalsIgnoreCase(aMes))
        {
            System.out.println("No es correcto. Ingresar un mes: ");
            respuesta = aScanner.next();
            i++;
        }


        System.out.println("¡Acertaste!, el mes era " +aMes + ". Te llevo " + i + " intentos");



    }
}
