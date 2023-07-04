package eggit.guia6.clibros;

import java.util.Scanner;
public class Operacion{
    private double numero1;
    private double numero2;

    public Operacion() {
        // default constructor with no arguments
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: no se puede multiplicar por cero");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir por cero");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }

    public void ejecutar() {
    }

}