package E4_�迭4_�˰���;

public class �迭4_�˰���_�縰���2 {
	/*	  
	    [�縲���]	    
	     -�縲����̶� �տ��� �����ص� �ڿ��������ص� �Ȱ��� ���̴�.	    
	  	�� �迭���� 0�̳� 1�� ������ ������ ������ �丰������� ����Ѵ�.
		[��] 1�� 0�� ���� �����ϸ� 3,2,2,3 �̹Ƿ� �縰����̴�.
	 */
	public static void main(String[] args) {
		int arr[] = {1,3,0,0,2,1,2,3,0};
		int index = 0;
		int index2 = arr.length-1;
		boolean check = false;
		while(true) {
			if(index > arr.length-1 && index2 < 0) {
				break;
			}
			if(arr[index] != 0 && arr[index2] != 0 && arr[index] != 1 && arr[index2] != 1) {
				if(arr[index] == arr[index2]) {
					System.out.println(arr[index] + " , " + arr[index2]);
					index++;
					index2--;
				}
				else {
					check = true;
					break;
				}
			}
			else {
				if(arr[index] == 0 || arr[index] == 1 && index<arr.length) {
					index++;
				}
				if(arr[index2] == 0 || arr[index2] == 1 && index2>=0) {
					index2--;
				}
			}
		}
		if(check == true) {
			System.out.println("�ƴϴ�");
		}
		else {
			System.out.println("�´�");
		}
	}
}