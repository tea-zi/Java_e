package E6_배열6_프로젝트;

public class 배열6_프로젝트_인형뽑기2 {
	/*
	 * 위 데이터는 인형뽑기 기계의 데이터 이다. (7 x 5) 사이즈
	 * [인형번호] 
	 * [1 : 호랑이] [2 : 곰] [3 : 사자] [4 : 기린]
	 * -------------------------------------------------
	 * [1] 숫자 0 은 비어있는것을뜻한다.
	 * [2] 숫자 0 이 아닌곳은 인형이 있는것을 뜻하고 숫자는 인형번호이다.
	 * [3] input의 데이터는 오늘 손님들이 인형을 선택한 인덱스번호이다.
	 * [4] 세로단위로 한라인이고, 인덱스번호는 가로로 선택이 된다. (예 0~4번까지 가능)
	 * [5] 인형은 각라인별 아래서 부터뽑힌다. 매아래가 뽑히므로 전부 한칸씩 내려온다.
	 * 예) input ==> 1 ==> 2,1,4,1,1 라인이고 맨아래 1 이 뽑히면 2,1,4,1 이된다.
	 * [6] 만약에 전부 값이 0인 라인을 선택하게되면, "꽝" 출력 
	 * [7] 오늘 판매된 인형 이름을 출력하시요. 
	 * 예) 
	 *    1 ==> [1:호랑이]
	 *    0 ==> [2:곰]
	 *    0 ==> [4:기린]
	 *    3 ==> [3:사자]
	 *    3 ==> [0:꽝]
	 *    4 ==> [3:사자]
	 *    4 ==> [4:기린]
	 
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
			int y  = machine.length-1;
			System.out.print(input[i] + " ==> ");
			if(machine[y][input[i]] == 0) {
				System.out.println("[0:꽝]");
			}
			else {
				if(machine[y][input[i]] == 1) {
					System.out.println("[1:호랑이]");
				}
				else if(machine[y][input[i]] == 2) {
					System.out.println("[2:곰]");
				}
				else if(machine[y][input[i]] == 3) {
					System.out.println("[3:사자]");
					
				}
				else if(machine[y][input[i]] == 4) {
					System.out.println("[4:기린]");
						
				}
				
				for(int j=y; j>=1; j--) {
					machine[j][input[i]] = machine[j-1][input[i]];
				}
			}
		}
	}
}