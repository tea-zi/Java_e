package E5_배열5_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열5_알고리즘_관리비 {
	/*	
		 문제 1) 각층별 관리비 합 출력
		 정답 1) 4400, 7100, 5400		
		 문제 2) 호를 입력하면 관리비 출력
		 정답 2) 입력 : 202	관리비 출력 : 2000	
		 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)		
		 문제 4) 호 2개를 입력하면 관리비 교체 (101 , 102) ==>  (2100, 1000)		
		 문제 5) 관리비 많이 나온순서대로 관리비와 호수 출력 (정렬)
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		int sum[] = new int[pay.length];
		for(int i=0; i<pay.length; i++) {
			for(int j=0; j<pay[i].length; j++) {
				sum[i] += pay[i][j];
			}
		}
		System.out.println(Arrays.toString(sum));
		
		System.out.print("호수 입력 : ");
		int ho = scan.nextInt();
		for(int i=0; i<pay.length; i++) {
			for(int j=0; j<pay[i].length; j++) {
				if(ho == apt[i][j]) {
					System.out.println("관리비 : " + pay[i][j]);
				}
			}
		}
		
		int max = 0;
		int min = pay[0][0];
		int a = 0;
		int b = 0;
		for(int i=0; i<pay.length; i++) {
			for(int j=0; j<pay[i].length; j++) {
				if(max < pay[i][j]) {
					max = pay[i][j];
					a = apt[i][j];
				}
				if(min > pay[i][j]) {
					min = pay[i][j];
					b = apt[i][j];
				}
			}
		}
		System.out.println("관리비가 많이 나옴 집 : " + a);
		System.out.println("관리비가 적게 나옴 집 : " + b);
		
		int ho1 = scan.nextInt();
		int ho2 = scan.nextInt();
		int temp1 = 0;
		int temp2 = 0;
		for(int i=0; i<pay.length; i++) {
			for(int j=0; j<pay[i].length; j++) {
				if(ho1 == apt[i][j]) {
					temp1 = pay[i][j];
				}
				if(ho2 == apt[i][j]) {
					temp2 = pay[i][j];
				}
			}
		}
		for(int i=0; i<pay.length; i++) {
			for(int j=0; j<pay[i].length; j++) {
				if(ho1 == apt[i][j]) {
					pay[i][j] = temp2;
				}
				if(ho2 == apt[i][j]) {
					pay[i][j] = temp1;
				}
			}
		}
		for(int i=0; i<pay.length; i++) {
			System.out.println(Arrays.toString(pay[i]));
		}
		
		int apta[] = new int[9];
		int paya[] = new int[9];
		int k = 0;
		for(int i=0; i<pay.length; i++) {
			for(int j=0; j<pay.length; j++) {
				apta[k] = apt[i][j];
				paya[k] = pay[i][j];
				k++;
			}
		}
		System.out.println(Arrays.toString(apta));
		System.out.println(Arrays.toString(paya));
		for(int i=0; i<apta.length; i++) {
			for(int j=0; j<i; j++) {
				 if(paya[i] < paya[j]) {
					 int temp = paya[i];
					 paya[i] = paya[j];
					 paya[j] = temp;
					 temp = apta[i];
					 apta[i] = apta[j];
					 apta[j] = temp;
				 }
			}
		}
		System.out.println(Arrays.toString(apta));
		System.out.println(Arrays.toString(paya));
	}
}