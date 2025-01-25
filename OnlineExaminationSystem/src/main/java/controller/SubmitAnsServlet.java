package controller;

import java.io.IOException;
import java.io.PrintWriter;

import bean.User;
import dao.InsertMarks;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/submitAnswers")
public class SubmitAnsServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String q1 = request.getParameter("q1");
		String q2 = request.getParameter("q2");
		String q3 = request.getParameter("q3");
		String q4 = request.getParameter("q4");
		String q5 = request.getParameter("q5");
		String q6 = request.getParameter("q6");
		String q7 = request.getParameter("q7");
		String q8 = request.getParameter("q8");
		String q9 = request.getParameter("q9");
		String q10 = request.getParameter("q10");

		String[] correctAnswers = { "0", "main", "2 bytes", "start()", "Serializable", "ArrayIndexOutOfBoundsException",
				"Object", "try-catch", "public MyClass()", "Both of the above" };

		String[] userAnswers = { q1, q2, q3, q4, q5, q6, q7, q8, q9, q10 };

		int score = 0;
		for (int i = 0; i < correctAnswers.length; i++) {
			if (correctAnswers[i].equals(userAnswers[i])) {
				score++;
			}
		}

		HttpSession hs = request.getSession();
		if (hs == null) {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		} else {

			User user = (User) hs.getAttribute("user");
			user.setMarks(score);
			hs.setAttribute("user", user);
			int k = new InsertMarks().insertMarks(score, user);

			if (k > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("view.jsp");;
				rd.include(request, response);
			}else {				
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		}

	}
}
