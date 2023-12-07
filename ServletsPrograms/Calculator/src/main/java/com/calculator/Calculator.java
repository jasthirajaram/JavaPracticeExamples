package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		String operation = request.getParameter("operation");
		switch (operation) {
		case "Addition":
			out.println("Answer = " + (Integer.parseInt(n1) + Integer.parseInt(n2)));
			break;
		case "Subtraction":
			out.println("Answer = " + (Integer.parseInt(n1) - Integer.parseInt(n2)));
			break;
		case "Multiplication":
			out.println("Answer = " + (Integer.parseInt(n1) * Integer.parseInt(n2)));
			break;
		default:
			out.println("Answer = " + (Integer.parseInt(n1) / Integer.parseInt(n2)));
			break;
		}
	}
}
