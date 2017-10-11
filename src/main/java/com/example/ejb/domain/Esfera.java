package com.example.ejb.domain;


public class Esfera extends IntFiguras{

	private float r;
	private static final float PI=3.1416f;
	
	
	public Esfera(float r) {
		super();
		this.r = r;
		this.setLados(0);
		this.setCara(0);
		this.setVertices(Integer.MAX_VALUE);
		this.setImgPath("/img/esfera.png");
	}

	@Override
	public float computeArea() {
		return 4*PI*(r*r);
	}

	@Override
	public float computerVolumen() {
		return ((float) (4*PI*(r*r*r))/3);
	}

}
