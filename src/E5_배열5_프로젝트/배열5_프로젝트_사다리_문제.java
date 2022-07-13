package E5_배열5_프로젝트;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class 배열5_프로젝트_사다리_문제 {

	/*
	 * # 사다리 게임
	 * 1. 인덱스 0~4를 하나선택한다. (가로개수가 5개) 맨위 에서 부터 내려간다.
	 * 2. 숫자 0 을 만나면 그냥 아래로 내려간다.
	 * 3. 숫자 1 을 만나면 오른쪽으로 이동후 내려간다.
	 * 4. 숫자 2 를 만나면 완쪽으로 이동후 내려간다.
	 * 5. 오늘의 메뉴 출력 
	 * [심화] 전부 0으로 가득채운후 사다리를 랜덤으로 배치해보자.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String menu[] = {"떡라면" , "돈까스" ,"짜장면" , "쫄면" , "된장찌개"};
		
		int ladder[][]= {
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{0,0,0,0,0}};
		for(int i=1; i<ladder.length-1; i++) {
			for(int j=0; j<ladder[i].length; j++) {
				int r = ran.nextInt(3);
				ladder[i][j] = r;
			}
		}
		//while(true) {
		for(int i=0; i<ladder.length;i++) {
			System.out.println(Arrays.toString(ladder[i]));
		}
		System.out.print("인덱스 입력 : ");
		int index = scan.nextInt();
		for(int i=0; i<ladder.length; i++) {
			if(ladder[i][index] == 0) {
				ladder[i][index] = 3;
			}
			else if(ladder[i][index] == 1) {
				ladder[i][index] = 3;
				index++;
			}
			else if(ladder[i][index] == 2) {
				ladder[i][index] = 3;
				index--;
			}
		}
		for(int i=0; i<ladder.length;i++) {
			System.out.println(Arrays.toString(ladder[i]));
		}
		System.out.println(menu[index]);
		//}
	}
}