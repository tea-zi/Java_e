package E5_�迭5_�˰���;

import java.util.Scanner;

public class �迭5_�˰���_�Ҽ�������ã�� {
	/*
	 * [�Ҽ�������ã��]
	 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
	 * ��)
	 * �Է� : 20
	 * 2, 3, 5, 7, 11, 13, 17, 19
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		int array[] = new int[1000];
		int index = 0;
		for(int i=2; i<=num; i++) {
			int count = 0;
			boolean check = false;
			for(int k=0; k<index; k++) {
				if(i%array[k] == 0) {
					check = true;
				}
			}
			if(check == true) {
				continue;
			}
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					System.out.printf("%d / %d\n",i,j);
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i + " ");
				array[index] = i;
				index++;
			}
		}
	}		
}