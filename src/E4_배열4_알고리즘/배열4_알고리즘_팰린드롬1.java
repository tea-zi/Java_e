package E4_배열4_알고리즘;
public class 배열4_알고리즘_팰린드롬1 {
	public static void main(String[] args) {
		int arr1[] = {1,5,4,5,3,2,2,3,5,4,5,1};
		int arr2[] = {1,5,4,5,3,2,3,5,4,5,1};
		//위 배열들이 각각 팰린드롬인지 아닌지 출력하시요.
		//팰린드롬이란? 
		// 앞에서부터 읽을 때와
		// 뒤에서부터 읽을 때 똑같은 숫자가 나오면 팰린드롬이다
		// 예) 2112
		// 예) 12321
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
			System.out.println("팰린드롬이다.");
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
			System.out.println("아니다.");
		}else {
			System.out.println("맞다.");
		}
		// 팰린드롬의 경우 아닌 경우를 찾는것이 빠르다.
	}
}