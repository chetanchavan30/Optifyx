package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.User;

public class InsertMarks {
	private int k;

	public int insertMarks(int m, User u) {
		Connection con = DBConnection.getConnection();
		String insertQuery = "UPDATE users SET marks = ? WHERE username = ? AND password = ?";
		try {
			PreparedStatement ps = con.prepareStatement(insertQuery);
			ps.setInt(1, m);
			ps.setString(2, u.getUserName());
			ps.setString(3, u.getPassword());
			k = ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return k;
	}
}
