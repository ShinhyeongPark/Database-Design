package menu;

import java.util.*;

public class Menu {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int option = 0;

		LogicClass CallLogic = new LogicClass();
		
		while(true) {
				System.out.println("=========================");
				System.out.println("1:ȸ������ 	2:ȸ����� ");
				System.out.println("3:ȸ���˻� 	4:ȸ��Ż��");
				System.out.println("5:�뺴��� 	6:�����");
				System.out.println("7:��ġ��� 	8:�����");
				System.out.println("9:��ġ������	10:�뺴���ɰ���");
				System.out.println("11:����������	12:�� �˻�");
				System.out.println("13:�뺴�˻�	14:����忹����Ȳ");
				System.out.println("=========================");
				System.out.print("�޴��� �����Ͻÿ�: ");
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
				else if(option == 5){
					 CallLogic.SelectMercenary();
				}
				else if(option == 6){
					 CallLogic.SelectTeam();
				}
				else if(option == 7){
					 CallLogic.SelectTeam_match();
				}
				else if(option == 8){
					 CallLogic.SelectGame();
				}
				else if(option == 9){
					 CallLogic.SelectResult();
				}
				else if(option == 10){ 
					CallLogic.MercenaryGame();
				}
				else if(option == 11){
					CallLogic.TeamUniform();
				}
				else if(option == 12){
					 CallLogic.SearchTeam();
				}
				else if(option == 13){
					 CallLogic.SearchMercenary();
				}
				else if(option == 14){
					 CallLogic.Livelocation();
				}
				else if(option ==99) {
					System.out.print("���α׷� ����");
					scan.close();
					break;
				}
				else {
					
				}		
		}
	}
}


 