package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�3_�⺻����1 {
	/*
	 * 
		 [����1] 10���� 50���� array �迭�� ������ �迭���� ��簪�� ����Ѵ�.
		 [��] 10 20 30 40 50
	
		 [����2] array �迭���� ��簪�� ����Ѵ�.
		 [��] 150
	 */
	public static void main(String[] args) {

		int[] array = new int[5];		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			array[i] = (i+1)*10;
		}
		for(int i=0; i<5; i++) {
			sum += array[i];
			System.out.println(array[i] + " " + sum);
		}
	}

}