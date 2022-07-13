package E6_�迭6_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class �迭6_������Ʈ_��ȭ���� {

	/* 
	 * [��ȭ���¼�����]
	 * (1)ȸ������ (2)�α���  (0) ����
	 * 
	 * [ȸ������] ==> id �� ���� ==> �ߺ�ó�� 
	 * [�α�����] ==> (1) �α׾ƿ� (2) ���� (3) ����Ȯ��(���ΰ͸� �¼���ȣ��� ) 
	 *              (4) �������(���ΰ͸�) (5) ��üȮ�� (0) �ڷΰ��� 
	 *
	 * 1) ȸ�������� 10����� �����ϴ�.
	 * 2) idList ���� ȸ������ id�� ���� 
	 * 3) �α������� �¼��� �����ϸ� seatList �� �����ѻ���� id ������ 
	 * 4) �ʿ��Ѻ����� �߰��Ҽ��ִ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int MAX = 10;
		final int ROW = 3;
		final int COL = 4;
		int idList[] = new int[MAX];
		int seatList[][]= new int[ROW][COL]; 
		int countid = 0;
		int log = -1;
		while(true) {
			System.out.println("(1)ȸ������ (2)�α���  (0)����");
			int sel1 = scan.nextInt();
			if(sel1 == 1) {
				if(countid == 10) {
					System.out.println("������ �Ұ����մϴ�.");
				}
				else {
					System.out.print("id �Է� : ");
					int joinid = scan.nextInt();
					boolean check = false;
					for(int i=0; i<idList.length; i++) {
						if(joinid == idList[i]) {
							check = true;
						}
					}
					if(check == true) {
						System.out.println("�ߺ��� ���̵��Դϴ�.");
						}
					else {
						idList[countid] = joinid;
						countid++;
					}
				}
				System.out.println(Arrays.toString(idList));
			}
			if(sel1 == 2) {
				System.out.print("id �Է� : ");
				int logid = scan.nextInt();
				boolean check = false;
				for(int i=0; i<idList.length; i++) {
					if(logid == idList[i]) {
						check = true;
						break;
					}
				}
				if(check = true) {
					log = logid;
				}
				else {
					System.out.println("���Ե� ���̵� �ƴմϴ�.");
				}
				if(log != -1) {
					while(true) {
						System.out.println("(1) �α׾ƿ� (2) ���� (3) ����Ȯ��(���ΰ͸� �¼���ȣ��� ) \r\n"
								+ "(4) �������(���ΰ͸�) (5) ��üȮ�� (0) �ڷΰ��� ");
						int sel2 = scan.nextInt();
						if(sel2 == 1) {
							System.out.println("�α׾ƿ�");
							log = -1;
							break;
						}
						else if(sel2 == 2) {
							System.out.print("�� ���� : ");
							int row = scan.nextInt();
							System.out.print("��ȣ ���� : ");
							int col = scan.nextInt();
							boolean rowcheck = false;
							boolean colcheck = false;
							if(row < ROW && row >= 0) {
								rowcheck = true;
							}
							if(col < COL && col >=0) {
								colcheck = true;
							}
							if(rowcheck == true && colcheck == true) {
								if(seatList[row][col] == 0) {
									seatList[row][col] = log;
								}
								else {
									System.out.println("���Ű� �Ϸ�� �¼��Դϴ�.");
								}
							}
							else {
								System.out.println("����");
							}
						}
						else if(sel2 == 3) {
							for(int i=0; i<seatList.length; i++) {
								for(int j=0; j<seatList[i].length; j++) {
									if(log == seatList[i][j]) {
										System.out.printf("[%d , %d]\n",i,j);
									}
								}
							}
						}
						else if(sel2 == 4) {
							int count = 0;
							for(int i=0; i<seatList.length; i++){
								for(int j=0; j<seatList[i].length; j++) {
									if(log == seatList[i][j]) {
										System.out.printf("[%d , %d]\n",i,j);
										count++;
									}
								}
							}
							if(count == 0) {
								System.out.println("�����¼��� �����ϴ�.");
							}
							else {
								System.out.print("����� �� : ");
								int row = scan.nextInt();
								System.out.print("����� ��ȣ : ");
								int col = scan.nextInt();
								seatList[row][col] = 0;
								System.out.println("��ҵǾ����ϴ�.");
							}
						}
						else if(sel2 == 5) {
							for(int i=0; i<seatList.length; i++) {
								System.out.println(Arrays.toString(seatList[i]));
							}
						}
						else if(sel2 == 0) {
							break;
						}
					}
				}
							
			}
			if(sel1 == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}