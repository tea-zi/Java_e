package E1_배열1_기본이론;

public class E1_배열_기본이론4_학생성적4 {
	/*
	 * 	numberList = {1001, 1002, 1003, 1004, 1005};
		scoreList  = {  87,   11,   45,   98,   23};
	 *  [문제] 1등학생의 학번과 성적 출력한다.
	 *  [정답] 1004번(98점)
	 */
	public static void main(String[] args) {
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		int max = 0;
		int num = 0;
		for(int i=0; i<5; i++) {
			if(max <  scoreList[i]) {
				max = scoreList[i];
				num = numberList[i];
			}
		}
		System.out.println("1등 학생");
		System.out.println("학번 : " + num + "  성적 : " + max);
	}

}