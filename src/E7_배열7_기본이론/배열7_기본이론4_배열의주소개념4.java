package E7_배열7_기본이론;

public class 배열7_기본이론4_배열의주소개념4 {
	public static void main(String[] args) {
		
		int [][] arr = {
				{10,20,30},
				{10,20,30,40,50},
				{10,20,30,40}
		};
		
		//위와같은 각 열의 크기가 다른 2차원배열을 반복문으로 만들기
		
		int low = 3;
		int [][] test = new int[low][];
		
		int []list = {3,5,4};
		
		
		for(int i = 0; i < low; i++) {
			int[] temp = new int[list[i]];
			int value = 10;
			for(int j =0; j < list[i]; j++) {
				temp[j] = value;
				value += 10;
			}
			test[i] = temp;
		}
		
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}
	}
}