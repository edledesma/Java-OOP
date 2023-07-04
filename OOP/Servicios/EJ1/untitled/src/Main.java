import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaBancariaServicios cuentServ = new CuentaBancariaServicios();
        CuentaBancaria cuenta = cuentServ.crearCuenta();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar == true) {
            System.out.println("1-Crear");
            System.out.println("2-Ingresar");
            System.out.println("3-Retirar");
            System.out.println("4-Rapida");
            System.out.println("5-Saldo");
            System.out.println("6-Datos");
            System.out.println("7-salir");
            int vOpcion = scanner.nextInt();
            double dinero;
            switch (vOpcion) {

                case 1:
                    cuentServ.crearCuenta();
                    break;

                case 2:
                    System.out.println("¿Cuanto dinero ingresa?");
                    dinero = scanner.nextDouble();
                    cuentServ.ingresarDinero(dinero, cuenta);
                    break;
                case 3:
                    System.out.println("¿Cuanto dinero retirar?");
                    dinero = scanner.nextDouble();
                    cuentServ.retirarDinero(dinero, cuenta);
                    break;
                case 4:

                    cuentServ.extraccionRapida(cuenta);
                    break;
                case 5:

                    cuentServ.consultarSaldo(cuenta);
                    break;
                case 6:
                    cuentServ.consultarDatos(cuenta);
                    break;
                case 7:
                    continuar = false;
                default:
                    System.out.println("No valido");

            }
        }
    }
}