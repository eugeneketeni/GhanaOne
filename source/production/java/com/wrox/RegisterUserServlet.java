package com.wrox;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterUserServlet
 */
@WebServlet(name = "RegisterUserServlet", urlPatterns = "/registerUser")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String UserID = request.getParameter("UserID");
		/*
		 * if (UserID==null) UserID ="";
		 */
		String Email = request.getParameter("email");
		String Firstname = request.getParameter("firstname");
		String Lastname = request.getParameter("lastname");
		String password = request.getParameter("password");

		MySqlCon insertUser = new MySqlCon();
		insertUser.insertUserDetails(UserID, Email, Firstname, Lastname, password);

		/*
		 * request.setAttribute("RegistrationSuccessfull", false);
		 * request.getRequestDispatcher("/WEB-INF/jsp/view/login.jsp")
		 * .forward(request, response);
		 */

		request.setAttribute("message", "Thank you for registering");

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/view/login.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/view/registerUser.jsp").forward(request, response);

	}

}
