package E1_배열1_기본이론;

public class E1_배열_기본이론1_배열1 {
	/*
	 * [배열] (array)
	 * 1. "같은 종류"의 데이터를 "여러개" 저장하기 위한 기술
	 * 
	 * 2. 선언법 
	 * 		
	 * 		int[] array = new int[방의 개수];  // [] 대괄호 위치는 앞 뒤 어디든상관없다.
	 * 		int array[] = new int[방의 개수];
	 * 
	 * 3. 인덱스(index)
	 * 		0부터 시작하는 방번호(index)가 부여된다.
	 *      방번호는 순차적으로 1씩 증가한다. 
	 *      예) int array[] = new int[5];
	 *      방번호는 0,1,2,3,4
	 *      
	 * 4. 배열의 초기화 
	 *    배열은 null 을 사용한다.
	 *    
	 * 5. 배열의 각각의 변수의 초기화
	 * 	  배열은 자동으로 변수에 0 을 저장한다.
	 * 
	 * 6. 사용법 
	 * 		각각의 방번호를 이용해서 값을저장한다. 
	 * 			array[0] = 1;
	 * 			array[1] = 2;
	 * 
	 * 7. 없는 방을 사용하면 에러가 발생한다.
	 * 			array[10] = 10; 
	 * 
	 */

	public static void main(String[] args) {

		// 1.일반변수의 값저장방법. 
		int num = 0;
		num = 10;
		System.out.println("num = " + num);
		System.out.println("------------------------------");
		
		// 2.배열
		int[] array = null;	// 배열은 null 을 0 대신 사용한다.
		array = new int[5]; // 변수 5개가 생겨나고 기본값 0 이 저장된다.(자동으로 저장된다.)
		
		System.out.println(array[0]);				// 0
		System.out.println(array[1]);				// 0
		System.out.println(array[2]);				// 0
		System.out.println(array[3]);				// 0
		System.out.println(array[4]);				// 0
		System.out.println("------------------------------");	
		
		array[0] = 10; // 각각의 변수에 값을 저장한다. 
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		for(int i=0; i<5; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		//array[5] = 100;				없는 방번호의 값을 저장하면 에러발생한다.
		//System.out.println(array[5]); 없는 방번호의 값을 출력하면 에러발생한다.
		
	}

	
}