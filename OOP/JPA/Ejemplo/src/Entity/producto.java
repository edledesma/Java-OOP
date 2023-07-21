package Entity;
import javax.persistence.*;

@Entity
public class producto {
    @Id
    private int codigo;
    private String nombre;

    public producto() {
    }

    public producto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
