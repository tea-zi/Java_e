package E2_�迭2_�˰���;
public class �迭2_�˰���_1�� {
	/*
	 * [����]
	 * 
	 * [1��]
	 *   �Ʒ� �����ʹ� �л���ȣ1��, ����2���� �Ѽ�Ʈ�̴�. 		
		 ��ȣ�� 1001���ͽ����̰� , ������ 0~100 �̴�. 
		 ��) 1001 , 20, 30 ==> 1001�� 1������ 20��, 2������ 30��
		 		 
		
		 1���� ��ȣ ����Ѵ�. 
		 ������ �������� �����ΰ���Ѵ�. 
	 */
	public static void main(String[] args) {
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		int sum = 0;
		int max = 0;
		for(int i=0; i<arr.length; i+=3) {
			if(sum < arr[i+1]+arr[i+2]) {
				sum = arr[i+1]+arr[i+2];
				max = arr[i];
			}
		}
		System.out.println("1�� �л� : " + max );
		for(int i=0; i<arr.length; i+=3) {
			if(max == arr[i]) {
				System.out.println("���� 1������ : "+arr[i+1]+"  2������ : "+arr[i+2]);
			}
		}
	}
}