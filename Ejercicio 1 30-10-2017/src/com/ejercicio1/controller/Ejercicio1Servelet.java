package com.ejercicio1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ejercicio1Servelet
 */
@WebServlet("/Ejercicio1Servelet")
public class Ejercicio1Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio1Servelet() {
        super();
        // TODO Auto-generated constructor stub
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
		doGet(request, response);
		
	String snum1; int inum1;
	String snum2; int inum2;
	snum1=request.getParameter("txtnumber1");
	snum2=request.getParameter("txtnumber2");
	
	inum1=Integer.parseInt(snum1);
	inum2=Integer.parseInt(snum2);
	
	for (int i=inum1; i<=inum2; i++)
	{
		response.getWriter().append("</br>"+i);
	}
	for (int i=inum1; i<=inum2; i--)
	{
		response.getWriter().append("</br>"+i);
	}	
	int i=inum1;
	while (i<inum2)
		{
			response.getWriter().append(" "+i);
			i++;
		}
	while (i<=inum2);
		{
			response.getWriter().append(" " +i);
			i--;
		}
		
	}

}
