package eggit.guia5;

/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica
cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class E5Antisimetrica {
    public static void main(String[] args) {
        int [][] vMatrix = {
                {0,-2,4},
                {2,0,2},
                {-4,-2,0}
                };
        int vMatrixRows = vMatrix.length;
        System.out.println("There are "+ vMatrixRows + " rows.");
        int vMatrixColumns = vMatrix[0].length;
        System.out.println("There are "+ vMatrixColumns + " columns.");
        if (vMatrixRows == vMatrixColumns){
            System.out.println("La matriz es cuadrada");
            int vCounter = 0;
            for (int i = 0; i < vMatrixRows;i++){
                for (int j= 0; j < vMatrixColumns;j++){
                    if (vMatrix[i][j] != -vMatrix[j][i])  {
                        vCounter++;}
                }
            }
            if (vCounter>0){
                System.out.println("The matrix is not antisymmetric");
            }else{
                System.out.println("The matrix is antisymmetric");}
        }else{
            System.out.println("The matrix is not antisymmetric.");
        }
    }
}

