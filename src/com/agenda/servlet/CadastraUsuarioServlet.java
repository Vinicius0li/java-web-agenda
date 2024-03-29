package com.agenda.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;

public class CadastraUsuarioServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Pessoa pessoa = new Pessoa();
		pessoa.setName(request.getParameter("name"));
	
		pessoa.setTel(request.getParameter("tel"));
		
		pessoa.setEmail(request.getParameter("email"));
		
		pessoa.setEnd(request.getParameter("end"));
	}
}
