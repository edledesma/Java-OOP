package eggit.mascotapp;

import eggit.mascotapp.entidades.Mascota;

public class mascotmain {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Jose Luis","Pepe","Perro","Rojo",23,true,"Caniche");


        m1.pasear(100);
        System.out.println(m1.toString());


    }
}
