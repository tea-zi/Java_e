package E4_배열4_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열4_프로젝트_더하기게임 {
	/*
	  [더하기게임]	
		1) 1~10 사이의 숫자를 랜덤으로 7개보여준다. (중복금지)
		2) 그안에서 3개의 인덱스를 고를수있게해준다. (중복금지)
		3) 숫자를 랜덤 으로 하나 제시하는데  인덱스3개의 값의 합이
		   제시된 숫자랑 같으면 정답. 
		   단, 정답은 여러개 일수있다. 
		4) 반드시 정답의 경우의 수는 있어야한다.	 
		   단! 중복으로 값을 고를순없다. 
		 [예]
		    보기  = {1,5,8,6,4,2,9};
		    제시어 = 13	
		    정답) 인덱스 ==> 0,2,4  ==>  1 + 8 + 4	
		 
		    잘못된예) 인덱스 ==> 5,5,6 ==> 2 + 2 + 9
	*/
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num[] = new int[7];
		int index = 0;
		while(true) {
			if(index == num.length) {
				break;
			}
			boolean check = false;
			int r = ran.nextInt(10)+1;
			for(int i=0; i<num.length; i++) {
				if(r == num[i]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				num[index] = r;
				index++;
			}
		}
		System.out.println(Arrays.toString(num));
		int rnum[] = new int[3];
		for(int i=0; i<rnum.length;) {
			int r = ran.nextInt(7);
			boolean check = false;
			for(int j=0; j<i; j++) {
				if(r == rnum[j]) {
					check = true;
				}
			}
			if(check == false) {
				rnum[i] = r;
				i++;
			}
		}
		int total = 0;
		for(int i=0; i<rnum.length; i++) {
			total += num[rnum[i]];
		}
		System.out.println(total);
		
		int me[] = new int[3];
		while(true) {
			System.out.print("인덱스 3개를 고르시오");
			for(int i=0; i<me.length; i++) {
				me[i] = scan.nextInt();
			}
			int sum = 0;
			for(int i=0; i<me.length; i++) {
				sum += num[me[i]];
			}
			if(total == sum) {
				System.out.println(sum);
				System.out.println("정답");
				break;
			}
			else {
				System.out.println(sum);
				System.out.println("오답");
			}
		}
	}

}