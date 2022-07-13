package E3_배열3_기본이론;


public class 배열3_기본이론4_인덱스연습1 {
	//[문제] 인덱스가 3인곳의 값을 출력 
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		
		System.out.println("인덱스를 알면 검색할필요가없는데 흔히하는 오류");
		for(int i = 0; i < arr.length; i++) {
			if(i == 3) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("----------------");
		System.out.println(arr[3]);		
		System.out.println("----------------");
	}
		
}