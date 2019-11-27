package insertdata;

import java.sql.*;

public class Result {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Result(no_result, no_match, home, away, score)"; 
			sql +=	"VALUES (1,2,'리버풀', '맨시티', NULL )";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Result(no_result, no_match, home, away, score)"; 
			sql +=	"VALUES (2,3,'왓포드', '웨스트햄', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Result(no_result, no_match, home, away, score)"; 
			sql +=	"VALUES (3,5, '리버풀', '맨시티', NULL)";
			stmt.executeUpdate(sql);
			System.out.println("Insert Record 완료");

			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
