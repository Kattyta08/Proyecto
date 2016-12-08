
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Conexion {
   private static Connection conn;
	private static String base="Proyecto_final";// nombre de la base
	private static String url="jdbc:postgresql://localhost:5433/"+base;
	private static String user="postgres";
	private static String pass="1234";
		
	public static Connection Open() throws SQLException {
		conn=DriverManager.getConnection(url,user,pass);
		return conn;
	}
	
	public static void Close() throws SQLException {
		conn.close();
		
	}

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}