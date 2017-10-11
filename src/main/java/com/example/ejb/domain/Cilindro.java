package com.example.ejb.domain;

public class Cilindro extends IntFiguras {

	private static final float PI = 3.1416f;
	
	private float r;
	private float h;
	
	public Cilindro(float r, float h) {
		super();
		this.r = r;
		this.h = h;
		this.setLados(Integer.MAX_VALUE);
		this.setCara(2);
		this.setVertices(Integer.MAX_VALUE);
		this.setImgPath("/img/cilindro.png");
	}

	@Override
	public float computeArea() {
		return (2*PI*r*(h+r));
	}

	@Override
	public float computerVolumen() {
		return PI*(r*r)*h;
	}
	
}
