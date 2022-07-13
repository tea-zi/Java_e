package E7_�迭7_������Ʈ;

import java.util.Scanner;

public class �迭7_������Ʈ_�ı����Ǳ� {
	/*
	 [�ı� ���Ǳ� ���α׷�]		
		 1) ������   2) ����� 
		������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
		����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
	    	       2)�ڷΰ���
		 ���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7��Ž����ش�. 
		ȭ�� 
		 �ı� ���� : 3200�� 
		 �ı� 	  : ??��  (������ ����) 
		 50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
		 1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? �� 
	*/
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// �ı� ����
		int price = 3200;		// �ı� ����
		
		while(true) {
			
			System.out.println("[1]������");
			System.out.println("[2]�����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("0)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.print("�ı����� �ż� : ");
						tickets += scan.nextInt();
						System.out.println("���� �ѽı� : " + tickets);
					}
					else if(choice == 2) {
						for(int i=0; i<money.length; i++) {
							System.out.print(money[i] + "���� : ");
							charges[i] += scan.nextInt();
						}
						for(int i=0; i<money.length; i++) {
							System.out.print(money[i] + "�� : " + charges[i] + " �� ");
							if(i == money.length/2) {
								System.out.println();
							}
						}
						System.out.println();
					}
					else if(choice == 0) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("1)����");					
					System.out.println("0)�ڷΰ���");				
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.print("�Ա� �ݾ� : ");
						int don = scan.nextInt();
						System.out.print("�ı� ���� ���� : ");
						int ea = scan.nextInt();
						if(don < ea*price) {
							System.out.println("�ݾ��� �����մϴ�.");
						}
						else if(tickets < ea) {
							if(tickets == 0) {
								System.out.println("����");
							}
							else {
								System.out.println(tickets + "�� ���Ű���");
							}
						}
						else {
							int cha = don - ea*price;
							int c = 0;
							int sum = 0;
							for(int i=0; i<money.length; i++) {
								c = cha/money[i];
								if(c > charges[i]) {
									c -= charges[i];
									cha = cha%money[i] + c*money[i];
									c = charges[i];
									charges[i] = 0;
								}
								else {
									charges[i] -= c;
									cha = cha%money[i];
								}
								System.out.print(money[i] + "�� : " + c + " �� ");
								sum += money[i]*c;
								if(i==2) {
									System.out.println();
								}
							}
							if(sum < don-ea*price) {
								System.out.println("\n�ܾ��� �����մϴ�.");
								System.out.println(don-ea*price-sum +"����");
							}
							System.out.println("�Ž����� : " + sum);
						}
					}
					else if(choice == 0) {
						break;
					}
				}
			}
		}
	}


}