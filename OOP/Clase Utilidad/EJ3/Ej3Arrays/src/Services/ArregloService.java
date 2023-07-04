
package Services;

import java.util.Arrays;

public class ArregloService {

    public static void inicializarA(double[] arrayA) {
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (Math.random() * 10);
        }
    }

    public static void mostrar(double[] arrayA) {
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("El arreglo en posicion " + i + " vale " + arrayA[i] + ".");
        }
    }

    public static void ordenar(double[] arrayA) {
        Arrays.sort(arrayA);
        System.out.println(Arrays.toString(arrayA));
    }

    public static void inicializarB(double[] arrayA, double[] arrayB) {
        for (int i = 0; i < 9; i++) {
            arrayB[i] = arrayA[i];
        }

        Arrays.fill(arrayB, 10, 19, 0.5);
    }


}


