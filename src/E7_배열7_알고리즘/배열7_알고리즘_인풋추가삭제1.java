package E7_�迭7_�˰���;

import java.util.Arrays;

public class �迭7_�˰���_��ǲ�߰�����1 {
	/*
		1) array �迭�� ������3�̴�.		
		2) input �迭 ���� ������  �߰��� ������ �ݺ��� �����̴�.		
		3) ¦���ε����� ���� "�߰�" �̰�, 
		4) Ȧ���ε����� ���� "����" �̴�. 
		   [����] �������ڸ��� �ڿ������� ������ �о�� 0���� ǥ�� �Ѵ�. 	
		5) �ߺ��Ȱ��� "�߰�" �Ҽ����� , ���°��� "����"�Ҽ�����.
		6) input�� ������ ���� ó���ϰ� ó��������� 		
		��)
		 10 ==> ¦���ε����̹Ƿ� �߰� ==> array[] = {10,0,0};
		 20 ==> Ȧ���ε����̹Ƿ� ���� ==> 20�� �����Ƿ� ==> "�����Ұ��� �����ϴ�"
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> array[] = {10,30,0};
		 10 ==> Ȧ���ε����̹Ƿ� ���� ==> array[] = {30,0,0};
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> 30 ���̹� ����Ǿ ==> "�ߺ��˴ϴ�"
		 30 ==> Ȧ���ε����̹Ƿ� ���� ==> array[] = {0,0,0};
	*/
	public static void main(String[] args) {
		
		int array[] = {0,0,0};
		int count = 0;
			
		int input[] = {10,20,30,10,30,30};		
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i] + " ==> ");
			boolean check1 = false;
			boolean check2 = false;
			int index = 0;
			for(int j=0; j<array.length; j++) {
				if(i%2 == 0) {
					check1 = true;
				}
				if(input[i] == array[j]) {
					check2 = true;
					index = j;
				}
			}
			if(check1 == true) {
				System.out.print("¦���ε����̹Ƿ� �߰� ==> ");
				if(check2 == true) {
					System.out.println(input[i] + "�� �̹� ����Ǿ ==> \"�ߺ�\"");
				}
				else if(check2 == false) {
					array[count] = input[i];
					count++;
					System.out.print("array[] = ");
					System.out.println(Arrays.toString(array));
				}
			}
			else {
				System.out.print("Ȧ���ε����̹Ƿ� ���� ==> ");
				if(check2 == true) {
					for(int j=index; j<array.length-1; j++) {
						array[j] = array[j+1];
					}
					array[array.length-1] = 0;
					System.out.print("array[] = ");
					System.out.println(Arrays.toString(array));
				}
				else if(check2 == false) {
					System.out.println(input[i] + "�� �����Ƿ� ==> \"������ ���� ����\"");
				}
			}
		}
	}
}