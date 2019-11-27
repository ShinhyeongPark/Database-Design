package insertdata;

import java.sql.*;

public class Team_match {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (1,'청주풋살장', '2019-12-11', '18:00:00', '풋살', '남성매치', NULL, '리버풀', NULL, 'RED', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (2,'청주풋살장', '2019-12-12', '18:00:00', '풋살', '남성매치', NULL, '리버풀', '맨시티', 'RED', 'BLUE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (3,'청주풋살장', '2019-12-13', '18:00:00', '풋살', '여성매치', NULL, '왓포드', '웨스트햄', 'RED', 'WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (4,'청주풋살장', '2019-12-13', '20:00:00', '풋살', '남성매치', NULL, '리버풀', NULL, 'RED', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (5,'청주축구구장', '2019-12-14', '12:00:00', '축구', '남성매치', NULL, '리버풀', '맨시티', 'RED', 'WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (6,'청주축구구장', '2019-12-15', '14:00:00', '축구', '남성매치', NULL, '리버풀', NULL, 'RED', NULL)";
			stmt.executeUpdate(sql);
			

			stmt.executeUpdate(sql);
			
			
			
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("Insert Record 완료");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
