package Servicios;

import Entidades.Cadena;

import java.util.Scanner;

public class CadenaServicio {

    private Cadena cadena;
    public CadenaServicio(Cadena cadena) {
        this.cadena = cadena;
    }

    public void mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char vChar = cadena.getFrase().toLowerCase().charAt(i);
            if (vChar=='a'||vChar=='e'||vChar=='i'||vChar=='o'||vChar=='u'||vChar=='á'|| vChar=='é'||vChar=='í'||vChar=='ó'||vChar=='ú'){
            contador++;
            }
        }
        System.out.println("La cadena tiene "+ contador +" vocales");
    }
    public void invertirFrase() {
        char[] vA = cadena.getFrase().toCharArray();
        String invertir = "";
        for (int i = vA.length-1; i>=0; i--) {
        invertir += vA[i];
        }
        System.out.println(invertir);
    }

    public void vecesRepetido(){

    }

    public void comprarLongitud(String frase){
        if(frase.length() == cadena.getLongitud()){
            System.out.println("Tienen la misma longitud");
        }else{
            System.out.println("No tienen la misma longitud");
        }

    }

    public void unirFrases(String frase){
        System.out.println(cadena.getFrase() + " " + frase);
    }

    public void reemplazar(String letra){


    }
    public boolean contiene(String letra){
        return cadena.getFrase().contains(letra);

    }


}
