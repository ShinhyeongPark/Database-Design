package insertdata;

import java.sql.*;

public class ApplyTable {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Apply(nickname, no_game)"; 
				sql +=	"VALUES ('박신형',4)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Apply(nickname, no_game)"; 
			sql +=	"VALUES ('김제영',4)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Apply(nickname, no_game)"; 
			sql +=	"VALUES ('김지혜',17)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Apply(nickname, no_game)"; 
			sql +=	"VALUES ('박신형',12)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Apply(nickname, no_game)"; 
			sql +=	"VALUES ('박신형',13)";
			stmt.executeUpdate(sql);
			System.out.println("Insert Record 완료");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
