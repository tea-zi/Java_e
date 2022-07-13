package E6_배열6_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 배열6_프로젝트_영화예매 {

	/* 
	 * [영화관좌석예매]
	 * (1)회원가입 (2)로그인  (0) 종료
	 * 
	 * [회원가입] ==> id 만 가입 ==> 중복처리 
	 * [로그인후] ==> (1) 로그아웃 (2) 예매 (3) 예매확인(본인것만 좌석번호출력 ) 
	 *              (4) 예매취소(본인것만) (5) 전체확인 (0) 뒤로가기 
	 *
	 * 1) 회원가입은 10명까지 가능하다.
	 * 2) idList 에는 회원들의 id를 저장 
	 * 3) 로그인이후 좌석을 구매하면 seatList 는 구매한사람의 id 를저장 
	 * 4) 필요한변수는 추가할수있다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int MAX = 10;
		final int ROW = 3;
		final int COL = 4;
		int idList[] = new int[MAX];
		int seatList[][]= new int[ROW][COL]; 
		int countid = 0;
		int log = -1;
		while(true) {
			System.out.println("(1)회원가입 (2)로그인  (0)종료");
			int sel1 = scan.nextInt();
			if(sel1 == 1) {
				if(countid == 10) {
					System.out.println("가입이 불가능합니다.");
				}
				else {
					System.out.print("id 입력 : ");
					int joinid = scan.nextInt();
					boolean check = false;
					for(int i=0; i<idList.length; i++) {
						if(joinid == idList[i]) {
							check = true;
						}
					}
					if(check == true) {
						System.out.println("중복된 아이디입니다.");
						}
					else {
						idList[countid] = joinid;
						countid++;
					}
				}
				System.out.println(Arrays.toString(idList));
			}
			if(sel1 == 2) {
				System.out.print("id 입력 : ");
				int logid = scan.nextInt();
				boolean check = false;
				for(int i=0; i<idList.length; i++) {
					if(logid == idList[i]) {
						check = true;
						break;
					}
				}
				if(check = true) {
					log = logid;
				}
				else {
					System.out.println("가입된 아이디가 아닙니다.");
				}
				if(log != -1) {
					while(true) {
						System.out.println("(1) 로그아웃 (2) 예매 (3) 예매확인(본인것만 좌석번호출력 ) \r\n"
								+ "(4) 예매취소(본인것만) (5) 전체확인 (0) 뒤로가기 ");
						int sel2 = scan.nextInt();
						if(sel2 == 1) {
							System.out.println("로그아웃");
							log = -1;
							break;
						}
						else if(sel2 == 2) {
							System.out.print("열 선택 : ");
							int row = scan.nextInt();
							System.out.print("번호 선택 : ");
							int col = scan.nextInt();
							boolean rowcheck = false;
							boolean colcheck = false;
							if(row < ROW && row >= 0) {
								rowcheck = true;
							}
							if(col < COL && col >=0) {
								colcheck = true;
							}
							if(rowcheck == true && colcheck == true) {
								if(seatList[row][col] == 0) {
									seatList[row][col] = log;
								}
								else {
									System.out.println("예매가 완료된 좌석입니다.");
								}
							}
							else {
								System.out.println("오류");
							}
						}
						else if(sel2 == 3) {
							for(int i=0; i<seatList.length; i++) {
								for(int j=0; j<seatList[i].length; j++) {
									if(log == seatList[i][j]) {
										System.out.printf("[%d , %d]\n",i,j);
									}
								}
							}
						}
						else if(sel2 == 4) {
							int count = 0;
							for(int i=0; i<seatList.length; i++){
								for(int j=0; j<seatList[i].length; j++) {
									if(log == seatList[i][j]) {
										System.out.printf("[%d , %d]\n",i,j);
										count++;
									}
								}
							}
							if(count == 0) {
								System.out.println("예매좌석이 없습니다.");
							}
							else {
								System.out.print("취소할 열 : ");
								int row = scan.nextInt();
								System.out.print("취소할 번호 : ");
								int col = scan.nextInt();
								seatList[row][col] = 0;
								System.out.println("취소되었습니다.");
							}
						}
						else if(sel2 == 5) {
							for(int i=0; i<seatList.length; i++) {
								System.out.println(Arrays.toString(seatList[i]));
							}
						}
						else if(sel2 == 0) {
							break;
						}
					}
				}
							
			}
			if(sel1 == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}