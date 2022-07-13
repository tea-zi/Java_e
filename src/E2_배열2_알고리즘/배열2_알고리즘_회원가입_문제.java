package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_알고리즘_회원가입_문제 {
	/*
	 * [회원가입] 동영상으로 설명
	 */
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);	
		int[] arr = {0, 0, 0, 0, 0};	
		int count = 0;
		int n = 0;
		while(true) {
			System.out.println("===[회원가입]===");
			System.out.println(Arrays.toString(arr));
			System.out.println("1.추가");
			System.out.println("2.수정");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			System.out.println("5.삽입");
			int sel = scan.nextInt();
			if(sel == 1) {
				int num = 0;
				if(count == 5) {
					System.out.println("추가할수없습니다.");
				}
				else {
					System.out.print("값 입력 : ");
					num = scan.nextInt();
					n = 0;
					for(int i=0; i<arr.length; i++) {
						if(num == arr[i]) {
							System.out.println("동일한 값이 있습니다.");
							n = 1;
						}
					}
				}
				if(n != 1) {
					arr[count] = num;
					count++;
				}

			}else if(sel == 2) {
				System.out.print("수정할값 입력 : ");
				int num = scan.nextInt();
				int temp = 0;
				int num2 = 0;
				int c = 0;
				n = 0;
				for(int i=0; i<arr.length; i++) {
					if(num == arr[i]) {
						temp = i;
						c = 1;
						System.out.print("수정값 입력 : ");
						num2 = scan.nextInt();
						for(int j=0; j<arr.length; j++) {
							if(num2 == arr[j]) {
								System.out.println("동일한 값이 있습니다.");
								n = 1;
							}
						}
					}
				}
				if(n != 1 && c == 1) {
					arr[temp] = num2;
				}
				if(c != 1) {
					System.out.println("값을 찾을 수 없습니다.");
				}
			}else if(sel == 3) {
				System.out.print("인덱스 입력 : ");
				int index = scan.nextInt();
				if(index>0 || index>count) {
					System.out.println("시스템 오류");
				}
				for(int i=index; i<arr.length-1; i++) {
					arr[i] = arr[i+1];
				}
				arr[arr.length-1] = 0;
				count -=1;
			}
			else if(sel == 4) {
				System.out.print("삭제할값 입력 : ");
				int num = scan.nextInt();
				for(int i=0; i<arr.length; i++) {
					if(num == arr[i]) {
						for(int j=i; j<arr.length-1; j++) {
							arr[j] = arr[j+1];
						}
						arr[arr.length-1] = 0;
					}
					else {
						System.out.println("값을 찾을수 없습니다.");
					}
				}
				count -=1;
			}else if(sel == 5) {
				if(count == 5) {
					System.out.println("추가할수없습니다.");
					continue;
				}
				System.out.print("삽입할 인덱스 입력 : ");
				int index = scan.nextInt();
				if(index>0 || index>count) {
					System.out.println("시스템 오류");
				}
				int c = 0;
				System.out.print("삽입할 값 입력 : ");
				int num = scan.nextInt();
				for(int i=0; i<arr.length; i++) {
					if(num == arr[i]) {
						System.out.println("동일한 값이 있습니다.");
						c = 1;
					}

				}
				if(c != 1) {
					for(int i=arr.length-1; i>=index; i--) {
						arr[i] = arr[i-1];
					}
					arr[index] = num;
				}
			}
		}
		
		
	}
}