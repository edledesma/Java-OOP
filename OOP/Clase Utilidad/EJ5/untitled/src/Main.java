import Entidades.Persona;
import Servicios.PersonaServicio;

public class Main {
    public static void main(String[] args) {
    Persona persona = PersonaServicio.crearPersona();
        PersonaServicio.mostrarPersona(persona);
        System.out.println("La edad de la persona es: "+ PersonaServicio.calcularEdad(persona));
        System.out.println("La edad es de la persona es menor a 11: " + PersonaServicio.menorQue(persona, 11));
    }
}