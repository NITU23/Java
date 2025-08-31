package com.addServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlet extends HttpServlet {

	private void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

		System.out.println("Result is : " + k);
		// the below code is for normal request.
		/*
		 * res.setContentType("text/html"); try (PrintWriter out = res.getWriter()) {
		 * out.println("<h1>Result is : " + k + "</h1>"); }
		 */

		// this code is for calling another servlet
		// the is the one way of calling the servlet.
		/*req.setAttribute("k", k);
		RequestDispatcher rd = req.getRequestDispatcher("/sq");
		rd.forward(req, res); */
		
		//  calling the servlet using url redirecting.
		/*res.sendRedirect("sq?k="+k); */
		
		// sending values using session
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		res.sendRedirect("sq");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("I am in gett");
		// servlet context are shared accorss all servlets...while servlet config is only for that servlet.
        ServletContext ctx = getServletContext();
        System.out.println(ctx.getInitParameter("Test"));
		//processRequest(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("I am in post");
		processRequest(req, res);

	}

//	@Override // the service method is treating the each request same, no difference in get or
//				// post
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		try {
//			processRequest(req, res);
//		} catch (IOException | ServletException e) {
//			e.printStackTrace();
//		}
//	}
}
