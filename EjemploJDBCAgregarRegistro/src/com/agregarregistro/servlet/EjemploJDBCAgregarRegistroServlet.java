package com.agregarregistro.servlet;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class EjemploJDBCAgregarRegistroServlet
 */
@WebServlet("/EjemploJDBCAgregarRegistroServlet")
public class EjemploJDBCAgregarRegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploJDBCAgregarRegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//Declaramos variables y objetos
		String sUrl="jdbc:mysql://localhost:3306/prueba";
		String sUser = "root";
		String sPass = "root";
		String sSQL = "SELECT * FROM usuarios";
		
		System.out.println("Testo2");
		Connection conn;
		Statement st;
		ResultSet rsDatos;
		
		//Abrimos conexión y traemos información
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = (Connection) DriverManager.getConnection(sUrl,sUser,sPass);
			st = (Statement) conn.createStatement();
			rsDatos = st.executeQuery(sSQL);
			while(rsDatos.next())
			{
				response.getWriter().append(rsDatos.getInt("idusuario")+"<br/>");
				response.getWriter().append(rsDatos.getString("nombreUsuario")+"<br/>");
				response.getWriter().append(rsDatos.getString("passwordUsuario")+"<br/>");
				response.getWriter().append(rsDatos.getString("emailUsuario")+"<br/>");
			}
			
			//Cerramos conexión
			conn.close();
			st.close();
			rsDatos.close();
		}
		catch(Exception e)
		{
			response.getWriter().append("El Error ocurrido es:"+e);
		}
		
	}

}