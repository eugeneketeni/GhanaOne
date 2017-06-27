package com.wrox;

import java.io.IOException;
import java.security.SecureRandom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/*class Reset {
	String oldPass;

}*/

@WebServlet(name = "ForgetPasswordServlet", urlPatterns = "/forgetPassword")
public class ForgetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/*
	 * public static String generateCode() { String password = ""; SecureRandom
	 * random = new SecureRandom(); for (int i = 0; i < 8; i++) { password =
	 * password + (char) (random.nextInt(26) + 97); } return password; }
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String oldpass = request.getParameter("oldPass");
		String newpass = request.getParameter("newpass");
		String renewpass = request.getParameter("renewpass");
		HttpSession session = request.getSession();
		String currentpass = (String)session.getAttribute(password);
		String username = (String)session.getAttribute(UserId);

		if (oldpass.equals(null) || oldpass == "" || newpass.equals(null) || newpass == "" || renewpass.equals(null)
				|| renewpass == "")
		{
			request.setAttribute("msg", "Enter all fields!");
			getServletContext().getRequestDispatcher("/forget ssword.jsp").forward(request, response);
		}
		else if(!newpass.equals(renewpass))
		{
			request.setAttribute("msg", "Password not matching!");
			getServletContext().getRequestDispatcher("/forgetPassword.jsp").forward(request, response);
		}
		else if(currentpass.equals(oldpass)){
			request.setAttribute("msg", "Old Password is not correct!");
			getServletContext().getRequestDispatcher("/forgetPassword.jsp").forward(request, response);
		}
		else{
			 
		}

			request.getRequestDispatcher("/WEB-INF/jsp/view/forgetPassword.jsp").forward(request, response);
	}
}
