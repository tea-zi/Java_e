package E2_�迭2_�⺻�̷�;
import java.util.Arrays; 

public class �迭2_�⺻�̷�3_������� {
	/*
	 *  �迭�� ��ü���� ����ϱ⽬�� ��� 
	 *  (��) arr1[] = {1,2,3,4};
	 * 
	 *  [1] import java.util.Arrays; 
	 *  [2] Arrays.toString(arr1)
	 *  
	 *  ���� ���δ� �Ʒ��Ͱ��� ��������ִ�.
	 */

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4};
		
		
		System.out.print("[");
		for(int i=0; i<arr1.length; i++) {
			if(i < arr1.length-1) {
				System.out.print(arr1[i] + ", ");
			}else {
				System.out.print(arr1[i]);
			}
			
		}
		System.out.print("]");
		
		System.out.println();
		
				
		System.out.println("------------");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1));
		
	}

}