package E2_배열2_알고리즘;
public class 배열2_알고리즘_1등 {
	/*
	 * [문제]
	 * 
	 * [1둥]
	 *   아래 데이터는 학생번호1개, 점수2개가 한세트이다. 		
		 번호는 1001부터시작이고 , 점수는 0~100 이다. 
		 예) 1001 , 20, 30 ==> 1001번 1번점수 20점, 2번점수 30점
		 		 
		
		 1등의 번호 출력한다. 
		 점수는 두점수의 합으로계산한다. 
	 */
	public static void main(String[] args) {
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		int sum = 0;
		int max = 0;
		for(int i=0; i<arr.length; i+=3) {
			if(sum < arr[i+1]+arr[i+2]) {
				sum = arr[i+1]+arr[i+2];
				max = arr[i];
			}
		}
		System.out.println("1등 학생 : " + max );
		for(int i=0; i<arr.length; i+=3) {
			if(max == arr[i]) {
				System.out.println("성적 1번점수 : "+arr[i+1]+"  2번점수 : "+arr[i+2]);
			}
		}
	}
}