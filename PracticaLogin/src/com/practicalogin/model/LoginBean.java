package com.practicalogin.model;

public class LoginBean {
	
	private String email;
	private String password;
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String _email)
	{
		email=_email;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String _password)
	{
		password=_password;
	}
	
	public boolean validateLogin(String _email, String _password)
	{
		boolean isValid=false;
		
		if(_email.equals("admin@admin.com")&& _password.equals("admin"))
		{
			isValid=true;
		}
		else
		{
			isValid=false;
		}
		
		return isValid;
	}
	
	
	
}
