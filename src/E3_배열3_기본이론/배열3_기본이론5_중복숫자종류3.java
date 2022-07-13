package E3_배열3_기본이론;

import java.util.Arrays;
import java.util.Random;

public class 배열3_기본이론5_중복숫자종류3 {
	public static void main(String[] args) {
		
		// 중복숫자금지 ==> 1~4를 배열에 저장하는데 섞어서 중복없이 저장한다. 
		// 중복숫자 해결방법 3가지 
		// 
		// [3] 전체 검사
		Random ran = new Random();
		int arr1[] = new int[4]; // 전부 0 저장 
		
		for(int i = 0; i < 4;) {
			int r = ran.nextInt(4) + 1;
			boolean check = false;
			for(int j = 0; j < i; j++) {
				if(arr1[j] == r) {
					check = true;
					break;
				}
			}
			if(check == false) {
				arr1[i] = r;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(arr1));
		
	}
}