package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC1 {
	public static void main(String[] args) throws SQLException {
		Connection c = null;
        try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        
        PreparedStatement ps = c.prepareStatement("insert into jdata(user_id,name,salary) values (?,?,?)");
        ps.setInt(1,1);
        ps.setString(2, "Towseef");
        ps.setInt(3,25000);
	}
}