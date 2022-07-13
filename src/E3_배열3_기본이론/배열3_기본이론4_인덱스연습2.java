package E3_배열3_기본이론;

public class 배열3_기본이론4_인덱스연습2 {
	/*
	 * [문제] 
	     b의 값들 은arr1의 인덱스이다.
		 arr1배열에서 b의 값들이 가르키는 인덱스의 값을 출력 
	 */
	
	public static void main(String[] args) {
		
		int arr1[] = {10,20,30,40,50};
		int b[] = {1,4,0};
		
		
		System.out.println("흔히 아래와같이 오류를 범한다.");
		System.out.println("b의 값은 arr배열의 인덱스 이므로 아래와같이 복잡하게 찾을필요없다.");
		System.out.println("----------------");
		for(int i = 0; i < b.length;i++) {
			for(int j = 0; j < arr1.length; j++) {
				if(b[i] == j) {
					System.out.println(arr1[j]);
				}
			}
		}
		
		System.out.println("----------------");
		for(int i = 0; i < b.length; i++) {
			System.out.println(arr1[b[i]]);
		}
		
		System.out.println("----------------");
		for(int i = 0; i < b.length; i++) {
			int index = b[i];
			System.out.println(arr1[index]);
		}
		
		
	}
		
}