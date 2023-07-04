package eggit.guia5;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */

public class E4Matriz4x4 {
    public static void main(String[] args) {
        int [][] vMatrix = new int [4][4];
        int [][] vTransposedMatrix = new int [4][4];
        int vRandomNumber;
        for (int i = 0 ; i<=3;i++){
            for (int j=0; j<=3;j++){
                vRandomNumber = (int) (Math.random()*100);
                vMatrix[i][j] = vRandomNumber;
                System.out.println("The value of the vector at I " + i + " J "+ j +" is : " + (vMatrix[i][j]));
            }
            }
        System.out.println("----------------------------------");
        for (int i = 0 ; i<=3;i++) {
            for (int j = 0; j <= 3; j++) {
                vTransposedMatrix[j][i] = vMatrix[i][j];
                System.out.println("The value of the vector at I  " + i + " J "+ j +" is : " + (vTransposedMatrix[i][j]));
            }
        }
    }
}
