package E4_�迭4_�˰���;
public class �迭4_�˰���_�Ӹ����1 {
	public static void main(String[] args) {
		int arr1[] = {1,5,4,5,3,2,2,3,5,4,5,1};
		int arr2[] = {1,5,4,5,3,2,3,5,4,5,1};
		//�� �迭���� ���� �Ӹ�������� �ƴ��� ����Ͻÿ�.
		//�Ӹ�����̶�? 
		// �տ������� ���� ����
		// �ڿ������� ���� �� �Ȱ��� ���ڰ� ������ �Ӹ�����̴�
		// ��) 2112
		// ��) 12321
		int count = 0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=arr1.length-1; j>=0; j--) {
				if(arr1[i] == arr1[j]) {
					count++;
					System.out.println(count);
					break;
				}
			}
		}
		if(count == arr1.length) {
			System.out.println("�Ӹ�����̴�.");
		}
		
		int b = arr1.length-1;
		boolean check = false;
		for(int i = 0; i < arr1.length/2; i++) {
			if(arr1[i] != arr1[b]) {
				check = true;
				break;
			}
			b -= 1;
		}
		if(check == true) {
			System.out.println("�ƴϴ�.");
		}else {
			System.out.println("�´�.");
		}
		// �Ӹ������ ��� �ƴ� ��츦 ã�°��� ������.
	}
}