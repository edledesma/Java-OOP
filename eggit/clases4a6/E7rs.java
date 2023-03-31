package eggit.clases4a6;

import java.util.Scanner;

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de
los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
public class E7rs {
    public static void main(String[] args) {
        Scanner aNewScan = new Scanner(System.in);
        String aPhrase;
        int cValid, cInvalid;
        cValid = 0;
        cInvalid= 0;
        do {

           System.out.print("Input a new phrase: ");
           aPhrase = aNewScan.next();
           if ((aPhrase.length()==5) && (aPhrase.substring(0, 1).equals("X")) &&(aPhrase.substring(4, 5).equals("O"))  &&  (!aPhrase.equals("&&&&&")))  {
                System.out.println("This is valid");
                cValid++;
           }else{
                System.out.println("This is not valid");
               cInvalid++;
            }

        }
        while (!aPhrase.equals("&&&&&"));
        System.out.println("There was total of " + cValid + " valid reads.");
        System.out.println("There was total of " + cInvalid + " non valid reads.");

    }

}
