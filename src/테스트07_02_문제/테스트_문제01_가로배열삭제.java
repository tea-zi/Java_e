package 테스트07_02_문제;

import java.util.Arrays;

/*
	[문제] 
	아래 배열 c는 번호와 값이 한쌍인 배열이다. 
	번호를 하나를 입력받고 c배열에 있는 번호이면, 
	그번호와  값만 제외하고 d배열에 복사한다.
	[예]  
		c[] = { 1001, 40, 1002, 65, 1003, 70 };
		입력 : 1002 
		c[] = {1001, 40, 1003, 70}; 
 */
public class 테스트_문제01_가로배열삭제 {
	public static void main(String[] args) {
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = new int[c.length - 2];
		int num = 1002;
		int index = 0;
		for (int i = 0; i < c.length; i += 2) {
			if (c[i] != num) {
				d[index] = c[i];
				index++;
				d[index] = c[i + 1];
				index++;
			}
		}
		System.out.println(Arrays.toString(d));
	}
}