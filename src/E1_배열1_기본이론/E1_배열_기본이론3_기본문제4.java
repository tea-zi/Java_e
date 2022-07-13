package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제4 {
	/*
		[문제1] 
		
		 array1배열 과 array2배열의 각자리별 합을 temp1에저장
		 temp1 = {10 + 5 , 20 + 8, 30 + 54, 40 + 32, 50 + 1};
				
		[문제2] 
		
		 array1배열 과 array2배열의 각자리별 차를 temp2에저장
		 temp2 = {10 - 5 , 20 - 8, 30 - 54, 40 - 32, 50 - 1};
	 */
	public static void main(String[] args) {

		int array1[] = {10,20,30,40,50};
		int array2[] = {5,8,54,32,1};
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		
		for(int i=0; i<5; i++) {
			temp1[i] = array1[i] + array2[i];
			System.out.print(temp1[i] + " ");
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			temp2[i] = array1[i] - array2[i];
			System.out.print(temp2[i] + " ");
		}
	

	}

}