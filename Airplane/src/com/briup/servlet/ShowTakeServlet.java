package com.briup.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.service.AirportService;
import com.briup.service.impl.AirportServiceImpl;

/
@WebServlet("/showtake")
public class ShowTakeServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AirportService airportservice=new AirportServiceImpl();      
	 @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 req.setAttribute("takeport", airportservice.showTakePort());
		 req.getRequestDispatcher("showland").forward(req, resp);
	}
}
