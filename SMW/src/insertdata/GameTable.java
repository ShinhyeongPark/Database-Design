package insertdata;

import java.sql.*;

public class GameTable {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
				sql +=	"VALUES (1,'û��ǲ����', '2019-12-01', '18:00:00', 'ǲ��', '������ġ', 12, '����Ǯ')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (2,'û��ǲ����', '2019-12-01', '20:00:00', 'ǲ��', '������ġ', 12, '����Ǯ')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (3,'û��ǲ����', '2019-12-01', '22:00:00', 'ǲ��', '������ġ', 12, '�ǽ�Ƽ')";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (4,'û��ǲ����', '2019-12-02', '18:00:00', 'ǲ��', '������ġ', 10, '�ǽ�Ƽ')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (5,'û��ǲ����', '2019-12-02', '20:00:00', 'ǲ��', '������ġ', 10, '����Ʈ��')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (6,'û��ǲ����', '2019-12-01', '12:00:00', 'ǲ��', '������ġ', 10, '����Ʈ��')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (7,'û��ǲ����', '2019-12-03', '14:00:00', 'ǲ��', '������ġ', 12, '�ǽ�Ƽ')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (8,'û��ǲ����', '2019-12-04', '16:00:00', 'ǲ��', '������ġ', 12, '����Ǯ')";
			stmt.executeUpdate(sql);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (9,'����ǲ����', '2019-12-01', '18:00:00', 'ǲ��', '������ġ', 12, '����')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (10,'����ǲ����', '2019-12-03', '18:00:00', 'ǲ��', '������ġ', 12, '����')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (11,'����ǲ����', '2019-12-05', '18:00:00', 'ǲ��', '������ġ', 12, '����')";
			stmt.executeUpdate(sql);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (12,'����ǲ����', '2019-12-02', '18:00:00', 'ǲ��', '������ġ', 10, '��Ʈ��')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (13,'����ǲ����', '2019-12-04', '18:00:00', 'ǲ��', '������ġ', 10, '����Ǯ')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (14,'����ǲ����', '2019-12-06', '18:00:00', 'ǲ��', '������ġ', 10, '����Ǯ')";
			stmt.executeUpdate(sql);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (15,'û���౸����', '2019-12-07', '14:00:00', '�౸', '������ġ', 24, '����Ǯ')";
			stmt.executeUpdate(sql);
	
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (16,'û���౸����', '2019-12-07', '16:00:00', '�౸', '������ġ', 24, '�ǽ�Ƽ')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (17,'û���౸����', '2019-12-08', '18:00:00', '�౸', '������ġ', 22, '����Ʈ��')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (18,'û���౸����', '2019-12-08', '16:00:00', '�౸', '������ġ', 24, '����Ǯ')";
			stmt.executeUpdate(sql);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (19,'û��ǲ����', '2019-12-09', '18:00:00', 'ǲ��', '������ġ', 12, '�ǽ�Ƽ')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (20,'û��ǲ����', '2019-12-10', '18:00:00', 'ǲ��', '������ġ', 12, '����Ǯ')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (21,'û��ǲ����', '2019-12-11', '18:00:00', 'ǲ��', '������ġ', 12, '����Ǯ')";
			stmt.executeUpdate(sql);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("Insert Record �Ϸ�");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
