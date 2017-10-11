package com.example.ejb.domain;

public class Cono extends IntFiguras{

	private static final float PI=3.1416f;

	private float h;
	private float r;
	private float g;
	
	public Cono(float r, float h) {
		this.h = h;
		this.r = r;
		this.g = (float) Math.sqrt((r*r) + (h*h));
		this.setLados(Integer.MAX_VALUE);
		this.setCara(1);
		this.setVertices(1);
		this.setImgPath("/img/cubo.png");
	}

	@Override
	public float computeArea() {
		return PI*(r*r) + (PI * r * g);
	}

	@Override
	public float computerVolumen() {
		return (PI*(r*r) * h) / 3;
	}
	
}
