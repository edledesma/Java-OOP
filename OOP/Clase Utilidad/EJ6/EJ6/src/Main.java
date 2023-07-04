import Entidades.Curso;
import Servicios.CursoServicio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        Curso aCurso = new Curso();
        CursoServicio.crearCurso(aCurso);
        System.out.println("Los alumnos son:" + Arrays.toString(aCurso.getAlumnos()));
        CursoServicio.calcularGananciaSemanal(aCurso);
        }
}