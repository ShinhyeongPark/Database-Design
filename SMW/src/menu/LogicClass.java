package menu;

import java.sql.*;
import java.util.*;

public class LogicClass {
	
	Scanner scan = new Scanner(System.in);
	public void InsertPlayer() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO Player(id,password,name,position,age,gender,do,si) VALUE(?,?,?,?,?,?,?,?)";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			pstmt = con.prepareStatement(sql);
			
			System.out.println("ȸ�������� �Է��Ͻÿ�.");
			System.out.printf("ID: ");
			String id = scan.next(); 
			System.out.printf("P/W: ");
			String password = scan.next();
			System.out.printf("�̸�: ");
			String name = scan.next();
			System.out.printf("������: ");
			String position = scan.next();
			System.out.printf("����: ");
			int age = scan.nextInt();
			System.out.printf("����: ");
			String gender = scan.next();
			System.out.printf("�ּ�(��): ");
			String doo = scan.next();
			System.out.printf("�ּ�(��): ");
			String si = scan.next();
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, position);
			pstmt.setInt(5, age);
			pstmt.setString(6, gender);
			pstmt.setString(7, doo);
			pstmt.setString(8, si);
			
			int cnt = pstmt.executeUpdate(); 
			System.out.println(cnt + "���� ȸ�����ԵǾ����ϴ�.");	
			System.out.println("\n");
		}catch(Exception e) {System.out.println(e);}
		finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {}	
		}
	}
	////////////////////////////////////////////////////////////////////
	public void SelectPlayer() {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM Player";
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			
			while (rs.next()) {
				String id = rs.getString("id"); 
				String name = rs.getString("name"); 
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String position = rs.getString("position");
				
				System.out.println(id + "\t" + name + "\t" + age + "\t" + gender+ "\t"+position);
			}System.out.println("\n");
		}catch(Exception e) {System.out.println(e);}
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}	
	}
	////////////////////////////////////////////////////////////////////
	public void FindPlayer() {
	
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			String sql = "SELECT id,name,age,gender,position FROM Player WHERE name =";
			
			System.out.print("�˻��� ����: "); // �˻��� ������ �Է¹޾Ƽ�
			String find_name = scan.nextLine();
			
			pstmt = con.prepareStatement(sql + "'" + find_name + "'");

			rs = pstmt.executeQuery(); 
			System.out.println("----"+ find_name +"��  �˻� ���-------");
			
			while (rs.next()) {
				String id = rs.getString("id"); 
				String name = rs.getString("name"); 
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String position = rs.getString("position");
				
				System.out.println(id + "\t" + name + "\t" + age + "\t" + gender+ "\t"+position);
			}
		}catch(Exception e) {System.out.println("�˻��� ������ �������� �ʽ��ϴ�.");}
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}
	}	
	
////////////////////////////////////////////////////////////////////
	public void DeletePlayer() {	
		Connection con = null;
		Statement stmt = null;
		int r=0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			String sql = "DELETE FROM Player WHERE id =";
			
			System.out.println("<ȸ��Ż��> ");
			System.out.print("ID: ");
			String id = scan.nextLine();
			System.out.print("Password: ");
			String password = scan.nextLine();
			
			stmt = con.createStatement();
			r = stmt.executeUpdate(sql + "\'" + id + "\'" + " AND password =" +"\'" + password + "\'"); 
			if( r == 0 ){
                System.out.println("���� ��  ������ ã�� �� �����ϴ�.\n");
            }else{
            	System.out.println("----"+ id +"����  ȸ��Ż��Ǿ����ϴ�.------\n");
            }
			}catch(Exception e) {System.err.println("ID �Ǵ� P/W�� Ʋ�Ƚ��ϴ�.\n");}
		finally {
			try {
				stmt.close();
				con.close();
			} catch (Exception e) {}
		}
	}
}
////////////////////////////////////////////////////////////////////