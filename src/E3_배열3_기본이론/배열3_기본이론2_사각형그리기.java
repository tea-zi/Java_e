package E3_�迭3_�⺻�̷�;
public class �迭3_�⺻�̷�2_�簢���׸��� {
	
	/*
	 * [�簢���׸���]
	 *  
	 *  �Ʒ��Ͱ��� �簢���� ����Ͻÿ�.
	 * 
	 * ###
	 * ###
	 * ###
	 */
	
	public static void main(String[] args) {
	
		for(int i=0; i<9; i++) {
			System.out.print("#");
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		System.out.println();

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}
		
}