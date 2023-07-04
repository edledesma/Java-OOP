
import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

public class Main {
    public static void main(String[] args) {

        ParDeNumeros aPar = new ParDeNumeros();


        ParDeNumerosService.mostrarValores(aPar.getNumero1(),aPar.getNumero2());
        System.out.println("El numero mayor es " +ParDeNumerosService.devolverMayor(aPar.getNumero1(),aPar.getNumero2()));
        ParDeNumerosService.calcularPotencia(aPar.getNumero1(),aPar.getNumero2());
        ParDeNumerosService.calcularRaiz(aPar.getNumero1(),aPar.getNumero2());
    }
}