package com.example.ejb.domain;

public class Cubo extends IntFiguras{

	private float a;
	
	public Cubo(float a) {
		super();
		this.a = a;
		this.setLados(6);
		this.setCara(6);
		this.setVertices(8);
		this.setImgPath("/img/cubo.png");
	}

	@Override
	public float computeArea() {
		return 6*(a*a);
	}

	@Override
	public float computerVolumen() {
		return a*a*a;
	}

}
