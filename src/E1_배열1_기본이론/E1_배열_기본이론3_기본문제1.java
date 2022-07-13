package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제1 {
	/*
	 * 
		 [문제1] 10부터 50까지 array 배열에 저장후 배열안의 모든값을 출력한다.
		 [예] 10 20 30 40 50
	
		 [문제2] array 배열안의 모든값을 출력한다.
		 [예] 150
	 */
	public static void main(String[] args) {

		int[] array = new int[5];		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			array[i] = (i+1)*10;
		}
		for(int i=0; i<5; i++) {
			sum += array[i];
			System.out.println(array[i] + " " + sum);
		}
	}

}