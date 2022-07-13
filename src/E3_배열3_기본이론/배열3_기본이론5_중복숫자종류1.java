package E3_배열3_기본이론;

import java.util.Arrays;
import java.util.Random;

public class 배열3_기본이론5_중복숫자종류1 {
	public static void main(String[] args) {
		
		// 중복숫자금지 ==> 1~4를 배열에 저장하는데 섞어서 중복없이 저장한다. 
		// 중복숫자 해결방법 3가지 
		// 
		// [1] 셔플 		
		Random ran = new Random();
		
		int arr1[] = new int[4]; // 전부 0 저장 
		
		for(int i = 0; i < 4; i++) {
			arr1[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr1));
	
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(4);
			int r2 = ran.nextInt(4);
			int temp = arr1[r1];
			arr1[r1] = arr1[r2];
			arr1[r2] = temp;		
		}
		System.out.println(Arrays.toString(arr1));	
		
	}
}