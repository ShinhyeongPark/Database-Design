package menu;

import java.util.*;

public class Menu {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int option = 0;
		
		LogicClass CallLogic = new LogicClass();
		
		while(true) {
				System.out.println("1:ȸ������ 2:ȸ������Ʈ ��� 3:����(update) 4:����(update)");
				System.out.println("1���� 4�� ������ 1���� �����Ͻʽÿ�.");
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
				else {
					scan.close();
					break;
				}		
		}
	}
}

