package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_�ΰ��̾Ƽ����ϱ�_���� {
	/*	
		 [1] arr �迭���� ���� 2���� �̾Ƽ� ���Ѱ��� ���ʴ�� result �� ���������
		 [2] �ڱ����� �ε����� ����  �������ʴ´�.		
		  (1) [�ε��� 0] �ǰ� 2 + (1,3,4,1) ==> 2 + 1 , 2 + 3 , 2 + 4 , 2 + 1
		  (2) [�ε��� 1] �ǰ� 1 + (2,3,4,1) ==> 1 + 2 , 1 + 3 , 1 + 4 , 1 + 1
		  (3) [�ε��� 2] �ǰ� 3 + (2,1,4,1) ==> 3 + 2 , 3 + 1 , 3 + 4 , 3 + 1
		   ....		
		 [�߰� ����] result �� ����Ȱ����� �ߺ��Ǵ� ���� ���� ������ ��� 
	*/
	public static void main(String[] args) {
		int arr[]  = {2,1,3,4,1};
		
		int result [] = new int[100];
		int index1 = 0;
		int index2 = 0;
		while(true) {
			for(int i = 0; i < arr.length; i++) {
				if(index1 != i) {
					System.out.println(index1);
					result[index2] = arr[index1] + arr[i];
					index2++;
				}
			}
			index1++;
			if(index1 == arr.length) {
				break;
			}
		}
		System.out.println(Arrays.toString(result));
		// ���� 
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i == j) {
					continue;
				}else {
					result[index] = arr[i] + arr[j];
					index += 1;
				}
			}
		}
		System.out.println(Arrays.toString(result));
		for(int i = 0; i < result.length; i++) {
			int count = 0;
			for(int j  = i; j < result.length; j++) {
				if(result[i] == result[j]) {
					result[j] = 0;
					count++;
				}
			}
			if(count != 0) {
				result[i] = 0;
			}
		}
		System.out.println(Arrays.toString(result));
	}
}