package principal.persistencia;

import java.sql.*;

public abstract  class DAO {
    protected Connection conn = null;
    protected  Statement stmt = null;
    protected ResultSet rs = null;

    private final String URL = "jdbc:mysql://localhost/tienda";
    private final String USER = "root";
    private final String PASS = "root";
    private final String DRIVER = "com.mysql.jdbc.driver";

    protected void conectarBase () throws   SQLException, ClassNotFoundException{
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException ex){
            throw ex;
        }
    }
    protected void desconectarBase () throws Exception{
        try{
            if (rs != null){
                rs.close();
            }
            if (stmt != null){
                stmt.close();
            }
            if (conn != null){
                conn.close();
            }
        }
    }
}
