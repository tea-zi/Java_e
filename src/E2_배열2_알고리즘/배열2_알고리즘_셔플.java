package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열2_알고리즘_셔플 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {10,20,30,40,50,60};
	
		//셔플 	
		// 1) 인덱스 2개를 랜덤(0~5)으로 저장하고 각 인덱스의 값을 교환
		// 2) 위 1번을 10 번 반복하며 과정  출력 
		
		//예) 1 , 2 ==> {10,30,20,40,50,60};  // 20 과 30이 교환됨.
		
		//예) 4 , 1 ==> {10,50,20,40,30,60};  // 50 과 30이 교환됨.
		
		//예) 3 , 3 ==> {10,50,20,40,30,60}; // 같을땐 아무일도안생긴다.
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