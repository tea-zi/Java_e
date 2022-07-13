package E7_배열7_기본이론;

public class 배열7_기본이론1_배열의주소개념1 {
	public static void main(String[] args) {

		int[] arr = { 87, 100, 24, 11, 79 };

		int[] temp = arr;
		temp[1] = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print(temp[i] + " ");
		}

		System.out.println();
		System.out.println(arr);
		System.out.println(temp);

		
		
		// arr1과 arr2 의 값이 같다를 표현해보세요.
		// 아래와 같이 일일히 검사 해야한다.
		int arr1[] = {10,20,30,40};
		int arr2[] = {10,20,30,40};
		
		if(arr1 == arr2) {
			System.out.println("같다.1");
		}else{
			System.out.println("다르다.1");
		}
		
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				count += 1;
			} else {
				break;
			}
		}
		if (count == arr1.length) {
			System.out.println("같다.2");
		} else {
			System.out.println("다르다.2");
		}

	}

}