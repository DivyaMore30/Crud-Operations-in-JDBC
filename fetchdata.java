package jdbc6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class fetchdata 
{
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","Divya@123");
		PreparedStatement ps=con.prepareStatement("select * from information where id=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id to be fetch");
		int id=sc.nextInt();
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		rs.next();
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		    
	}
}
