package E6_배열6_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열6_알고리즘_연속빈칸찾기 {
	/*

	 [1] 배열 arr 은 1과 0으로 되어있다.
	 [2] 숫자1 은 이미 채워진 자리이고 0은 비어있는자리이다.
	 [3] input 변수에 값을 입력받고 아래 내용대로 구현 
	  	예) input => 3 ==> 인덱스 2부터 연속으로 3칸이 비어있으므로, 
	 		{0,1,1,1,1,1,0,0};	
	 		
	 	예) input => 4 ==> 연속으로4칸 비어있는자리가 없으므로 "x"
	 		{0,1,0,0,0,1,0,0};
	 		
	 	예) input => 1 ==> 인덱스 0의 자리가 비어있으므로 
	 		{1,1,0,0,0,1,0,0};	
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {0,1,0,0,0,1,0,0};
		System.out.print("변수 입력 : ");
		int input = scan.nextInt();
		int count = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				count++;
				if(input == count) {
					index = i;
					break;
				}
			}
			else {
				count=0;
			}
		}
		if(count == input) {
			while(true) {
				if(arr[index] == 0) {
					arr[index] = 1;
					if(index != 0) {											
						index--;
					}
				}
				else {
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println(input + "칸 연속으로 빈자리가 없습니다.");
			System.out.println("x");
		}
		System.out.println(Arrays.toString(arr));
	}
}