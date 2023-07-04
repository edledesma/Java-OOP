package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    public static Date fechaNacimiento() {
        Scanner scanA = new Scanner(System.in);
        System.out.println("Ingresar fecha de naciento (Con el formato DD/MM/YYYY)");
        System.out.println("Ingresar dia de nacimiento: ");
        int dia = scanA.nextInt();
        System.out.println("Ingresar mes de nacimiento: ");
        int mes = scanA.nextInt();
        System.out.println("Ingresar anio de nacimiento: ");
        int anio = scanA.nextInt();
        return new Date(anio -1900, mes - 1, dia);
    }

    public Date fechaActual(){
        return new Date();
    }

    public static int edadUsuario(Date fechaNacimiento, Date fechaActual) {
        int nac = fechaNacimiento.getYear();
        int act = fechaActual.getYear();
        return act-nac;
    }
}

