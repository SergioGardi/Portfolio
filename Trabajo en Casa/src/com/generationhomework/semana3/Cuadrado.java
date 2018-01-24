package com.generationhomework.semana3;

public class Cuadrado extends Figuras {

	private float fBase;
	private float fHeight;

	public float calculateArea(float fBase, float fHeight) {
		setfArea(fBase * fHeight);
		return getfArea();
	}

	public float calculatePerimeter(float fBase) {
		setfPerimeter(fBase * 4);
		return getfPerimeter();
	}

	public float getfBase() {
		return fBase;
	}

	public void setfBase(float fBase) {
		this.fBase = fBase;
	}

	public float getfHeight() {
		return fHeight;
	}

	public void setfHeight(float fHeight) {
		this.fHeight = fHeight;
	}

}
