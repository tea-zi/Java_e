package E3_�迭3_�˰���;

import java.util.Arrays;
import java.util.Random;

public class �迭3_�˰���_�ζ�_���� {
	/*
	 * [����]
	 * 
	 	[�ζ�] 
		1~45������ ������ 6 ���� lotto1 �� �����ҷ��� �Ѵ�.
		[����] �ߺ��Ǵ¼��ڴ� ������Ѵ�. 
	*/
	public static void main(String[] args) {
		Random ran = new Random();
		int lotto1[] = new int[6];
		
		for(int i=0; i<6;) {
			int r = ran.nextInt(45)+1;
			boolean check = false;
			for(int j=0; j<i; j++) {
				if(lotto1[j] == r) {
					check = true;
					break;
				}
			}
			if(check == false) {
				lotto1[i] = r;
				i++;
			}
		}
		
		
		System.out.println(Arrays.toString(lotto1));
	}
}