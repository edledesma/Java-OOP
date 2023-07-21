package Entity;

import jakarta.persistence.*;

@Entity // Indica que esta clase es una entidad mapeada a una tabla en la base de datos.
public class Empleado {

    @Id // Indica que este atributo es la clave primaria de la entidad.
    @GeneratedValue (strategy = GenerationType.SEQUENCE)// Especifica que el valor de este atributo será generado automáticamente por la base de datos.
    private int id;

    @Column(name = "nombre") // Mapea este atributo a la columna "nombre" en la tabla de la base de datos.
    private String primerNombre;

    @Column(name = "apellido") // Mapea este atributo a la columna "apellido" en la tabla de la base de datos.
    private String primerApellido;

    public Empleado() {
    }

    public Empleado(int id, String primerNombre) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.primerApellido = primerNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String nombre) {
        this.primerNombre = nombre;

    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String apellido) {
        this.primerApellido = apellido;
    }
}
