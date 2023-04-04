package eggit.guia4;

import java.util.Scanner;

public class E1Calculadora {

    public static void main(String [] args){
        boolean stillIn = true;
        do {
            System.out.println("Input two values: ");
            Scanner anIntIn = new Scanner(System.in);
            Scanner aStr = new Scanner(System.in);
            int value1 = anIntIn.nextInt();
            int value2 = anIntIn.nextInt();
            System.out.println("Select desired operation");
            System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit");
            int oper = anIntIn.nextInt();
            switch (oper) {
                case 1:
                    System.out.println("The result of the addition is: " + fSuma(value1, value2));
                    break;

                case 2:
                    System.out.println("The result of the subtraction is: " + fSubstraction(value1, value2));
                    break;
                case 3:
                    System.out.println("The result of the multiplication is: " + fMultiplication(value1, value2));
                    break;
                case 4:
                    if (value2 == 0) {
                        System.out.println("It's not possible to divide by 0");
                        break;
                    } else {
                        System.out.println("The result of the division is: " + fDivision(value1, value2));
                        break;
                    }
                case 5:
                    System.out.println("Are you sure you want to quit? Y/N");
                    String confir = aStr.nextLine();
                    if (confir.equalsIgnoreCase("Y")) {
                        stillIn = false;
                        break;
                    }
                default:
                    System.out.println("Please try again.");

            }

        }
        while (stillIn);

}
    public static int fSuma(int vNum1, int vNum2){
        return vNum1+vNum2;
    }

    public static int fSubstraction(int vNum1, int vNum2){
        return vNum1-vNum2;
    }

    public static int fMultiplication(int vNum1, int vNum2){
        return vNum1*vNum2;
    }

    public static int fDivision(int vNum1, int vNum2){
        return vNum1 / vNum2;
        }
    }

