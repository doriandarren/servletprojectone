package com.test.servletprojectone;

import org.junit.Assert;
import org.junit.Test;

import com.example.ejb.domain.Cilindro;
import com.example.ejb.domain.Cono;
import com.example.ejb.domain.Cubo;
import com.example.ejb.domain.Esfera;

public class TestFiguras {

	@Test
	public void testCilindro(){
		Cilindro cilindro = new Cilindro(2, 3);
		float area = cilindro.computeArea();		
		Assert.assertEquals(62.83, area, 0.1);
		float volumen = cilindro.computerVolumen();
		Assert.assertEquals(37.7, volumen, 0.1);
	}
	
	@Test
	public void testCono(){
		Cono cono = new Cono(2, 3);
		float area = cono.computeArea();		
		Assert.assertEquals(35.22, area, 0.1);
		float volumen = cono.computerVolumen();
		Assert.assertEquals(12.57, volumen, 0.1);
	}
	
	
	@Test
	public void testCubo(){
		Cubo cubo = new Cubo(3);
		float area = cubo.computeArea();		
		Assert.assertEquals(54, area, 0.1);
		float volumen = cubo.computerVolumen();
		Assert.assertEquals(27, volumen, 0.1);
	}
	
	
	@Test
	public void testEsfera(){
		Esfera esfera = new Esfera(3);
		float area = esfera.computeArea();		
		Assert.assertEquals(113.09, area, 0.1);
		float volumen = esfera.computerVolumen();
		Assert.assertEquals(113.1, volumen, 0.1);
	}
	
}
