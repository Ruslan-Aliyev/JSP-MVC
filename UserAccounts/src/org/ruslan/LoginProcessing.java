package org.ruslan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ruslan.check.LoginCheck;

/**
 * Servlet implementation class LoginProcessing
 */
@WebServlet(description = "Process Logins", urlPatterns = { "/log" })
public class LoginProcessing extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un, pw;
		un=request.getParameter("un");
		pw=request.getParameter("pw");
		
		LoginCheck loginCheck = new LoginCheck();
		String registeredUser = loginCheck.checkUser(un, pw);
		
		if (!(registeredUser.equals(""))){
			request.getSession().setAttribute("checkedUser", registeredUser);
			response.sendRedirect("passed.jsp");
			return;
		} else {
			response.sendRedirect("LoginPage.jsp");
			return;			
		}
	}

}
