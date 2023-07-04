public class Main {
    public static void main(String[] args) {
        Rectangulo aRectangulo = new Rectangulo();
        aRectangulo.crearRect();
        System.out.println("La superficie es: "+aRectangulo.Superficie());
        System.out.println("El perimetro es: " +aRectangulo.Perimetro());
        aRectangulo.Dibujo();
    }
}