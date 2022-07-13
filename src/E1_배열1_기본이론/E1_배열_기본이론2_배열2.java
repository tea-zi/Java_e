package E1_배열1_기본이론;

public class E1_배열_기본이론2_배열2 {

	public static void main(String[] args) {

		/* 
		 * 1.배열 사용법(1) 
		 */
		int[] array = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;

		for (int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
		System.out.println("-----------------------------");
		
		/*
		 * 2.배열 사용법(2) : 아래는 축약형이다. (위와 동일한 결과이다.)
		 */
 
		int[] temp = { 10, 20, 30 };

		for (int i = 0; i < 3; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("-----------------------------");
		/*
		 * 단, 축약형은 처음에 한번만 적용되고, 그이후 값을 변경하고싶으면 직접 넣어야한다.
		 */	
		
		//temp = { 40, 50, 60 }; // 이렇게 한번더 축약형을 쓰면 에러발생	
		temp[0] = 40;
		temp[1] = 50;
		temp[2] = 60;
		for (int i = 0; i < 3; i++) {
			System.out.println(temp[i]);
		}
	}

}