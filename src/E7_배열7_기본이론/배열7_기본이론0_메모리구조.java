package E7_배열7_기본이론;

public class 배열7_기본이론0_메모리구조 {
	public static void main(String[] args) {
		
		// ram , hdd
		// ram의 특징 : 속도가 빠르다, 프로그램종료시 데이터가 사라진다. 비싸다 	
		/*
		 * ram 의 공간중 최소단위는 1byte 이다. 
		 * 8기가램 ==> 
		 * [1] 1b  ==> 1024 ==> 1k
		 * [2] 1kb ==> 1024 ==> 1m
		 * [3] 1mb ==> 1024 ==> 1g
		 * [4] 1gb ==> 8 ==> 학원컴퓨터 
		 * 
		 */		
		/*
		 * 1byte ==> 8bit 
		 * 비트 ==> 스위치 ( 켯다 , 껏다)
		 * 00000000 ==> 전부껏다.
		 * 11111111 ==> 전부켯다.
		 */
		
		/*
		 * 0000 0001 ==> 1
		 * 0000 0010 ==> 2
		 * 0000 0011 ==> 3
		 * 0000 0100 ==> 4
		 * 0000 1010 ==> 10
		 * 0111 1111 ==> 
		 */
		int a = 1; // 4byte ==> 0 * 32 
		a = 2;
		a = 3;
		a = 4;
		
		// 영어 ==> 1byte 전부 저장가능 
		char c = 'a'; // c = 97;
		char d = 'ㄱ'; // 2byte
		System.out.println(c);
		System.out.println((int)c);
		System.out.println((int)d);	
		// utf-8 ==> 알아서 각 언어별로 메모리를 설정해준다. 
		
	}
}