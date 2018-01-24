package com.generationhomework.semana3;

public class Triangulo extends Figuras{

	private float fSide;
	private float fHeight;

	public float calculatePerimeter(float fSide)
	{
		setfPerimeter(fSide*3);
		return getfPerimeter();
	}
	
	public float calculateArea(float fSide,float fHeight)
	{
		setfArea((fSide*fHeight)/2);
		return getfArea();
	}
	
	public float getfSide() {
		return fSide;
	}

	public void setfSide(float fSide) {
		this.fSide = fSide;
	}

	public float getfHeight() {
		return fHeight;
	}

	public void setfHeight(float fHeight) {
		this.fHeight = fHeight;
	}

}
