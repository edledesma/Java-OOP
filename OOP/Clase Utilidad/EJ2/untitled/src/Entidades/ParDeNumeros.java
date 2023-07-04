package Entidades;
/*
* Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se
realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos números.*/
public class ParDeNumeros {
    private double numero1;
    private double numero2;

    public ParDeNumeros() {
        this.numero1 = (Math.random()*10);
        this.numero2 = (Math.random()*10);
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" +
                "Numero1: " + numero1 +
                ", Numero2: " + numero2 +
                '}';
    }
}



