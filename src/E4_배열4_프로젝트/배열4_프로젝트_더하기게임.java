package E4_�迭4_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭4_������Ʈ_���ϱ���� {
	/*
	  [���ϱ����]	
		1) 1~10 ������ ���ڸ� �������� 7�������ش�. (�ߺ�����)
		2) �׾ȿ��� 3���� �ε����� �����ְ����ش�. (�ߺ�����)
		3) ���ڸ� ���� ���� �ϳ� �����ϴµ�  �ε���3���� ���� ����
		   ���õ� ���ڶ� ������ ����. 
		   ��, ������ ������ �ϼ��ִ�. 
		4) �ݵ�� ������ ����� ���� �־���Ѵ�.	 
		   ��! �ߺ����� ���� ��������. 
		 [��]
		    ����  = {1,5,8,6,4,2,9};
		    ���þ� = 13	
		    ����) �ε��� ==> 0,2,4  ==>  1 + 8 + 4	
		 
		    �߸��ȿ�) �ε��� ==> 5,5,6 ==> 2 + 2 + 9
	*/
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num[] = new int[7];
		int index = 0;
		while(true) {
			if(index == num.length) {
				break;
			}
			boolean check = false;
			int r = ran.nextInt(10)+1;
			for(int i=0; i<num.length; i++) {
				if(r == num[i]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				num[index] = r;
				index++;
			}
		}
		System.out.println(Arrays.toString(num));
		int rnum[] = new int[3];
		for(int i=0; i<rnum.length;) {
			int r = ran.nextInt(7);
			boolean check = false;
			for(int j=0; j<i; j++) {
				if(r == rnum[j]) {
					check = true;
				}
			}
			if(check == false) {
				rnum[i] = r;
				i++;
			}
		}
		int total = 0;
		for(int i=0; i<rnum.length; i++) {
			total += num[rnum[i]];
		}
		System.out.println(total);
		
		int me[] = new int[3];
		while(true) {
			System.out.print("�ε��� 3���� ���ÿ�");
			for(int i=0; i<me.length; i++) {
				me[i] = scan.nextInt();
			}
			int sum = 0;
			for(int i=0; i<me.length; i++) {
				sum += num[me[i]];
			}
			if(total == sum) {
				System.out.println(sum);
				System.out.println("����");
				break;
			}
			else {
				System.out.println(sum);
				System.out.println("����");
			}
		}
	}

}