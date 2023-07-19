package persistencia;

import java.sql.*;

public abstract class DAO {

    protected Connection conn = null;    // Represents the connection to the database
    protected Statement stmt = null;     // Represents a SQL statement
    protected ResultSet rs = null;       // Represents the result of a database query

    private final String URL = "jdbc:mysql://localhost:3306/estancias_exterior";  // URL of the database
    private final String USER = "root";       // Username for the database connection
    private final String PASSWORD = "root";   // Password for the database connection
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";   // JDBC driver class

    protected void conectarBase() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(DRIVER);   // Load the JDBC driver class
            conn = DriverManager.getConnection(URL, USER, PASSWORD);   // Establish a connection to the database
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;   // Throw any exceptions that occur during connection establishment
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (rs != null) {
                rs.close();   // Close the ResultSet if it's not null
            }
            if (stmt != null) {
                stmt.close();   // Close the Statement if it's not null
            }
            if (conn != null) {
                conn.close();   // Close the Connection if it's not null
            }
        } catch (Exception ex) {
            throw ex;   // Throw any exceptions that occur during closing of database resources
        }
    }

    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase();   // Connect to the database
            stmt = conn.createStatement();   // Create a Statement object
            stmt.executeUpdate(sql);   // Execute the SQL statement (for insert, update, or delete operations)
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;   // Throw any exceptions that occur during the execution of the SQL statement
        } finally {
            desconectarBase();   // Ensure the connection is closed even if an exception occurs
        }
    }

    protected ResultSet select(String sql) throws Exception {
        try {
            conectarBase();   // Connect to the database
            stmt = conn.createStatement();   // Create a Statement object
            rs = stmt.executeQuery(sql);   // Execute the SQL query and get the ResultSet
            return rs;   // Return the ResultSet
        } catch (Exception ex) {
            throw ex;   // Throw any exceptions that occur during the execution of the SQL query
        }
    }
}