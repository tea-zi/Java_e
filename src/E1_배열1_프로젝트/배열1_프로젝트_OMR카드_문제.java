package E1_�迭1_������Ʈ;

import java.util.Random;

public class �迭1_������Ʈ_OMRī��_���� {
	/*
	 * [OMRī��]
	 * 
	 * 1. �迭 test�� ���蹮���� �������̴�.
	 * 2. �迭 student�� 1~5 ������ ���� ���� 5���� �����Ѵ�.	
	 * 3. ���ڸ����� ���ؼ� ������ ����Ѵ�.
	 *     ==> ������ true , Ʋ���� false
	   4. ������ �� ������ 20���̴�.
	   5. ������ ����Ѵ�.  
	   
	 * [��]
	 * test  = {1, 3, 4, 2, 5}
	 * student = {1, 1, 4, 4, 3}
	 * result  = {t, f, t, f, f} 
	*/


	public static void main(String[] args) {
		Random ran = new Random();
		int[] test = {1, 3, 4, 2, 5};
		int[] student = new int[5];
		boolean[] result = new boolean[5];
		
		for(int i=0; i<5; i++) {
			student[i] = ran.nextInt(5)+1;
			if(student[i] == test[i]) {
				result[i] = true;
			}
		}
		int socre = 0;
		for(int i=0; i<5; i++) {
			if(result[i] == true) {
				socre += 20;
			}
			System.out.println(student[i]);System.out.println(result[i]);
		}
		System.out.println(socre);
	}
}