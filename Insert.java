package jdbc6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert
{
	public static void main(String[]args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","Divya@123");
		
		PreparedStatement ps=con.prepareStatement("insert into information(id,name,age)values(?,?,?)");
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<4;i++)
	    {
	    System.out.println("enter the id");
	    int id=sc.nextInt();
	    System.out.println("enter the name");
	    String name=sc.next();
	    System.out.println("enter age");
	    int age=sc.nextInt();
	    ps.setInt(1,id);
	    ps.setString(2, name);
	    ps.setInt(3, age);
	    ps.execute();
	    }
	    System.out.println("values inserted");
	    
	}

}
