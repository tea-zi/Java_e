package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�4_�л�����4 {
	/*
	 * 	numberList = {1001, 1002, 1003, 1004, 1005};
		scoreList  = {  87,   11,   45,   98,   23};
	 *  [����] 1���л��� �й��� ���� ����Ѵ�.
	 *  [����] 1004��(98��)
	 */
	public static void main(String[] args) {
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		int max = 0;
		int num = 0;
		for(int i=0; i<5; i++) {
			if(max <  scoreList[i]) {
				max = scoreList[i];
				num = numberList[i];
			}
		}
		System.out.println("1�� �л�");
		System.out.println("�й� : " + num + "  ���� : " + max);
	}

}