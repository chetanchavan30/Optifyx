package controller;

import java.io.IOException;
import java.io.PrintWriter;

import bean.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet {

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession(false);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		if(hs==null) {
			pw.println("Session Invalid");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		else {
			User u = (User)hs.getAttribute("user");
			pw.println("<br> Profile <br>");
			pw.println("User Name : "+u.getUserName()+"<br>");
			pw.println("Email : "+u.getEmail()+"<br>");
			pw.println("Password : "+u.getPassword()+"<br>");
		}	
		
	}
}
