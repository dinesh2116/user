package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionManager.ConnectionManager;
import model.AddUser;

public class AdduserDAO {
	public void adduser(AddUser adduser) throws ClassNotFoundException, SQLException {
		String username = adduser.getUsername();
		String password = adduser.getPassword();
		
		ConnectionManager conn=new ConnectionManager();
		Connection con =conn.establishConnection();
		String sql="insert into user(username,password) values(?,?)";
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2,password);
		ps.executeUpdate();
		
		
	}
	public void editusername(AddUser adduser) throws ClassNotFoundException, SQLException {
		String oldusername = adduser.getOldusername();
		String newusername = adduser.getNewusername();
		ConnectionManager conn=new ConnectionManager();
		Connection con =conn.establishConnection();
		String sql="update user set username=? where username=?";
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setString(1,newusername);
		ps.setString(2,oldusername);
		ps.executeUpdate();
	}
	public void deleteuser(AddUser adduser) throws ClassNotFoundException, SQLException {
		String deleteuser = adduser.getDeleteuser();
		ConnectionManager conn=new ConnectionManager();
		Connection con =conn.establishConnection();
		String sql="delete from user where username=?";
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setString(1,deleteuser);
		ps.executeUpdate();
	}
	public void viewalluser(AddUser adduser) throws ClassNotFoundException, SQLException {
		ConnectionManager conn = new ConnectionManager();
		Connection con = conn.establishConnection();
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from user");
		System.out.println("***********************");
		while(rs.next()) {
			
			System.out.println(rs.getString("username"));
		}
		conn.closeConnection();
	}
	

}
