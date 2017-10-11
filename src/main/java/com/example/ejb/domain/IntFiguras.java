package com.example.ejb.domain;

public abstract class IntFiguras {

	private int lados;
	private int cara;
	private int vertices;
	
	private String imgPath;
	
	
	public float computeArea() {
		return 0;
	}
	
	public float computerVolumen() {
		return 0;
	}
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	public int getCara() {
		return cara;
	}
	public void setCara(int cara) {
		this.cara = cara;
	}
	public int getVertices() {
		return vertices;
	}
	public void setVertices(int vertices) {
		this.vertices = vertices;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Override
	public String toString() {
		return "Lados: " + lados 
				+ " \nCara: " + cara
				+ " \nVertices: " + vertices;
	}		
	
}
