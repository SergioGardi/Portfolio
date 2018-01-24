package com.ejemplojsf.modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


@ManagedBean(name= "HelloWorld", eager=true)
@RequestScoped

public class HelloWorld {
	//Propiedad ManagedProperty
	@ManagedProperty (value="#{message}")
	
	
	//Agregamos dos propiedades
	private Message messageBean;
	private String message;
	
	//Agregamos un Constructor
	public HelloWorld()
	{
		System.out.println("Hello World Started !!!");
	}
	//Agregamos Getters y Setters de las propiedades
	public String getMessageBean() {
		if(messageBean !=null)
		{
			message = messageBean.getMessage();
		}
		return message;
	}

	public void setMessageBean(Message message) {
		this.messageBean = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
