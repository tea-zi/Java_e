package E3_�迭3_�˰���;

import java.util.Arrays;

public class �迭3_�˰���_��ǲ���� {
	/*
	 * [��ǲ ����]
	    -�Ʒ� 3���� �迭�� [1.��ǰ�̸�] [2.����] [3.��ǰ����] ����Ʈ����̴� .
		[��] �ᱹ ���� ���� ������� 3�� , ���ڱ� 1�� , ���� 1�� �ִ�.	
		 input �迭�� ���� �ֹ��� ���¼����̴�.
		 �ֹ��� ���� ������ countList�迭�� ���� 1���ҽ�Ų��.
		 �Ѹ����� ����غ�����.
		 [��] ù��° 1 ==> ���ڱ��� ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
		 [��] �ι�° 2 ==> ������ ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
		 [��] ����° 2 ==> ������ ������ �̹� �ι�°���� �����ؼ� 0�̵ǹǷ� �ǸźҰ�.
		 [��] .... �������� ����غ���.
		 �ֹ��� ��  ����� 2�� , ���ڱ� 3�� , ���� 3�� ��������,
		 �������� �׺��� �����ϱ� ������,
		 ���� �Ǹ��� ǰ����  ����� 2�� , ���ڱ� 1�� , ���� 1�� �̴�.		
	 */
	public static void main(String[] args) {
		String [] nameList = {"�����" , "���ڱ�" , "����"};
		int [] priceList = {1000, 2100, 3300};
		int [] countList = {3,1,1};	
		int [] input = {1,2,2,0,0,2,1,1};		
		int[] sel = {0, 0, 0};
		for(int i=0; i<input.length; i++) {
			if(countList[input[i]] > 0) {
				countList[input[i]] -= 1;
				sel[input[i]] += 1;
			}
		}
		System.out.println(Arrays.toString(sel));
		
		int chd = 0;
		for(int i=0; i<sel.length; i++) {
			chd += sel[i]*priceList[i];
		}
		System.out.println("�Ѹ��� : " + chd);
	}

}