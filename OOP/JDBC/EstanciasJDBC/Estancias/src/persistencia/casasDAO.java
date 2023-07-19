package persistencia;

import java.sql.ResultSet;
import entidades.casa;
import java.util.Scanner;
public final class casasDAO extends DAO{

    Scanner leer = new Scanner(System.in);
    casasDAO cas = new casasDAO();
    public void casaSeleccionar() throws Exception {
        try {
            String sql = "SELECT id_casa, calle FROM casas";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Id Casa: " + rs.getInt("id_casa") + ", Calle: " + rs.getString("calle"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void casaInsertar(casa casa) throws Exception {
        try {
            String sql = "INSERT INTO casas (calle) VALUES ('" + casa.getCalle() + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    public void cerrarScanner() {
        leer.close();
    }
}

