package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.User;

public class AddUser {
	int k=0;
	public int addUser(User u) {
		Connection con = DBConnection.getConnection();
		
		try {
			String addQuery ="insert into users (username,password,firstname,lastname,email,number)values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(addQuery);
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstName());
			ps.setString(4,u.getLastName());
			ps.setString(5, u.getEmail());
			ps.setLong(6, u.getNumber());
			k = ps.executeUpdate();
			ps.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return k;
	}
}
