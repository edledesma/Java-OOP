package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    private static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Alumno> crearAlumno(ArrayList<Alumno> aAlumno) {

        boolean cont = true;
        Scanner scanner = new Scanner(System.in);
        String respuesta = "";
        do {
            Alumno vAlumno = new Alumno();
            System.out.println("Ingresar nombre de alumno: ");
            vAlumno.setNombre(scanner.nextLine());
            System.out.println("Ingresar Primer nota: ");
            vAlumno.notas.add(scanner.nextInt());
            System.out.println("Ingresar Segunda nota: ");
            vAlumno.notas.add(scanner.nextInt());
            System.out.println("Ingresar Tercer nota: ");
            vAlumno.notas.add(scanner.nextInt());
            scanner.nextLine();
            aAlumno.add(vAlumno);
            System.out.println("¿Desea ingresar otro alumno?");
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                cont = false;
                break;
            }
        } while (cont == true);
        return aAlumno;
    }

    public static int existeAlumno(ArrayList<Alumno> aAlumno) {
        System.out.println("Ingresar nombre de alumno para calcular nota final: ");
        String vAlumno = scanner.nextLine();
        for (Alumno i : aAlumno) {
            if (vAlumno.equalsIgnoreCase(i.getNombre())) {
                return notaFinal(i);
            }
        }
        return -1;
    }

    public static int notaFinal(Alumno vAlumno) {
        return (vAlumno.getNotas().get(0)+vAlumno.getNotas().get(1)+vAlumno.getNotas().get(2))/3;
    }
}











