package eggit.clase4a6Extras;

/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación,
realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D
 tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class E2ValoresEnteros {
    public static void main(String[] args){
        int varA,varB,varC,varD,varAuxiliar;
        varA = 1;
        varB = 2;
        varC = 3;
        varD = 4;
        System.out.println("The originals values were:");
        System.out.println("A:"+varA);
        System.out.println("B:"+varB);
        System.out.println("C:"+varC);
        System.out.println("D:"+varD);
        varAuxiliar = varB;
        varB = varC;
        varC = varA;
        varA = varD;
        varD = varB;
        System.out.println("The new values are:");
        System.out.println("A:"+varA);
        System.out.println("B:"+varB);
        System.out.println("C:"+varC);
        System.out.println("D:"+varD);

    }
}

