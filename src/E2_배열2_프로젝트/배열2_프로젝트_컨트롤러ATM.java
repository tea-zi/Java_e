package E2_�迭2_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_������Ʈ_��Ʈ�ѷ�ATM {
	/*
	 * [ATM] 
	 * 	-��ü ��ɱ���
	 * 1. ȸ������
	 * . id�� pw�� �Է¹޾� ����
	 * . ���� �� �� 1000�� �ο�
	 * . id �ߺ�üũ
	 * 2. ȸ��Ż��
	 * . �α��νÿ��� �̿밡��
	 * 3. �α���
	 * . id�� pw�� �Է¹޾� �α���
	 * . �α׾ƿ� ���¿����� �̿밡��
	 * 4. �α׾ƿ�
	 * . �α��νÿ��� �̿밡��
	 * 5. �Ա�
	 * . �α��νÿ��� �̿밡��
	 * 6. ��ü
	 * . �α��νÿ��� �̿밡��
	 * 7. �ܾ���ȸ
	 * . �α��νÿ��� �̿밡��
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] idList = new int[MAX];
		int[] pwList = new int[MAX];
		int[] moneyList = new int[MAX];
		
		int count = 0;
		int log = -1;
		
		//1.ȸ������ 2.ȸ��Ż�� 3.�α��� 4.�α׾ƿ�
		//5.�Ա� 6.�۱� 7.��ȸ 8.��üȸ����� 0.����.
		while(true) {	
			System.out.println("[1.ȸ������][2.ȸ��Ż��][3.�α���][4.�α׾ƿ�]\n[5.�Ա�][6.�۱�][7.��ȸ][8.��üȸ�����][0.����]");
			int sel = scan.nextInt();		
			if(sel == 1) {	
				if(count == MAX) {
					System.out.println("���̻� �����Ҽ������ϴ�.");
				}
				else {
					System.out.println("ȸ������");
					boolean run = true;
					while(run) {
						System.out.print("���̵� �Է� : ");
						int joinid = scan.nextInt();
						int cid = 0;
						for(int i=0; i<MAX; i++) {
							if(joinid == idList[i]) {
								System.out.println("�����Ѿ��̵� �����մϴ�.");
								cid++;
								break;
							}
						}
						if(cid == 0) {
							idList[count] = joinid;
							while(true) {
								System.out.print("��й�ȣ �Է� : ");
								int joinpw = scan.nextInt();
								int cpw = 0;
								for(int i=0; i<MAX; i++) {
									if(joinpw == pwList[i]) {
										System.out.println("����Ҽ����� ��й�ȣ�Դϴ�.");
										cpw++;
									}
								}
								if(cpw == 0) {
									pwList[count] = joinpw;
									System.out.println("ȸ������ �Ϸ�");
									moneyList[count] = 1000;
									run = false;
									count++;
									break;
								}
							}
						}
					}
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					if(log != count-1) {
						for(int i=log; i<count-1; i++) {
							idList[i] = idList[i+1];
							pwList[i] = pwList[i+1];
							moneyList[i] = moneyList[i+1];
						}
					}
					idList[count-1] = 0;
					pwList[count-1] = 0;
					moneyList[count] = 0;
					count--;
					log = -1;
					System.out.println("�����Ϸ�");
				}
				else {
					System.out.println("�α����� �̿��ϼ���.");
				}
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.print("���̵� �Է� : ");
					int logid = scan.nextInt();
					System.out.print("��й�ȣ �Է� : ");
					int logpw = scan.nextInt();
					for(int i=0; i<MAX; i++) {
						if(logid == idList[i] && logpw == pwList[i]) {
							log = i;
							break;
						}
					}
				}
				if(log == -1) {
					System.out.println("�α��� ����");
				}
				else {
					System.out.println("�α��� ����");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ�");
				}
				else {
					System.out.println("�α����Ͻʽÿ�.");
				}
			}
			else if(sel == 5) {
				if(log != -1) {
					System.out.print("�Ա��� �ݾ� : ");
					int money = scan.nextInt();
					moneyList[log] += money;
					System.out.println("�ܾ� : " + moneyList[log]);
				}
				else {
					System.out.println("�α����� �̿��ϼ���.");
				}
			}
			else if(sel == 6) {
				if(log != -1) {
					System.out.print("��ü�� ���� : ");
					int acc = scan.nextInt();
					System.out.print("��ü�� �ݾ� : ");
					int money = scan.nextInt();
					int index = 0;
					if(moneyList[log] < money) {
						System.out.println("�ܾ��� �����մϴ�.");
					}
					else {
						moneyList[log] -= money;
						for(int i=0; i<count; i++) {
							if(acc == idList[i]) {
								moneyList[i] += money;
							}
						}
						System.out.println("��ü�Ϸ�");
						System.out.println("�ܾ� : " + moneyList[log]);
					}
				}
			}
			else if(sel == 7) {
				if(log != -1) {
					System.out.println("�ܾ� : " + moneyList[log]);
				}
			}
			else if(sel == 8) {
				System.out.println(Arrays.toString(idList));
				System.out.println(Arrays.toString(pwList));
				System.out.println(Arrays.toString(moneyList));
			}
			else if(sel == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
		
	}

}