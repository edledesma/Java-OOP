import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operacion aOperacion = new Operacion();
        boolean continuar = true;
        Scanner aScan = new Scanner(System.in);
        aOperacion.crearOperacion();
        aOperacion.menu();
        while (continuar==true) {
            System.out.println("¿Desea realizar otra operacion?");
            String respuesta = aScan.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                aOperacion.crearOperacion();
                aOperacion.menu();
            }else{
                continuar = false;
            }
        }


    }
}
