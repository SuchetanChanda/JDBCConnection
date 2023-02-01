package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String url= "jdbc:mysql://localhost:3306/hr";
		String userName="root";
		String passWord="#Blackcrown06";
		
		try {
			Connection con = DriverManager.getConnection(url,userName,passWord);
			String queryString="";
			boolean session=true;
			
			System.out.println("Enter the id of the student you want to update: ");
			
			int id = sc.nextInt();
			
			System.out.println("Enter the column you want to update: ");
			
			String colTargetString = sc.next().toLowerCase();
			switch (colTargetString) {
			case "id":
				System.out.println("Id cannot be changed!");
				session=false;
				break;
			case "name":
				sc.nextLine();
				System.out.println("Enter the name :");
				String nameString = sc.nextLine();
			
				queryString = "UPDATE student"
						+ " SET name = " + "'"+nameString +"'"
						+ " WHERE id  = " +id;
				break;
			case "age" :
				System.out.println("Enter the age : ");
				int age = sc.nextInt();
				
				queryString = "UPDATE student"
						+ " SET age = " + age
						+ " WHERE id  = " +id;
				break;
				
			case "address" :
				sc.nextLine();
				System.out.println("Enter the address : ");
				String addressString = sc.nextLine();
				
				queryString = "UPDATE student"
						+ " SET address = " + "'"+ addressString +"'"
						+ " WHERE id  = " +id;
				break;
			
			case "course":
				
				System.out.println("Enter the course");
				
				int course = sc.nextInt();
				
				queryString = "UPDATE student"
						+ " SET course = " + course
						+ " WHERE id  = " +id;
				break;
			default:
				System.out.println("The specified column doesn't exist!!");
				session=false;
				break;
			}
			if(session)
			{
				System.out.println(queryString);
				Statement stmt = con.createStatement();
				
				int x = stmt.executeUpdate(queryString);
				
				
				System.out.println("Successfully updated!!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
