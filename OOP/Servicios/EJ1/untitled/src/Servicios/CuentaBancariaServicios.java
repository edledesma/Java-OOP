package Servicios;

import Entidades.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancariaServicios {
    private Scanner scanner = new Scanner(System.in);
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingresar numero cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Ingresar DNI: ");
        long dniCliente = scanner.nextLong();
        System.out.println("Ingresar Saldo: ");
        double saldoActual = scanner.nextDouble();
        return new CuentaBancaria(numeroCuenta,dniCliente,saldoActual);

    }
    public void ingresarDinero(double dinero, CuentaBancaria cuenta){
        double saldoNuevo = dinero+ cuenta.getSaldoActual();
        cuenta.setSaldoActual(saldoNuevo);
    }

    public void retirarDinero(double dinero, CuentaBancaria cuenta){
        if(cuenta.getSaldoActual()>dinero){
            double saldoNuevo = cuenta.getSaldoActual()-dinero;
            cuenta.setSaldoActual(saldoNuevo);
            }else {
            System.out.println("Saldo insuficiente.");
            System.out.println("Se retirara :"+cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        }
    }
    public void extraccionRapida(CuentaBancaria cuenta){
        if(cuenta.getSaldoActual()<=0){
            System.out.println("No hay dinero disponible");
        }else {
            System.out.println("Se retirara :"+(0.20*cuenta.getSaldoActual()));
            cuenta.setSaldoActual(0.20*cuenta.getSaldoActual());
        }

    }
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("El saldo actual es :"+cuenta.getSaldoActual());
    }
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("El numero de la cuenta es :"+cuenta.getNumeroCuenta());
        System.out.println("El dni de la cuenta es:"+cuenta.getDniCliente());
    }
    }

