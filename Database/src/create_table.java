import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class create_table
{
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			StringBuffer sql =new StringBuffer();
			sql.append("create table player(p_name int");
			sql.append(", p_position varchar(20)");
			sql.append(", p_age int");
			sql.append(", address varchar(30)");
			sql.append(", team_name varchar(30)");
			sql.append(", constraint player_p_name_pk primary key(p_name))");
					
			stmt.executeUpdate(sql.toString());
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}