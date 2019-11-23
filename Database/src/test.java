import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test
{
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select bookid, REPLACE(bookname,'¾ß±¸','³ó±¸') bookname, publisher,price FROM Book");
			
			System.out.println("bookid"+"	"+"bookname"+"   	  "+"publisher"+"	"+"price");
			while(rs.next())
				System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"		   "+rs.getString(3)+" 		"+rs.getString(4));
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}