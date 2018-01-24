package com.generationhomework.semana3;

public class Circulo extends Figuras {

	private float fRadio;

	public float calculatePerimeter(float fRadio)
	{
		setfPerimeter((float) (2*Math.PI*fRadio));
		return getfPerimeter();
	}
	
	public float calculateArea(float fRadio)
	{
		setfArea((float) (Math.PI*Math.pow(fRadio, 2)));
		return getfArea();
	}
	
	public float getRadio() {
		return fRadio;
	}

	public void setRadio(float fRadio) {
		this.fRadio = fRadio;
	}
	
}
