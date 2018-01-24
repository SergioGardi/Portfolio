package com.jdbcs.ejemplobd.serveltBD;

import java.util.*;
import java.sql.*;
import javax.servlet.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EjemploJDBCServlet
 * @param <Conection>
 */
@WebServlet("/EjemploJDBCServlet")
public class EjemploJDBCServlet<Conection> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploJDBCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("");
		
		Connection conn= null; 
		Statement st= null;
		ResultSet rs= null;
		StringBuffer sb= new StringBuffer();
		String surl= "jdbc:mysql://localhost:3306/prueba";
		String suser= "root";
		String spass= "root";
		String usuarioIntroducido= request.getParameter("txtUsername");
		String passwordIntroducido= request.getParameter("txtPassword");
		
		try
		{
			//Iniciamos el connector
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			//Creamos la conexión
			conn= (Connection) DriverManager.getConnection(surl,suser,spass);
			
			/*
			st= (Statement) conn.createStatement();
			rs = st.executeQuery("SELECT * FROM usuarios WHERE nombreUsuario='"+
			usuarioIntroducido+"'and passwordUsuario='" +passwordIntroducido+ "';");
			
		if (rs==null)
		{
			response.getWriter().append("Resulset esta vacio");
			response.sendRedirect("index.jsp");
		}
		else
		{
			rs.next();
			response.getWriter().append("resultSet no esta vacio");
			response.getWriter().append("Id Usuario:" +rs.getInt("IdUsuario"));
			response.getWriter().append("Nombre Usuario:" +rs.getString("nombreUsuario"));
			
		}*/
			//Cerramos la conexión
			conn.close();
		}
		catch(Exception e)
		{
			response.getWriter().append(" Conexión Fallida. Excepcion:" +e);
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
