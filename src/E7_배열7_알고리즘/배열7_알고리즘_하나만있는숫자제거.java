package E7_배열7_알고리즘;

import java.util.Arrays;

public class 배열7_알고리즘_하나만있는숫자제거 {
	/*
		 아래 배열에서 혼자있는 숫자를 제거한후 나머지값들만  temp1~3 에 저장후 출력
		 1) {1,2,2,1,0}    // 3이 혼자있음
		 2) {4,4,0,0,0}        // 1,2,3 혼자있음
		 3) {1,1,1,1,1}  // 없음
	*/

	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,1,1};
		
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		int temp3[] = new int[5];
		System.out.println(Arrays.toString(test1));
		System.out.println(Arrays.toString(test2));
		System.out.println(Arrays.toString(test3));
		System.out.println("--------------------");
		int temp[][] = new int[3][];
		temp[0] = test1;
		temp[1] = test2;
		temp[2] = test3;
		for(int i=0; i<temp.length; i++) {
			int index = 0;
			System.out.println("test" + i);
			System.out.println("========");
			while(index < temp[i].length) {
				int count = 0;
				System.out.println("----------------");
				System.out.println("index : " + index + " " + temp[i][index]);
				for(int j=0; j<temp[i].length; j++) {
					if(index == j || temp[i][j] == 0) {
						continue;
					}
					if(temp[i][index] == temp[i][j]) {
						count++;
						System.out.println("count : " + count);
					}
				}
				if(count == 0 && temp[i][index] != 0) {
					for(int j=index; j<temp[i].length-1; j++) {
						System.out.println(temp[i][j]);
						System.out.println(temp[i][j+1]);
						temp[i][j] = temp[i][j+1];
						System.out.println(temp[i][j]);
						System.out.println(Arrays.toString(temp[i]));
					}
					temp[i][temp[i].length-1] = 0;
					System.out.println(Arrays.toString(temp[i]));
				}
				else {
					index++;
				}
				System.out.println(Arrays.toString(temp[i]));
			}
		}

		temp1 = test1;
		temp2 = test2;
		temp3 = test3;
		System.out.println(Arrays.toString(temp1));
		System.out.println(Arrays.toString(temp2));
		System.out.println(Arrays.toString(temp3));
	}
}