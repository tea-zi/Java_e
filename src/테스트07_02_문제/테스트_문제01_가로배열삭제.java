package �׽�Ʈ07_02_����;

import java.util.Arrays;

/*
	[����] 
	�Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
	��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸�, 
	�׹�ȣ��  ���� �����ϰ� d�迭�� �����Ѵ�.
	[��]  
		c[] = { 1001, 40, 1002, 65, 1003, 70 };
		�Է� : 1002 
		c[] = {1001, 40, 1003, 70}; 
 */
public class �׽�Ʈ_����01_���ι迭���� {
	public static void main(String[] args) {
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = new int[c.length - 2];
		int num = 1002;
		int index = 0;
		for (int i = 0; i < c.length; i += 2) {
			if (c[i] != num) {
				d[index] = c[i];
				index++;
				d[index] = c[i + 1];
				index++;
			}
		}
		System.out.println(Arrays.toString(d));
	}
}