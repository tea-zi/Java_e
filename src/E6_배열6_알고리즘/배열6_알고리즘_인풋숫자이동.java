package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_��ǲ�����̵� {
	/*
		 [�����̵�����]	
		 move = {1,0,0,0,8,0,0,0,1};	 
		 [1] move ���� 8�� �÷��̾��̴�
		 [2] move ���� 0�� �̵��Ҽ��ִ� ���̴�.
		 [3] move ���� 1�� �̵��Ҽ����� ���̴�. 

		 input �迭�� ������ ���������� �����ϰ�,�������Ͻÿ�.
		 input�ǰ��� 1�� �����̵� , 2�� �������̵��̴�. 
		 ������ �̵��ϸ�, "�̵��Ҽ������ϴ�" ��� 		
		 ����=> {1,0,0,0,8,0,0,0,1};
		 1 ==> {1,0,0,8,0,0,0,0,1};
		 1 ==> {1,0,8,0,0,0,0,0,1};
		 1 ==> {1,8,0,0,0,0,0,0,1};
		 1 ==> "�̵��Ҽ������ϴ�"
		 2 ==> {1,0,8,0,0,0,0,0,1};
		 2 ==> {1,0,0,8,0,0,0,0,1};
		 2 ==> {1,0,0,0,8,0,0,0,1};
	 */
	public static void main(String[] args) {
		
		int move[] = {1,0,0,0,8,0,0,0,1};		
		int input[] = {1,1,1,1,2,2,2};
		int index = 0;
		for(int i=0; i<move.length; i++) {
			if(move[i] == 8) {
				index = i;
			}
		}
		System.out.print("����=> ");
		System.out.println(Arrays.toString(move));
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i] + " ==> ");
			if(input[i] == 1) {
				move[index] = 0;
				index--;
				if(move[index] == 1) {
					System.out.println("\"�̵��Ҽ������ϴ�.\"");
					index++;
					move[index] = 8;
				}
				else {
					move[index] = 8;
					System.out.println(Arrays.toString(move));
				}
			}
			else {
				move[index] = 0;
				index++;
				if(move[index] == 1) {
					System.out.println("\"�̵��Ҽ������ϴ�.\"");
					index--;
				}
				else {
					move[index] = 8;
					System.out.println(Arrays.toString(move));
				}
			}
		}
	}
}