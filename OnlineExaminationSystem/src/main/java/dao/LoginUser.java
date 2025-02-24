package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;
import jakarta.servlet.http.HttpServletRequest;

public class LoginUser {
	private User u;
	public User login(HttpServletRequest req) {
		
		Connection con = DBConnection.getConnection();
		try {
			String loginQuery ="select * from users where username = ? and password = ?";
			PreparedStatement ps = con.prepareStatement(loginQuery);
			ps.setString(1, req.getParameter("userName"));
			ps.setString(2, req.getParameter("password"));
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
				u = new User();
				u.setuId(rs.getInt(1));
				u.setFirstName(rs.getString(2));
				u.setLastName(rs.getString(3));
				u.setUserName(rs.getString(4));
				u.setPassword(rs.getString(5));
				u.setNumber(rs.getLong(6));
				u.setEmail(rs.getString(7));
				u.setMarks(rs.getInt(8));
			}
			rs.close();
			ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return u;
	}
}
