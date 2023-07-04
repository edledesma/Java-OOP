import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRect() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar base del rectangulo: ");
        this.base = scanner.nextInt();
        System.out.print("Ingresar altura del rectangulo: ");
        this.altura = scanner.nextInt();
    }

    public int Superficie() {
        return this.base * this.altura;
    }

    public int Perimetro() {
        return ((this.base * this.altura) * 2);
    }

    public void Dibujo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
