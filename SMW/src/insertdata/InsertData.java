package insertdata;

import java.sql.*;

public class InsertData {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
				sql +=	"VALUES ('ÿ��','Ĳ��', '����', '������', '��', 20)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('����Ǯ','�����', '����', '������', '��', 19)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('�ǽ�Ƽ','�Ʊ�����', '���', '������', '��', 18)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('���ʵ�','ȣ����', '���', '������', '��', 17)";
			stmt.executeUpdate(sql);
	
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('�����ư','�ٿ�ȣ', '��õ', '������', '��', 16)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('����','���ӽ�', '��õ', '������', '��', 15)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('�ƽ���','����', '����', '������', '��', 20)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('����','���׹�', '����', '������', '��', 20)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('��Ʈ��','�����', '���', '������', '��', 19)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('���ӽ�','�̳�', '���', '������', '��', 18)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('�����ư','����', '�泲', '������', '��', 17)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('ũ��','����', '�泲', '������', '��', 16)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('��ĳ��','�⼺��', '����', '������', '��', 15)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('�ƽ������','�׸�', '����', '������', '��', 20)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('������','��������', '�λ�', '������', '��', 19)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('����Ʈ��','�ɸ�', '�λ�', '������', '��', 18)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('�븮ġ','������', '����', '������', '��', 17)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('����','����', '����', '������', '��', 16)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
			sql +=	"VALUES ('������','���', '����', '������', '��', 15)";
			stmt.executeUpdate(sql);
		
			System.out.println("Insert Record �Ϸ�");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
