package persistencia;

import entidades.Producto;
import java.sql.ResultSet;

public class ProductoDAO extends DAO {

    public void productoTodos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto";  // SQL query to retrieve the name from the "producto" table
            ResultSet rs = select(sql);  // Execute the SQL query and get the ResultSet
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre"));  // Print the name retrieved from the ResultSet
            }

        } catch (Exception e) {
            throw e;  // Throw any exceptions that occur during the process
        }
    }

    public void productoNombrePrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto";  // SQL query to retrieve the name and price from the "producto" table
            ResultSet rs = select(sql);  // Execute the SQL query and get the ResultSet
            while (rs.next()) {
                System.out.println("Producto: " + rs.getString("nombre") + ", Precio: " + rs.getDouble("precio"));  // Print the name and price retrieved from the ResultSet
            }
        } catch (Exception e) {
            throw e;  // Throw any exceptions that occur during the process
        }
    }

    public void productoPrecioEntre() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto WHERE precio BETWEEN 120 AND 200";  // SQL query to retrieve the name from the "producto" table where the price is between 120 and 200
            ResultSet rs = select(sql);  // Execute the SQL query and get the ResultSet
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre"));  // Print the name retrieved from the ResultSet
            }
        } catch (Exception e) {
            throw e;  // Throw any exceptions that occur during the process
        }
    }

    public void productoPortatil() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE nombre LIKE 'Portatil%'";  // SQL query to retrieve the name and price from the "producto" table where the name starts with 'Portatil'
            ResultSet rs = select(sql);  // Execute the SQL query and get the ResultSet
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre") + ", Precio: " + rs.getDouble("precio"));  // Print the name and price retrieved from the ResultSet
            }
        } catch (Exception e) {
            throw e;  // Throw any exceptions that occur during the process
        }
    }

    public void productoBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1";  // SQL query to retrieve the name and price from the "producto" table ordered by price and limited to 1 row
            ResultSet rs = select(sql);  // Execute the SQL query and get the ResultSet
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre") + ", Precio: " + rs.getDouble("precio"));  // Print the name and price retrieved from the ResultSet
            }
        } catch (Exception e) {
            throw e;  // Throw any exceptions that occur during the process
        }
    }

    public void productoInsertar(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("El Producto es nulo (null)");  // Throw an exception if the Producto object is null
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('" + producto.getNombre()
                    + "', " + producto.getPrecio() + ", " + producto.getCodigoFabricante() + ")";  // SQL query to insert data into the "producto" table
            insertarModificarEliminar(sql);  // Execute the SQL query for inserting data

        } catch (Exception e) {
            throw e;  // Throw any exceptions that occur during the process
        }
    }

    public void productoModificar(Producto producto, String nombreProducto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("El Producto es nulo (null)");  // Throw an exception if the Producto object is null
            }
            String sql = "UPDATE producto SET nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio()
                    + ", codigo_fabricante = " + producto.getCodigoFabricante() + " WHERE nombre = '" + nombreProducto
                    + "';";  // SQL query to update data in the "producto" table based on the given nombreProducto
            insertarModificarEliminar(sql);  // Execute the SQL query for updating data
        } catch (Exception e) {
            throw e;  // Throw any exceptions that occur during the process
        }
    }
}
