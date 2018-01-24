package com.ejemploJDBC;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class EjemploConector {

	
	public static void main(String[] args) throws SQLException 
	{
		// TODO Auto-generated method stub
		String surl="jdbc:mysql://127.0.0.1:3306/prueba";
		String susername="root";
		String spassword="root";
		Connection conn = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("La instancia se creó "
					+ "correctamente");
			conn = 
					(Connection) DriverManager.getConnection(
					surl,susername,spassword);
			conn.setAutoCommit(false);
			
			Statement sentenciaSQL = (Statement) conn.createStatement();
			
			String insertaRegistro1= 
					"INSERT INTO usuarios (IdUsuario, NombreUsuario,"
					+"PasswordUsuario, email) value (8, \"Usuario8\","+ "\" Usuario8\",\" usr8@gmail.com\")";
			String insertaRegistro2= 
					"INSERT INTO usuarios (IdUsuario, NombreUsuario,"
					+"PasswordUsuario, email) value (9, \"Usuario9\","+ "\" Usuario9\",\" usr9@gmail.com\")";
			sentenciaSQL.executeUpdate
			(insertaRegistro1);
			sentenciaSQL.executeUpdate
			(insertaRegistro2);
			
		/*	int registroAfectados=
				sentenciaSQL.executeUpdate(insertaRegistro1);
			int registroAfectados=
					sentenciaSQL.executeUpdate(insertaRegistro2);
			
			if (registroAfectados!=0)
			{
				System.out.println("Insercion Exitosa");
			}
		*/							
			
			ResultSet rsdatos= sentenciaSQL.executeQuery("SELECT IdProyecto, nombreProyecto FROM proyectos");
			while(rsdatos.next())
			{
			System.out.println("Id Proyectos: "+rsdatos.getInt("idproyecto"));
			System.out.println("El nombre del proyecto es: "+rsdatos.getString("nombreProyecto"));
	/*	    System.out.println("|"+rsdatos.getInt("idProyecto"));
			System.out.println("\t|"+rsdatos.getInt("NombreProyecto"));
			System.out.println("/t|"+rsdatos.getInt("montoProyecto"));
			System.out.println("___________________________________");
			*/
			}
						
			if(conn != null)
			{
				System.out.println("Conexión Exitosa!!");
			}
			
			rsdatos.close();
			sentenciaSQL.close();
			
			
		}
		catch(Exception pepe)
		{
			System.out.println("Hubo el siguiente error: "+
		pepe);
		}
		finally
		{
			conn.rollback();
			System.out.println("Hubo un Rollback");
			conn.close();
		}
		
		
	}

}
