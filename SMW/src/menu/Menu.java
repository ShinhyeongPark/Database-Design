package menu;

import java.util.*;

public class Menu {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int option = 0;
		
		LogicClass CallLogic = new LogicClass();
		
		while(true) {
				System.out.println("1:회원가입  2:선수리스트 출력  3:선수검색  4:회원탈퇴");
				System.out.print("1부터 4의 숫자중 1개를 선택하십시오.");
				option=scan.nextInt();
				
				if(option ==1) {
					 CallLogic.InsertPlayer();
				}
				else if(option == 2){
					 CallLogic.SelectPlayer();
				}
				else if(option == 3){
					 CallLogic.FindPlayer();
				}
				else if(option == 4){
					 CallLogic.DeletePlayer();
				}
				else if(option ==99) {
					System.out.print("프로그램 종료");
					scan.close();
					break;
				}
				else {
					
				}		
		}
	}
}

