package E5_�迭5_������Ʈ;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class �迭5_������Ʈ_��ٸ�_���� {

	/*
	 * # ��ٸ� ����
	 * 1. �ε��� 0~4�� �ϳ������Ѵ�. (���ΰ����� 5��) ���� ���� ���� ��������.
	 * 2. ���� 0 �� ������ �׳� �Ʒ��� ��������.
	 * 3. ���� 1 �� ������ ���������� �̵��� ��������.
	 * 4. ���� 2 �� ������ �������� �̵��� ��������.
	 * 5. ������ �޴� ��� 
	 * [��ȭ] ���� 0���� ����ä���� ��ٸ��� �������� ��ġ�غ���.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String menu[] = {"�����" , "���" ,"¥���" , "�̸�" , "�����"};
		
		int ladder[][]= {
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{0,0,0,0,0}};
		for(int i=1; i<ladder.length-1; i++) {
			for(int j=0; j<ladder[i].length; j++) {
				int r = ran.nextInt(3);
				ladder[i][j] = r;
			}
		}
		//while(true) {
		for(int i=0; i<ladder.length;i++) {
			System.out.println(Arrays.toString(ladder[i]));
		}
		System.out.print("�ε��� �Է� : ");
		int index = scan.nextInt();
		for(int i=0; i<ladder.length; i++) {
			if(ladder[i][index] == 0) {
				ladder[i][index] = 3;
			}
			else if(ladder[i][index] == 1) {
				ladder[i][index] = 3;
				index++;
			}
			else if(ladder[i][index] == 2) {
				ladder[i][index] = 3;
				index--;
			}
		}
		for(int i=0; i<ladder.length;i++) {
			System.out.println(Arrays.toString(ladder[i]));
		}
		System.out.println(menu[index]);
		//}
	}
}