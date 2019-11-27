package insertdata;

import java.sql.*;

public class InsertMercenary {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
				sql +=	"VALUES ('김제영','FW', '상', 20, '남', '충북', '청주', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('김진오','MF', '상', 20, '남', '충북', '청주', NULL)";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('유병주','MF', '중', 21, '남', '충북', '청주', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('정경창','MF', '상', 23, '남', '충북', '청주', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('이선명','DF', '중', 23, '남', '충북', '청주', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('박신형','DF', '상', 20, '남', '충북', '청주', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('안제현','GK', '하', 25, '남', '충남', '보은', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('허신범','MF', '하', 20, '여', '경기', '용인', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('김지혜','FW', '상', 21, '여', '충북', '청주', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('박정은','MF', '중', 21, '여', '충북', '청주', NULL)";
			stmt.executeUpdate(sql);
			
			
			System.out.println("Insert Record 완료");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
