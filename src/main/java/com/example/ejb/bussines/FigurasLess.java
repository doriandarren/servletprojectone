package com.example.ejb.bussines;

import javax.ejb.Stateless;

import com.example.ejb.domain.Cilindro;
import com.example.ejb.domain.Cono;
import com.example.ejb.domain.Cubo;
import com.example.ejb.domain.Esfera;

@Stateless
public class FigurasLess {

	
	public FigurasLess(){
		System.out.println("Construyendo Figura...");
	}
	
	/**
	 * Devuelve CILINDRO
	 * @param r
	 * @param h
	 * @return
	 */
	public float getAreaCilindro(float r, float h){
		Cilindro cil = new Cilindro(r, h);
		return cil.computeArea();	
	}
	
	public float getVolumenCilindro(float r, float h){
		Cilindro cil = new Cilindro(r, h);
		return cil.computerVolumen();			
	}
		
	public float getAreaCono(float r, float h){
		Cono cono = new Cono(h, r);
		return cono.computeArea();
	}
	
	public float getVolumenCono(float r, float h){
		Cono cono = new Cono(h, r);
		return cono.computerVolumen();
	}
	
	public float getAreaCubo(float a){
		Cubo cubo = new Cubo(a);
		return cubo.computeArea();
	}
	
	public float getVolumenCubo(float a){
		Cubo cubo = new Cubo(a);
		return cubo.computerVolumen();
	}
	
	public float getAreaEsfera(float a){
		Esfera esfera = new Esfera(a);
		return esfera.computeArea();
	}
	
	public float getVolumenEsfera(float a){
		Esfera esfera = new Esfera(a);
		return esfera.computerVolumen();
	}
	
}
