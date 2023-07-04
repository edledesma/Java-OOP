package eggit.guia5;
/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente
 */
public class E1CienNum {
    public static void main(String[] args) {
        int [] vVector = new int[100];
        for (int i=0 ; i<vVector.length ; i++) {
            vVector[i] = i;
        }
        for (int i = 99; i>=0; i--) {
            System.out.println("Vector in position "+i+" has the value "+vVector[i]);
        }

    }
}
