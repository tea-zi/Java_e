package E3_�迭3_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭3_������Ʈ_���°��� {
	/*
	  [���� ����]
	  1. ���� ���ڰ� �����ִ� ī�� 2�徿 5��Ʈ���ִ�. (��10��)
	  2. front �� ī�带 ����� ���¸� ���Ѵ�. 
	  3. ���� front �� �����Ѵ�. 
	  4. front �� �ִ� ī�� 2���� �����Ѵ�. (���콺�������Ƿ� �ε����� ����)
	  5. ������ī�� 2���� ������ ������  back �� �����ؼ� ����� ǥ���Ѵ�. 
	     back�� ��� ���� �� ä������ ������ ����ȴ�.
	   [����] ���� �ε��� �����Ҽ�����. 
	   ��)
	   [1] �ʱ�ȭ 
	     front = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e' };
	     back  = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-' };
	  
	   [2] ���� 
	     front = {'a', 'e', 'c', 'b', 'd', 'c', 'b', 'd', 'a', 'e'};
	
	   [3] �ε��� �Է� 	   
	     1) �ε��� 2�� ==>  0 , 8  ==>front �迭�� �ε��� 0, �� 8 �� ����  a , a �� 
	                ���� ���� �����̹Ƿ� back �� ����
	     	back  =  {'a', '-', '-', '-', '-', '-', '-', '-', 'a', '-' };
	     	
	     2) �ε��� 2�� ==>  1 , 2  ==>front �迭�� �ε��� 1, �� 2�� ���� e , c �� 
	                ���� �ٸ������̹Ƿ� �ƹ��Ͼ���
	     	back  =  {'a', '-', '-', '-', '-', '-', '-', '-', 'a', '-' };	
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		char[] front = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
		char[] back = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};
		char[] arr = new char[10];
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<10; i++) {
			int r1 = ran.nextInt(front.length);
			int r2 = ran.nextInt(front.length);
			char temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
		System.out.println(Arrays.toString(front));
		int count = back.length/2;
		while(true) {
			if(count == 0) {
				break;
			}
			System.out.print(" �ε��� �Է� : ");
			int index = scan.nextInt();
			int index2 = scan.nextInt();
			if(front[index] == front[index2] && back[index] =='-' && back[index2] == '-') {
				back[index] = front[index];
				back[index2] = front[index2];
				System.out.println(Arrays.toString(back));
				count--;
			}
			else {
				System.out.println("��ġ���� ����");
			}
		}
	}
}