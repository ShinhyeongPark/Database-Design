package insertdata;

import java.sql.*;

public class Matching {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('리버풀',1)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('리버풀',2)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('맨시티',2)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('웨스트햄',3)";
			stmt.executeUpdate(sql);

 			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('리버풀',4)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('리버풀',5)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('맨시티',5)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('리버풀',6)";
			stmt.executeUpdate(sql);
			
			System.out.println("Insert Record 완료");

			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
