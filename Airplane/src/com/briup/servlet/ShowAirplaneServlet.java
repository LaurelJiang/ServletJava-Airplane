package com.briup.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.service.AirplaneService;
import com.briup.service.impl.AirplaneServiceImpl;

@WebServlet("/showairplane")
public class ShowAirplaneServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AirplaneService airplaneservice=new AirplaneServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int takeid=0;
		String takeIdstr = req.getParameter("takeid");
		if (takeIdstr!=null&&!takeIdstr.equals("")) {
			takeid=Integer.parseInt(takeIdstr);
		}
		int landid=0;
		String landIdstr = req.getParameter("landid");
		if (landIdstr!=null&&!"".equals(landIdstr)) {
			landid=Integer.parseInt(landIdstr);
		}
		req.setAttribute("list", airplaneservice.show(takeid, landid));
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
