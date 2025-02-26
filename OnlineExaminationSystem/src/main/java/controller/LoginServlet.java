package controller;

import java.io.IOException;
import java.sql.Connection;

import bean.User;
import dao.DBConnection;
import dao.LoginUser;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = DBConnection.getConnection();
		response.setContentType("text/html");
//		response.getWriter().println("<br>connected");
		
		User u = new LoginUser().login(request);
		if(u==null) {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}else {
			HttpSession hs = request.getSession();
			hs.setAttribute("user", u);
			
			RequestDispatcher rd = request.getRequestDispatcher("link.html");
			rd.include(request, response);
		}
	}

}
