package com.generationhomework.semana3;

public class Rectangulo extends Figuras {

	private float fBase;
	private float fAltura;
	
	public float calculatePerimeter(float fBase,float fAltura)
	{
		setfPerimeter((2*fBase)+(2*fAltura));
		return getfPerimeter();
	}
	
	public float calculateArea(float fBase, float fAltura)
	{
		setfArea(fBase*fAltura);
		return getfArea();
	}
	
	public float getfBase() {
		return fBase;
	}
	public void setfBase(float fBase) {
		this.fBase = fBase;
	}
	public float getfAltura() {
		return fAltura;
	}
	public void setfAltura(float fAltura) {
		this.fAltura = fAltura;
	}
	
	
}
