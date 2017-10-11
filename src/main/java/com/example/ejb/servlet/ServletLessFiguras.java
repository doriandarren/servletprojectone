package com.example.ejb.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.ejb.bussines.FigurasLess;

import util.TemplatesHtml;

@WebServlet("/ServletLessFiguras")
public class ServletLessFiguras extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private FigurasLess fig;
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
											throws ServletException, IOException {
		
		
		String type = req.getParameter("type");
		//String area = req.getParameter("area");
		//String volumen = req.getParameter("volumen");
		
			
		StringBuilder builder = new StringBuilder();		
				
		if(type.toLowerCase().equals("cilindro")){			
			float r = Float.valueOf(req.getParameter("radio"));
			float h = Float.valueOf(req.getParameter("altura"));
			builder.append("<p>Cilindro</p>");
			builder.append("<h3>" + fig.getAreaCilindro(r, h) + "</h3>");
			builder.append("<h3>" + fig.getVolumenCilindro(r, h) + "</h3>");
		}else if(type.toLowerCase().equals("cono")){			
			float r = Float.valueOf(req.getParameter("radio"));
			float h = Float.valueOf(req.getParameter("altura"));	
			builder.append("<p>Cono: </p>");
			builder.append("<h3>" + fig.getAreaCono(r, h) + "</h3>");
			builder.append("<h3>" + fig.getVolumenCono(r, h) + "</h3>");		
		}else if(type.toLowerCase().equals("cubo")){
			
			float h = Float.valueOf(req.getParameter("altura"));	
			builder.append("<p>Cubo: </p>");
			builder.append("<h3>" + fig.getAreaCubo(h) + "</h3>");
			builder.append("<h3>" + fig.getVolumenCubo(h) + "</h3>");
			
		}else if(type.toLowerCase().equals("esfera")){
			float r = Float.valueOf(req.getParameter("radio"));	
			builder.append("<p>Esfera: </p>");
			builder.append("<h3>" + fig.getAreaEsfera(r) + "</h3>");
			builder.append("<h3>" + fig.getVolumenEsfera(r) + "</h3>");
		}
		
		
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println(TemplatesHtml.head("Resultado") + 
				TemplatesHtml.menu());
		out.println(builder);
		out.println(TemplatesHtml.footer());
	}

	
	
	
	
	
}