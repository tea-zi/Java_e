package E3_배열3_알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열3_알고리즘_로또_정답 {
	/*
	  [문제]
	  
	 	[로또] 
		1~45사이의 랜덤값 6 개를 lotto1 에 저장할려고 한다.
		[조건] 중복되는숫자는 없어야한다. 
	*/
	public static void main(String[] args) {		
		int lotto1[] = new int[6];				
		int lotto[] = new int[45];
		
		for(int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}
		Random ran= new Random();
		
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(45);
			int r2 = ran.nextInt(45);		
			int temp = lotto[r1];
			lotto[r1] = lotto[r2];
			lotto[r2] = temp;	
			System.out.print(r1 + " " + r2 +  " : ");
			System.out.println(Arrays.toString(lotto));
		}
		System.out.println(Arrays.toString(lotto));
		for(int i = 0; i < 6; i++) {
			lotto1[i] = lotto[i];
		}
		System.out.println(Arrays.toString(lotto1));
		
		for(int i = 0; i < lotto1.length; i++) {
			int max = lotto1[i];
			int index = i;
			
			System.out.println("lotto1[i] : " + lotto1[i]);
			System.out.println("index : " + index);
			for(int j = i + 1; j < lotto1.length; j++) {
				if(max > lotto1[j]) {
					max= lotto1[j];
					index = j;
				}
			}
			System.out.println("max : " + max);
			System.out.println("index : " + index);
			
			int temp = lotto1[i];
			lotto1[i] = lotto1[index];
			lotto1[index] = temp;
			
			System.out.println(Arrays.toString(lotto1));
		}
		
		System.out.println(Arrays.toString(lotto1));
		
	}
}