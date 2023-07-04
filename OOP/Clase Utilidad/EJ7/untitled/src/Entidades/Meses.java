package Entidades;

public class Meses {
    public String[] aMeses = {"enero","febrero","marzo","april","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    public Meses() {
    }


    public Meses(String[] vMeses) {
        this.aMeses = vMeses;
    }

    public String[] getvMeses() {
        return aMeses;
    }

    public void setvMeses(String[] vMeses) {
        this.aMeses = vMeses;
    }

}

