import java.util.Scanner;

public class Operacion {
    private int number1;
    private int number2;

    public Operacion() {
    }

    public Operacion(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void crearOperacion() {
        Scanner aScan = new Scanner(System.in);
        System.out.println("Input number 1:");
        this.setNumber1(aScan.nextInt());
        System.out.println("Input number 2:");
        this.setNumber2(aScan.nextInt());
    }

    public int suma() {
        return this.number1 + this.number2;
    }

    public int resta() {
        return this.number1 - this.number2;
    }

    public int multi() {
        if (this.number2 == 0) {
            System.out.print("No se puede multiplicar por ");
            return 0;
        } else {

            return this.number1 * this.number2;
        }

    }

    public int div() {
        if (this.number2 == 0) {
            System.out.print("No se puede dividir por 0");
            return 0;
        } else {
            return this.number1 / this.number2;
        }
    }

    public void menu() {
        Scanner aScan = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Indicar el tipo de operacion deseado: ");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicacion");
        System.out.println("4: Division");
        System.out.println("-------------------------------");
        int vResponse = aScan.nextInt();
        switch (vResponse) {
            case 1 -> System.out.println(this.suma());
            case 2 -> System.out.println(this.resta());
            case 3 -> System.out.println(this.multi());
            case 4 -> System.out.println(this.div());
            default -> throw new IllegalStateException("Unexpected value: ");


        }
    }
}


