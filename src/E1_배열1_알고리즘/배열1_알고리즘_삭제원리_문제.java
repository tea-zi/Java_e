package E1_�迭1_�˰���;

import java.util.Scanner;

public class �迭1_�˰���_��������_���� {
	/*
	 * 	[����]
	 *  �Ʒ��迭 a �� �ȿ� �ִ� ���� �ϳ� �Է¹޴´�.
	 *  b�迭�ȿ� ������ �Է��� ���� �����ϰ� �����Ѵ�.
	 *  
	 *  [��] 30 ==> b[] = {10,20,40,50,0};
	 *  
	 *  [����] 
	 *  �Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
	 *  ��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸�, 
	 *  �׹�ȣ��  ���� �����ϰ� d�迭�� �����Ѵ�.
	 *  
	 *  [��] 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
	 *  
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		int j = 0;
		int s = scan.nextInt();
		for(int i=0; i<5; i++) {
			if(s != a[i]) {
				b[j] = a[i];
				j++;
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println(b[i]);
		}
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		j=0;
		s = scan.nextInt();
		int find = 1002;
		int index = 0;
		for(int i = 0; i < 6; i+=2) {
			if(find != c[i]) {
				d[index] = c[i];
				index += 1;
				d[index] = c[i + 1];
				index += 1;
			}
		}
		System.out.println();
		for(int i = 0; i < 6; i++) {
			System.out.print(d[i] + "  ");
		}
	}
}