import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
}

class EstudianteService {
    public double calcularPromedio(Estudiante[] Estudiantes) {
        double sumaNotas = 0;
        for (Estudiante estudiante : Estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        return sumaNotas / Estudiantes.length;
    }

    public List<String> obtenerNombresSuperiorPromedio(Estudiante[] Estudiantes, double promedio) {
        List<String> nombresSuperiorPromedio = new ArrayList<>();
        for (Estudiante estudiante : Estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombresSuperiorPromedio.add(estudiante.getNombre());
            }
        }
        return nombresSuperiorPromedio;
    }
}

public class PromedioEstudiantes {
    public static void main(String[] args) {
        Estudiante[] Estudiantes = new Estudiante[8];

        // Crear los 8 estudiantes con sus respectivas notas
        Estudiantes[0] = new Estudiante("Estudiante 1", 7.5);
        Estudiantes[1] = new Estudiante("Estudiante 2", 8.2);
        Estudiantes[2] = new Estudiante("Estudiante 3", 6.9);
        Estudiantes[3] = new Estudiante("Estudiante 4", 9.1);
        Estudiantes[4] = new Estudiante("Estudiante 5", 7.8);
        Estudiantes[5] = new Estudiante("Estudiante 6", 8.7);
        Estudiantes[6] = new Estudiante("Estudiante 7", 6.5);
        Estudiantes[7] = new Estudiante("Estudiante 8", 8.9);

        EstudianteService estudianteService = new EstudianteService();

        // Calcular y mostrar el promedio de notas de todo el curso
        double promedio = estudianteService.calcularPromedio(Estudiantes);
        System.out.println("El promedio de notas del curso es: " + promedio);

        // Obtener los nombres de los alumnos con nota mayor al promedio
        List<String> nombresSuperiorPromedio = estudianteService.obtenerNombresSuperiorPromedio(Estudiantes, promedio);

        // Mostrar todos los estudiantes con nota mayor al promedio
        System.out.println("Estudiantes con nota mayor al promedio:");
        for (Estudiante estudiante : Estudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante.getNombre() + ": " + estudiante.getNota());
            }
        }
    }
}