import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.


Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        String respuesta = "";
        ArrayList<String> vRazas = new ArrayList<>();

        do {
            System.out.println("Ingresar razas de perros");
            vRazas.add(scanner.nextLine());
            System.out.println("¿Desea agregar otra raza? SI o NO.");
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("NO")) {
                cont = false;
            }
        } while (cont);

        System.out.println(vRazas);

        System.out.println("Ingresar una raza de perro.");
        respuesta = scanner.nextLine();
        for (String i : vRazas) {
            if (i.equalsIgnoreCase(respuesta)) {
                System.out.println("Se encontro el perro en la lista.");
                vRazas.remove(i);
                break;
            }
        }

        Collections.sort(vRazas);
        System.out.println(vRazas);
    }
}


