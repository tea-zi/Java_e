package E3_�迭3_�˰���;

public class �迭3_�˰���_����ã��1 {
	/*
	 * 1) seatList �� ��ȭ�� 7�ڸ��� ��Ÿ����. 
	 * 2) seatList �� ������ ��ȭ�� ������ ȸ����ȣ�� ��Ÿ����. 
	 * 3) find�� ������ �˻��ϰ����ϴ� ȸ����ȣ���̴�.
	 * 4) find �� ���� ��ȭ������ ã�� �ڸ��� ���������. ��, ���¹�ȣ�� "x" ���
	 * 	- ��) [1] find : 1004 �� �����Ƿ� "x" ��� 
	 *  - ��) [2] find : 1003 �� 0 , 1
	 *  - ��) [3] find : 1001 �� 6 
	 *  - ��) [4] find : 1005 �� �����Ƿ� "x" ���  
	 */
	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int find[] = {1004,1003,1001,1005};
		for(int i=0; i<find.length; i++) {
			int count =0;
			System.out.print("find : " + find[i] + "��");
			for(int j=0; j<seatList.length; j++ ) {
				if(find[i] == seatList[j]) {
					System.out.print(" " + j);
				}
				else {
					count++;
					if(count == 7) {
						System.out.print(" �����Ƿ� \"x\" ���");
					}
				}
			}
			System.out.println();
		}
		/*
		 * for(int i=0; i<find.length; i++) {
			boolean check = false;
			System.out.print("find : " + find[i] + "��");
			for(int j=0; j<seatList.length; j++ ) {
				if(find[i] == seatList[j]) {
					System.out.print(" " + j);
					check = true;
				}
			}
			if(check == false){
				System.out.print(" �����Ƿ� \"x\" ���");
			}
			System.out.println();
		}
		 */
	}
}