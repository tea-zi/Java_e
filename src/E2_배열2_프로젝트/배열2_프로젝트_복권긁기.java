package E2_�迭2_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭2_������Ʈ_���Ǳܱ� {
	/*
	 *  [���Ǳܱ�]
	  
	    �������� ���ǹ迭�� 1 �Ǵ� 7 �� �����Ѵ�. 
	    ȭ���� { * * * * * * * } �̷��� ����Ѵ�.
		�ε��� 3���� �����ְ�, 
		�ε��� 3���� ���� ���� 7�̸�  ��÷�̴�.
		
	    [����1] 
	    	�ݵ�� 7�� 3���̻� �־�� �Ѵ�.	
			[��] 1,1,7,7,1,7,1
		
		[����2] 
			�ѹ� �� �ε����� �ǰ�������. 		
			[��] 2,2,2
			
	 */
	
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int ����[] = new int[7];
		int c1 = 0;
		int c7 = 0;
		for(int i=0; i<����.length;) {
			int r = ran.nextInt(2);
			if(r == 0 && c1 <=3) {
				����[i] = 1;
				i++;
				c1++;
			}
			else if(r == 1){
				����[i] = 7;
				i++;
			}
		}
		System.out.println(Arrays.toString(����));
		boolean check[] = new boolean[7];
		int count = 0;
		while(true) {
			for(int i=0; i<����.length; i++) {
				if(check[i] == false) {
					System.out.print(" * ");
				}
				else {
					System.out.print(����[i]);
				}
			}
			System.out.println();
			
			if(count == 3) {
				break;
			}
			
			System.out.print("�ε��� �Է� : ");
			int sel = scan.nextInt();
			if(sel < 0 || sel > 6) {
				System.out.println("����");
			}
			if(check[sel] == false) {
				count++;
				check[sel] = true;
			}
			else if(check[sel] == true) {
				System.out.println("�̹� ������ �ε����Դϴ�.");
			}	
		}
		
		int win = 0;
		for(int i=0; i<����.length; i++) {
			if(check[i] == true && ����[i] == 7) {
				win++;
			}
		}
		if(win == 3) {
			System.out.println("��÷");
		}
		else {
			System.out.println("��");
		}
	}
}