import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Circunferencia aCirc = new Circunferencia();
    crearCircunferencia(aCirc);
    crearArea(aCirc);
    crearPerimetro(aCirc);
    }
    public static void crearCircunferencia(Circunferencia circ){
        Scanner aScanner = new Scanner(System.in);
        System.out.println("Input the radius");
        circ.setRadio(aScanner.nextDouble());

    }
    public static void crearArea(Circunferencia circ){
        double vArea = Math.PI* circ.getRadio()* circ.getRadio();
        System.out.println("The value of the area is " + vArea);
    }
    public static void crearPerimetro(Circunferencia circ){
        double vPerimeter = 2*Math.PI*circ.getRadio();
        System.out.println("The value of the perimeter is " + vPerimeter);

    }
}