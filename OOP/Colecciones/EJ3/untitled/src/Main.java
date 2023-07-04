import Entidades.Alumno;
import Servicios.AlumnoServicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> ArrayAlumno = new ArrayList<Alumno>();
        AlumnoServicio.crearAlumno(ArrayAlumno);
        for (Alumno alumno : ArrayAlumno){
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getNotas());

        }
        int notaFinal = AlumnoServicio.existeAlumno(ArrayAlumno);
        if (notaFinal>0) {
            System.out.println("El promedio del alumno es: " + notaFinal);
        }else{
            System.out.println("No existe el alumno.");
        }


    }
}