package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Random;

public class �迭2_�˰���_���� {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {10,20,30,40,50,60};
	
		//���� 	
		// 1) �ε��� 2���� ����(0~5)���� �����ϰ� �� �ε����� ���� ��ȯ
		// 2) �� 1���� 10 �� �ݺ��ϸ� ����  ��� 
		
		//��) 1 , 2 ==> {10,30,20,40,50,60};  // 20 �� 30�� ��ȯ��.
		
		//��) 4 , 1 ==> {10,50,20,40,30,60};  // 50 �� 30�� ��ȯ��.
		
		//��) 3 , 3 ==> {10,50,20,40,30,60}; // ������ �ƹ��ϵ��Ȼ����.
		for(int i=0; i<10; i++) {
			int index1 = ran.nextInt(6);
			int index2 = ran.nextInt(6);
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(arr));
	}
}