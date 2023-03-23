package jdbc6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update {
	public static void main(String[]args) throws SQLException, ClassNotFoundException 
	{ 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","Divya@123");
		PreparedStatement ps=con.prepareStatement("update information set name=?,age=? where id=? ");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the id to be update");
	    int id=sc.nextInt();
	    System.out.println("enter the name");
	    String name=sc.next();
	    System.out.println("enter age");
	    int age=sc.nextInt();
	    ps.setInt(1, id);
		ps.setString(2, name);;
		ps.setInt(3, age);
		ps.execute();
		System.out.println("values updated");
		
		
	}

}
