package com.generationhomework.semana3;

public class Trapecio extends Figuras{

	private float fMajorBase;
	private float fMinorBase;
	private float fLeftOblique;
	private float fRightOblique;
	private float fHeight;
	
	

	public float calculatePerimeter(float fMajorBase, float fMinorBase, float fLeftOblique, float fRightOblique)
	{
		setfPerimeter(fMajorBase+fMinorBase+fLeftOblique+fRightOblique);
		return getfPerimeter();
	}
	
	public float calculateArea(float fMajorBase,float fMinorBase,float fHeight)
	{
		setfArea(fHeight*((fMajorBase+fMinorBase)/2));
		return getfArea();
	}
	
	public float getfHeight() {
		return fHeight;
	}

	public void setfHeight(float fHeight) {
		this.fHeight = fHeight;
	}
	
	public float getfMajorBase() {
		return fMajorBase;
	}
	public void setfMajorBase(float fMajorBase) {
		this.fMajorBase = fMajorBase;
	}
	public float getfMinorBase() {
		return fMinorBase;
	}
	public void setfMinorBase(float fMinorBase) {
		this.fMinorBase = fMinorBase;
	}
	public float getfLeftOblique() {
		return fLeftOblique;
	}
	public void setfLeftOblique(float fLeftOblique) {
		this.fLeftOblique = fLeftOblique;
	}
	public float getfRightOblique() {
		return fRightOblique;
	}
	public void setfRightOblique(float fRightOblique) {
		this.fRightOblique = fRightOblique;
	}
}
