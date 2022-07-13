package E2_배열2_기본이론;


public class 배열2_기본이론2_길이 {
	/*

	 *  [1] arr.length  ==> 배열의 개수를 나타낸다.
	 */
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		for(int i = 0; i < 4; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("------------");
				
		System.out.println("배열의 개수 = " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("------------");
		
		
		
	}

}