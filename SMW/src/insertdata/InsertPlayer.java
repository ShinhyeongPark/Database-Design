package insertdata;

import java.sql.*;

public class InsertPlayer {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","parksh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
				sql +=	"VALUES ('김제영','김제영','FW', 20, '남', '충북', '청주', NULL,'orpsh1941','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('김진오','김진오','MF', 20, '남', '충북', '청주', NULL,'2','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('유병주','유병주','MF',21, '남', '충북', '청주', NULL,'3','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)";  
			sql +=	"VALUES ('정경창','정경창','MF', 23, '남', '충북', '청주', NULL,'4','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('이선명','이선명','DF',23, '남', '충북', '청주', NULL,'5','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('박신형','박신형','DF', 20, '남', '충북', '청주', NULL,'6','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('안제현','안제현','GK',  25, '남', '충남', '보은', NULL,'7','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('허신범','허신범','MF',  20, '여', '경기', '용인', NULL,'8','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('김지혜','김지혜','FW',  21, '여', '충북', '청주', NULL,'9','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)";  
			sql +=	"VALUES ('박정은','박정은','MF',  21, '여', '충북', '청주', NULL,'10','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)";  
			sql +=	"VALUES ('박주영','박주영','FK',  30, '남', '서울', '강남', NULL,'11','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)";  
			sql +=	"VALUES ('박정은','박정은','FK',  28, '남', '충북', '강남', NULL,'12','1234')";
			stmt.executeUpdate(sql);
			//////////////////////////////////////////////////////////////////////////////////////////////////
			
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'에릭센','FW', 20, '남', '제주', '제주', '토트넘','13','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'기성용','FW', 20, '남', '전북', '전주', '뉴캐슬','14','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'헨더슨','FW', 20, '남', '서울', '강남', '리버풀','15','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'아구에로','FW', 21, '남', '경기', '안양', '맨시티','16','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'포그바','FW', 21, '남', '강원', '강릉', '맨유','17','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'제임스','MF', 21, '남', '인천', '인천', '번리','18','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'미나','MF', 21, '남', '충북', '청주', '본머스','19','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'피터','MF', 22, '남', '충남', '보은', '브라이튼','20','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'윌셔','MF', 22, '여', '제주', '제주', '사햄','21','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'호날두','MF', 23, '남', '경기', '성남', '셰필드','22','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'외질','DF', 24, '남', '강원', '원주', '아스널','23','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'테리','DF', 25, '여', '전남', '여수', '아스토빌라','24','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'히샬리송','DF', 26, '남', '부산', '서면', '에버턴','25','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'살라','DF', 27, '여', '서울', '강북', '왓포드','26','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'바예호','GK', 28, '남', '인천', '부평', '울버햄튼','27','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'캐릭','GK', 29, '여', '부산', '서면', '웨스트햄','28','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'캉테','DF', 30, '남', '서울', '청담', '첼시','29','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'자하','DF', 30, '남', '충남', '보은', '크펠','30','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'손흥민','DF', 30, '남', '충북', '청주', '토트넘','31','1234')";
			stmt.executeUpdate(sql);
			
			////////////////////////////////////////////////////////////////////////////////////////////////


			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'로버트슨','FW', 20, '남', '제주', '제주', '토트넘','no32','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'마네','FW', 20, '남', '전북', '전주', '토트넘','33','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'피르미누','FW', 20, '남', '서울', '강남', '토트넘','34','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'베이날둠','FW', 21, '남', '경기', '안양', '토트넘','35','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'더용','FW', 21, '남', '강원', '강릉', '토트넘','36','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'더리흐트','MF', 21, '남', '인천', '인천', '토트넘','37','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'케인','MF', 21, '남', '충북', '청주', '토트넘','38','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'윙크스','MF', 22, '남', '충남', '보은', '토트넘','39','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'다이어','MF', 22, '여', '제주', '제주', '토트넘','40','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'오리에','MF', 23, '남', '경기', '성남', '토트넘','41','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'로즈','DF', 24, '남', '강원', '원주', '맨시티','43','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'조르지뉴','DF', 25, '여', '전남', '여수', '맨시티','42','1234')";
			stmt.executeUpdate(sql);
 			
 			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'윌리안','DF', 26, '남', '부산', '서면', '맨시티','44','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'산체스','DF', 27, '여', '서울', '강북', '맨시티','45','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'마타','GK', 28, '남', '인천', '부평', '맨시티','46','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'알리','GK', 29, '여', '부산', '서면', '맨시티','47','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'램파드','DF', 30, '남', '서울', '청담', '맨시티','48','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'제라드','DF', 30, '남', '충남', '보은', '맨시티','49','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'베컴','DF', 30, '남', '충북', '청주', '맨시티','50','1234')";
			stmt.executeUpdate(sql);
			
			/////////////////////////////////////////////////////////////////////////////////////////////////////

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'메시','FW', 20, '남', '제주', '제주', '맨시티','51','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'수아레즈','FW', 20, '남', '전북', '전주', '리버풀','52','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'그리즈만','FW', 20, '남', '서울', '강남', '리버풀','53','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'비달','FW', 21, '남', '경기', '안양', '리버풀','54','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'아르투르','FW', 21, '남', '강원', '강릉', '리버풀','55','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'피케','MF', 21, '남', '인천', '인천', '리버풀','56','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'움티티','MF', 21, '남', '충북', '청주', '리버풀','57','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'알바','MF', 22, '남', '충남', '보은', '리버풀','58','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'세메두','MF', 22, '여', '제주', '제주', '리버풀','59','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'마르셀루','MF', 23, '남', '경기', '성남', '리버풀','60','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'라모스','DF', 24, '남', '강원', '원주', '리버풀','61','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'바란','DF', 25, '여', '전남', '여수', '리버풀','62','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'카세미루','DF', 26, '남', '부산', '서면', '맨유','63','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'모드리치','DF', 27, '여', '서울', '강북', '맨유','64','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'베일','GK', 28, '남', '인천', '부평', '맨유','65','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'아자르','GK', 29, '여', '부산', '서면', '맨유','66','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'로이스','DF', 30, '남', '서울', '청담', '맨유','67','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'훔멜스','DF', 30, '남', '충남', '보은', '맨유','68','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'키미히','DF', 30, '남', '충북', '청주', '맨유','69','1234')";
			stmt.executeUpdate(sql);
			//////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("Insert Record 완료");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
