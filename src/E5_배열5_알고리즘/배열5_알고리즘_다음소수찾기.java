package E5_�迭5_�˰���;

import java.util.Scanner;

public class �迭5_�˰���_�����Ҽ�ã�� {
	/*
	 *  [���� �Ҽ� ã��]
	 * 1. ���ڸ� �� �� �Է¹޴´�.
	 * 2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
	 * 
	 * ��) Enter Number ? 1000
	 *    1000���� ū ù���� �Ҽ��� 1009
	 * ��) Enter Number ? 500
	 *    500���� ū ù��° �Ҽ��� 503
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		for(int i=number; i<number+10; i++) {
			int count = 0;
			for(int j=1; j<number+10; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.printf("%d���� ū ù��° �Ҽ��� %d",number,i);
				break;
			}
		}
		System.out.println();
		for(int i=1; i<1004; i++) {
			if(1003%i == 0) {
				System.out.println(i);
			}
		}
	}
}