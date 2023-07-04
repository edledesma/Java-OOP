import Entidades.Perro;
import Entidades.Persona;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Jaz","Caniche",3,"Chiquito");
        Perro perro2 = new Perro("Leo","Pitubull",1,"Mediano");

        Persona persona1 = new Persona("Daniel","Altamira",35,"1251251",perro1);
        Persona persona2 = new Persona("Florencia","Pasconi",23,"1953251",perro2);

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();

        System.out.println(perro1.toString());

    }
}