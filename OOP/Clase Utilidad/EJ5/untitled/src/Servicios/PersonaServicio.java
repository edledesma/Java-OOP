/*
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package Servicios;

import Entidades.Persona;
import Servicios.FechaServicio;

import java.util.Date;
import java.util.Scanner;



public class PersonaServicio {
    public static Persona crearPersona(){
        Persona aPersona = new Persona();
        System.out.println("Ingresar nombre de la persona");
        Scanner scan = new Scanner(System.in);
        aPersona.setNombre(scan.nextLine());
        aPersona.setFecNac(FechaServicio.fechaNacimiento());
        return aPersona;
    }

    public static int calcularEdad(Persona aPersona){
        return FechaServicio.edadUsuario(aPersona.getFecNac(), new Date());

    }

    public static boolean menorQue(Persona aPersona, int Edad){
    return calcularEdad(aPersona) < Edad;
    }

    public static void mostrarPersona(Persona aPersona){
        System.out.println("Nombre de la persona: " + aPersona.getNombre());
        System.out.println("Fecha de nacimiento: " + aPersona.getFecNac());
    }
}

