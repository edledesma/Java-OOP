package Entidades;
/*
Persona con atributos: nombre, apellido, edad, documento y Perro.
 */
public class Persona {
    String nombre;
    String apellido;
    Integer edad;
    String documento;

    Perro Perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, String documento, Entidades.Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        Perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Entidades.Perro getPerro() {
        return Perro;
    }

    public void setPerro(Entidades.Perro perro) {
        Perro = perro;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Edad: " + this.edad);
        System.out.println("Documento: " + this.documento);
        System.out.println("Perro: ");
        System.out.println("Nombre: " + this.Perro.nombre);
        System.out.println("Raza: " + this.Perro.raza);
        System.out.println("Edad: " + this.Perro.edad);
        System.out.println("Tamaño: " + this.Perro.tamano);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                ", Perro=" + Perro +
                '}';
    }
}
