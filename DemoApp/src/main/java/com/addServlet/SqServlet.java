package com.addServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		// normal servlet calling
		int k = (int) req.getAttribute("k");

		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("Hello I am sq servlet" + k);

	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		// send Redirect only uses the get method

		/*
		 * int k = Integer.parseInt(req.getParameter("k")); k = k*k;
		 */

		// value fetching using session
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
		PrintWriter out = res.getWriter();
		out.println("Hello I am sq get servlet" + k);

	}
}
