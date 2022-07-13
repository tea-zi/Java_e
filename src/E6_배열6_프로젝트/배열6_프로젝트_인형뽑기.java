package E6_배열6_프로젝트;

public class 배열6_프로젝트_인형뽑기 {
	/*
	 * 위 데이터는 인형뽑기 기계의 데이터 이다. (7 x 5) 사이즈
	 * [인형번호] 
	 * [1 : 호랑이] [2 : 곰] [3 : 사자] [4 : 기린]
	 * -------------------------------------------------
	 * [1] 숫자 0 은 비어있는것을뜻한다.
	 * [2] 숫자 0 이 아닌곳은 인형이 있는것을 뜻하고 숫자는 인형번호이다.
	 * [3] input의 데이터는 오늘 손님들이 인형을 선택한 인덱스번호이다.
	 * [4] 세로단위로 한라인이고, 인덱스번호는 가로로 선택이 된다. (예 0~4번까지 가능)
	 * [5] 인형은 각라인별 맨위에서부터 뽑히게된다. 
	 * 예) input ==> 1 ==> 2,1,4,1,1 라인이고 맨위의 2가 0이된다.
	 * [6] 만약에 전부 값이 0인 라인을 선택하게되면, "꽝" 출력 
	 * [7] 오늘 판매된 인형 이름을 출력하시요. 
	 * 예) 
	 *    1 ==> [2:곰]
	 *    0 ==> [3:사자]
	 *    0 ==> [1:호랑이]
	 *    3 ==> [3:사자]
	 *    3 ==> [0:꽝]
	 *    4 ==> [3:사자]
	 *    4 ==> [3:사자]
	 
	 */

	public static void main(String[] args) {
		
		int machine[][] = {
				{0,0,0,0,0},
				{0,0,0,0,3},
				{0,2,0,0,3},
				{3,1,3,0,1},
				{1,4,2,0,2},
				{4,1,4,0,4},
				{2,1,4,3,3},
		};
		int input[] = {1,0,0,3,3,4,4};
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i] + " ==> ");
			int count = 0;
			for(int j=0; j<machine.length; j++) {
				if(machine[j][input[i]] == 0) {
					count++;
				}
				else if(machine[j][input[i]] == 1) {
					System.out.println("[1: 호랑이]");
					machine[j][input[i]] = 0;
					break;
				}
				else if(machine[j][input[i]] == 2) {
					System.out.println("[2: 곰]");	
					machine[j][input[i]] = 0;
					break;
				}
				else if(machine[j][input[i]] == 3) {
					System.out.println("[3: 사자]");
					machine[j][input[i]] = 0;
					break;
				}
				if(count == machine.length) {
					System.out.println("[0: 꽝]");
				}
			}
		}
	}
}