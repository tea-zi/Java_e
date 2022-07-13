package E2_배열2_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_프로젝트_컨트롤러ATM {
	/*
	 * [ATM] 
	 * 	-전체 기능구현
	 * 1. 회원가입
	 * . id와 pw를 입력받아 가입
	 * . 가입 시 돈 1000원 부여
	 * . id 중복체크
	 * 2. 회원탈퇴
	 * . 로그인시에만 이용가능
	 * 3. 로그인
	 * . id와 pw를 입력받아 로그인
	 * . 로그아웃 상태에서만 이용가능
	 * 4. 로그아웃
	 * . 로그인시에만 이용가능
	 * 5. 입금
	 * . 로그인시에만 이용가능
	 * 6. 이체
	 * . 로그인시에만 이용가능
	 * 7. 잔액조회
	 * . 로그인시에만 이용가능
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] idList = new int[MAX];
		int[] pwList = new int[MAX];
		int[] moneyList = new int[MAX];
		
		int count = 0;
		int log = -1;
		
		//1.회원가입 2.회원탈퇴 3.로그인 4.로그아웃
		//5.입금 6.송금 7.조회 8.전체회원목록 0.종료.
		while(true) {	
			System.out.println("[1.회원가입][2.회원탈퇴][3.로그인][4.로그아웃]\n[5.입금][6.송금][7.조회][8.전체회원목록][0.종료]");
			int sel = scan.nextInt();		
			if(sel == 1) {	
				if(count == MAX) {
					System.out.println("더이상 가입할수없습니다.");
				}
				else {
					System.out.println("회원가입");
					boolean run = true;
					while(run) {
						System.out.print("아이디 입력 : ");
						int joinid = scan.nextInt();
						int cid = 0;
						for(int i=0; i<MAX; i++) {
							if(joinid == idList[i]) {
								System.out.println("동일한아이디가 존재합니다.");
								cid++;
								break;
							}
						}
						if(cid == 0) {
							idList[count] = joinid;
							while(true) {
								System.out.print("비밀번호 입력 : ");
								int joinpw = scan.nextInt();
								int cpw = 0;
								for(int i=0; i<MAX; i++) {
									if(joinpw == pwList[i]) {
										System.out.println("사용할수없는 비밀번호입니다.");
										cpw++;
									}
								}
								if(cpw == 0) {
									pwList[count] = joinpw;
									System.out.println("회원가입 완료");
									moneyList[count] = 1000;
									run = false;
									count++;
									break;
								}
							}
						}
					}
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					if(log != count-1) {
						for(int i=log; i<count-1; i++) {
							idList[i] = idList[i+1];
							pwList[i] = pwList[i+1];
							moneyList[i] = moneyList[i+1];
						}
					}
					idList[count-1] = 0;
					pwList[count-1] = 0;
					moneyList[count] = 0;
					count--;
					log = -1;
					System.out.println("삭제완료");
				}
				else {
					System.out.println("로그인후 이용하세요.");
				}
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.print("아이디 입력 : ");
					int logid = scan.nextInt();
					System.out.print("비밀번호 입력 : ");
					int logpw = scan.nextInt();
					for(int i=0; i<MAX; i++) {
						if(logid == idList[i] && logpw == pwList[i]) {
							log = i;
							break;
						}
					}
				}
				if(log == -1) {
					System.out.println("로그인 실패");
				}
				else {
					System.out.println("로그인 성공");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					log = -1;
					System.out.println("로그아웃");
				}
				else {
					System.out.println("로그인하십시오.");
				}
			}
			else if(sel == 5) {
				if(log != -1) {
					System.out.print("입금할 금액 : ");
					int money = scan.nextInt();
					moneyList[log] += money;
					System.out.println("잔액 : " + moneyList[log]);
				}
				else {
					System.out.println("로그인후 이용하세요.");
				}
			}
			else if(sel == 6) {
				if(log != -1) {
					System.out.print("이체할 계좌 : ");
					int acc = scan.nextInt();
					System.out.print("이체할 금액 : ");
					int money = scan.nextInt();
					int index = 0;
					if(moneyList[log] < money) {
						System.out.println("잔액이 부족합니다.");
					}
					else {
						moneyList[log] -= money;
						for(int i=0; i<count; i++) {
							if(acc == idList[i]) {
								moneyList[i] += money;
							}
						}
						System.out.println("이체완료");
						System.out.println("잔액 : " + moneyList[log]);
					}
				}
			}
			else if(sel == 7) {
				if(log != -1) {
					System.out.println("잔액 : " + moneyList[log]);
				}
			}
			else if(sel == 8) {
				System.out.println(Arrays.toString(idList));
				System.out.println(Arrays.toString(pwList));
				System.out.println(Arrays.toString(moneyList));
			}
			else if(sel == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}
		
	}

}