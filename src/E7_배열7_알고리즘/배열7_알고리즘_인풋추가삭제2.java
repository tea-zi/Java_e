package E7_�迭7_�˰���;

import java.util.Arrays;

public class �迭7_�˰���_��ǲ�߰�����2 {
	/*
		1) arr �迭�� ������3�̴�.		
		2) input �迭 ���� ������  �߰��� ������ �ݺ��� �����̴�.		
		3) 0�� �ε����� ���� "�߰�" �̰�, 
		4) 1�� �ε����� ���� "����" �̴�. 
		   [����] �������ڸ��� �ڿ������� ������ �о�� 0���� ǥ�� �Ѵ�. 	
		5) �ߺ��Ȱ��� "�߰�" �Ҽ����� , ���°��� "����"�Ҽ�����.
		6) input�� ������ ���� ó���ϰ� ó��������� 		
		��)
		 10 ==> ¦���ε����̹Ƿ� �߰� ==> arr[] = {10,0,0};
		 20 ==> Ȧ���ε����̹Ƿ� ���� ==> 20�� �����Ƿ� ==> "�����Ұ��� �����ϴ�"
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> arr[] = {10,30,0};
		 10 ==> Ȧ���ε����̹Ƿ� ���� ==> arr[] = {30,0,0};
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> 30 ���̹� ����Ǿ ==> "�ߺ��˴ϴ�"
		 30 ==> Ȧ���ε����̹Ƿ� ���� ==> arr[] = {0,0,0};
	*/
	public static void main(String[] args) {
		
		int arr[] = {0,0,0};
		int count = 0;
			
		int input[][] = {{10,20},{30,10},{30,30}};		
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input[i].length; j++) {
				System.out.print(input[i][j] + " ==> ");
				boolean check1 = false;
				boolean check2 = false;
				int index = 0;
				if(j%2 == 0) {
					check1 = true;
				}
				for(int k=0; k<arr.length; k++) {
					if(input[i][j] == arr[k]) {
						check2 = true;
						index = k;
						break;
					}
				}
				if(check1 == true) {
					System.out.print("¦���ε����̹Ƿ� �߰� ==> ");
					if(check2 == true) {
						System.out.println(input[i][j] + "�� �̹� ���� ==> \"�ߺ�\"");
					}
					else {
						arr[count] = input[i][j];
						count++;
						System.out.print("arr[] = ");
						System.out.println(Arrays.toString(arr));
					}
				}
				else {
					System.out.print("Ȧ���ε����̹Ƿ� ���� ==> ");
					if(check2 == true) {
						for(int k=index; k<arr.length-1; k++){
							arr[k] = arr[k+1];
						}
						arr[arr.length-1] = 0;
						System.out.print("arr[] = ");
						System.out.println(Arrays.toString(arr));
					}
					else {
						System.out.println(input[i][j] + "�� �����Ƿ� ==> \"����\"");
					}
				}
			}
		}
	}

}