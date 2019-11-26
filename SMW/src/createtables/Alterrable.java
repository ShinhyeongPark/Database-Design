package createtables;

import java.sql.*;

public class Alterrable {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "ALTER TABLE Player " +
						"ADD CONSTRAINT FOREIGN KEY (team_name) REFERENCES Team(team_name)" +
						"ALTER TABLE Player " +
						"ADD CONSTRAINT FOREIGN KEY (nickname) REFERENCES Mercenary(nickname)" + 
						"ALTER TABLE Mercenary " +
						"ADD CONSTRAINT FOREIGN KEY (team_name) REFERENCES Team(team_name)" +
						"ALTER TABLE Game " +
						"ADD CONSTRAINT FOREIGN KEY (team_name) REFERENCES Team(team_name)";
	
			stmt.executeUpdate(sql);
			System.out.println("Player 테이블 생성 완료");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
