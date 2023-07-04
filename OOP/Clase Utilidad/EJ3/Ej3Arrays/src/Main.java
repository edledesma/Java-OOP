
import Services.ArregloService;

public class Main {
    public static void main(String[] args) {

        double[] arrayA = new double[50];
        double[] arrayB = new double[20];
        System.out.println("______________MOSTRAR____________");
        ArregloService.mostrar(arrayA);
        System.out.println("______________INICIALIZAR_A____________");
        ArregloService.inicializarA(arrayA);
        ArregloService.mostrar(arrayA);
        System.out.println("_______________ORDENAR_A___________");
        ArregloService.ordenar(arrayA);
        ArregloService.mostrar(arrayA);
        System.out.println("______INICIALIZAR_B_______");
        ArregloService.inicializarB(arrayA,arrayB);
        System.out.println("_________MOSTRAR_AMBAS_________");
        ArregloService.mostrar(arrayA);
        ArregloService.mostrar(arrayB);

    }
}