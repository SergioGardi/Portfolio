package com.generationhomework.semana3;

public class Rombo extends Figuras {
	
	private float fSide;
	private float fMajorDiagonal;
	private float fMinorDiagonal;
	
	public float calculateArea(float fMajorDiagonal, float fMinorDiagonal) {
		setfArea((fMajorDiagonal * fMinorDiagonal)/2);
		return getfArea();
	}

	public float calculatePerimeter(float fSide) {
		setfPerimeter(fSide * 4);
		return getfPerimeter();
	}
	
	public float getfSide() {
		return fSide;
	}
	public void setfSide(float fSide) {
		this.fSide = fSide;
	}
	public float getfMajorDiagonal() {
		return fMajorDiagonal;
	}
	public void setfMajorDiagonal(float fMajorDiagonal) {
		this.fMajorDiagonal = fMajorDiagonal;
	}
	public float getfMinorDiagonal() {
		return fMinorDiagonal;
	}
	public void setfMinorDiagonal(float fMinorDiagonal) {
		this.fMinorDiagonal = fMinorDiagonal;
	}
	
	
	
}
