package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_ȸ������_���� {
	/*
	 * [ȸ������] ���������� ����
	 */
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);	
		int[] arr = {0, 0, 0, 0, 0};	
		int count = 0;
		int n = 0;
		while(true) {
			System.out.println("===[ȸ������]===");
			System.out.println(Arrays.toString(arr));
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.����(�ε���)");
			System.out.println("4.����(��)");
			System.out.println("5.����");
			int sel = scan.nextInt();
			if(sel == 1) {
				int num = 0;
				if(count == 5) {
					System.out.println("�߰��Ҽ������ϴ�.");
				}
				else {
					System.out.print("�� �Է� : ");
					num = scan.nextInt();
					n = 0;
					for(int i=0; i<arr.length; i++) {
						if(num == arr[i]) {
							System.out.println("������ ���� �ֽ��ϴ�.");
							n = 1;
						}
					}
				}
				if(n != 1) {
					arr[count] = num;
					count++;
				}

			}else if(sel == 2) {
				System.out.print("�����Ұ� �Է� : ");
				int num = scan.nextInt();
				int temp = 0;
				int num2 = 0;
				int c = 0;
				n = 0;
				for(int i=0; i<arr.length; i++) {
					if(num == arr[i]) {
						temp = i;
						c = 1;
						System.out.print("������ �Է� : ");
						num2 = scan.nextInt();
						for(int j=0; j<arr.length; j++) {
							if(num2 == arr[j]) {
								System.out.println("������ ���� �ֽ��ϴ�.");
								n = 1;
							}
						}
					}
				}
				if(n != 1 && c == 1) {
					arr[temp] = num2;
				}
				if(c != 1) {
					System.out.println("���� ã�� �� �����ϴ�.");
				}
			}else if(sel == 3) {
				System.out.print("�ε��� �Է� : ");
				int index = scan.nextInt();
				if(index>0 || index>count) {
					System.out.println("�ý��� ����");
				}
				for(int i=index; i<arr.length-1; i++) {
					arr[i] = arr[i+1];
				}
				arr[arr.length-1] = 0;
				count -=1;
			}
			else if(sel == 4) {
				System.out.print("�����Ұ� �Է� : ");
				int num = scan.nextInt();
				for(int i=0; i<arr.length; i++) {
					if(num == arr[i]) {
						for(int j=i; j<arr.length-1; j++) {
							arr[j] = arr[j+1];
						}
						arr[arr.length-1] = 0;
					}
					else {
						System.out.println("���� ã���� �����ϴ�.");
					}
				}
				count -=1;
			}else if(sel == 5) {
				if(count == 5) {
					System.out.println("�߰��Ҽ������ϴ�.");
					continue;
				}
				System.out.print("������ �ε��� �Է� : ");
				int index = scan.nextInt();
				if(index>0 || index>count) {
					System.out.println("�ý��� ����");
				}
				int c = 0;
				System.out.print("������ �� �Է� : ");
				int num = scan.nextInt();
				for(int i=0; i<arr.length; i++) {
					if(num == arr[i]) {
						System.out.println("������ ���� �ֽ��ϴ�.");
						c = 1;
					}

				}
				if(c != 1) {
					for(int i=arr.length-1; i>=index; i--) {
						arr[i] = arr[i-1];
					}
					arr[index] = num;
				}
			}
		}
		
		
	}
}