
package Servicios;

import Entidades.Curso;

import java.util.Scanner;

public class CursoServicio {
    private static Scanner scan = new Scanner(System.in);

    public static Curso cargarAlumnos(Curso aCurso) {
        String[] nombre = new String[5];
        for (int i = 0; i <= 4; i++) {
            System.out.println("Cargar el alumno número: " + i);
            nombre[i] = scan.nextLine();

        }
        aCurso.setAlumnos(nombre);
        return aCurso;
    }

    public static Curso crearCurso(Curso aCurso) {
        System.out.println("Ingresar nombre de curso: ");
        aCurso.setNombreCurso(scan.nextLine());
        System.out.println("Ingresar cantidad de horas por dia: ");
        aCurso.setCantidadHorasPorDia(scan.nextInt());
        scan.nextLine();
        System.out.println("Ingresar cantidad de dias por semana: ");
        aCurso.setCantidadDiasPorSemana(scan.nextInt());
        scan.nextLine();
        System.out.println("Ingresar turno: ");
        aCurso.setTurno(scan.nextLine());
        System.out.println("Ingresar precio por hora: ");
        aCurso.setPrecioPorHora(scan.nextDouble());
        scan.nextLine();
        return cargarAlumnos(aCurso);

    }

    public static void calcularGananciaSemanal(Curso aCurso) {
        System.out.println("La ganacia semana es de " + (aCurso.getCantidadHorasPorDia() * aCurso.getCantidadDiasPorSemana() * aCurso.getAlumnos().length * aCurso.getPrecioPorHora()));
    }
}

