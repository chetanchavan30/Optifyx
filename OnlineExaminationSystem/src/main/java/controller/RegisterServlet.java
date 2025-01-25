package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import bean.User;
import dao.AddUser;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		User u = new User();
		u.setFirstName(req.getParameter("firstname"));
		u.setLastName(req.getParameter("lastname"));
		u.setNumber(Long.parseLong(req.getParameter("number")));
		u.setEmail(req.getParameter("email"));
		u.setUserName(req.getParameter("username"));
		u.setPassword(req.getParameter("password"));
		
		int k =  new AddUser().addUser(u);
		if(k>0) {
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		else {
			 res.sendRedirect("register.html?error=Invalid credentials");
		}
	}

}
