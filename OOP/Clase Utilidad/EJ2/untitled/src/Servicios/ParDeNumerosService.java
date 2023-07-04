package Servicios;



import Entidades.ParDeNumeros;

public class ParDeNumerosService {

    public ParDeNumerosService() {
    }

    public static void mostrarValores(double numero1, double numero2){
        System.out.println("El primer numero vale:" + numero1);
        System.out.println("El segundo numero vale:" + numero2);
    }

    public static double devolverMayor(double numero1, double numero2){
        return Math.max(numero1, numero2);

    }

    public static void calcularPotencia(double numero1, double numero2){
        System.out.println(Math.pow(Math.round(numero1), Math.round(numero2)));
    }

    public static void calcularRaiz(double numero1, double numero2){
        System.out.println("La raíz cuadrada del menor de los dos valores es: "+Math.sqrt(Math.abs(Math.min(numero1, numero2))));
    }
}
