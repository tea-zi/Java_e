package E3_배열3_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열3_프로젝트_기억력게임 {
	/*
	  [기억력 게임]
	  1. 같은 글자가 적혀있는 카드 2장씩 5세트가있다. (총10장)
	  2. front 는 카드를 엎어논 상태를 뜻한다. 
	  3. 먼저 front 를 셔플한다. 
	  4. front 에 있는 카드 2개를 선택한다. (마우스가없으므로 인덱스로 선택)
	  5. 선택한카드 2장의 내용이 같으면  back 에 복사해서 맞춘걸 표시한다. 
	     back에 모든 글자 가 채워지면 게임은 종료된다.
	   [조건] 같은 인덱스 선택할수없다. 
	   예)
	   [1] 초기화 
	     front = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e' };
	     back  = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-' };
	  
	   [2] 셔플 
	     front = {'a', 'e', 'c', 'b', 'd', 'c', 'b', 'd', 'a', 'e'};
	
	   [3] 인덱스 입력 	   
	     1) 인덱스 2개 ==>  0 , 8  ==>front 배열의 인덱스 0, 과 8 의 값은  a , a 로 
	                서로 같은 내용이므로 back 에 복사
	     	back  =  {'a', '-', '-', '-', '-', '-', '-', '-', 'a', '-' };
	     	
	     2) 인덱스 2개 ==>  1 , 2  ==>front 배열의 인덱스 1, 과 2의 값은 e , c 로 
	                서로 다른글자이므로 아무일없음
	     	back  =  {'a', '-', '-', '-', '-', '-', '-', '-', 'a', '-' };	
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		char[] front = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
		char[] back = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};
		char[] arr = new char[10];
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<10; i++) {
			int r1 = ran.nextInt(front.length);
			int r2 = ran.nextInt(front.length);
			char temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
		System.out.println(Arrays.toString(front));
		int count = back.length/2;
		while(true) {
			if(count == 0) {
				break;
			}
			System.out.print(" 인덱스 입력 : ");
			int index = scan.nextInt();
			int index2 = scan.nextInt();
			if(front[index] == front[index2] && back[index] =='-' && back[index2] == '-') {
				back[index] = front[index];
				back[index2] = front[index2];
				System.out.println(Arrays.toString(back));
				count--;
			}
			else {
				System.out.println("일치하지 않음");
			}
		}
	}
}