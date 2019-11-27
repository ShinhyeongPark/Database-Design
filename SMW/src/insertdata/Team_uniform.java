package insertdata;

import java.sql.*;

public class Team_uniform {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
				sql +=	"VALUES ('리버풀','RED')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('리버풀','WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('맨시티','BLUE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('맨시티','GREEN')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('맨유','RED')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('맨유','BLACK')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('토트넘','WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('토트넘','BLACK')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('웨스트햄','RED')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('웨스트햄','WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('왓포드','WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('왓포드','GREEN')";
			stmt.executeUpdate(sql);
			
			
			System.out.println("Insert Record 완료");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
