package com.bdconnectionstring.servlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Import del manejo del connection String
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

//Import del acceso a la base de datos
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class BDConnectionStringServlet
 */
@WebServlet("/BDConnectionStringServlet")
public class BDConnectionStringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		private DataSource dataSource;
		private Connection conn;
		private Statement st;
		
		
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BDConnectionStringServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

		//obtener la conexión
		try
		{
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			dataSource = (DataSource) envContext.lookup("jdbc/prueba");
		
		
		
		
		}
		catch(Exception e)
		{
			System.out.println("Ha sucedido la siguiente excepción:" +e);
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try
		{
			//Obtenemos la conexión y la sentencia SQL
			conn = (Connection) dataSource.getConnection();
			st = (Statement) conn.createStatement();
			String consulta = "SELECT * FROM usuarios";
			ResultSet rsDatos = st.executeQuery(consulta);
			while(rsDatos.next())
			{
				System.out.println(rsDatos.getInt("IdUsuario"));
				System.out.println(rsDatos.getInt("NombreUsuario"));
				System.out.println(rsDatos.getString("PasswordUsuario"));
				System.out.println(rsDatos.getString("email"));
				
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println("El error fue: " +e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
