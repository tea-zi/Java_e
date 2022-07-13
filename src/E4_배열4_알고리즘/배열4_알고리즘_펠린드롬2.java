package E4_배열4_알고리즘;

public class 배열4_알고리즘_펠린드롬2 {
	/*	  
	    [펠림드롬]	    
	     -펠림드롬이란 앞에서 시작해도 뒤에서시작해도 똑같은 값이다.	    
	  	위 배열에서 0이나 1을 제외한 나머지 값들이 페린드롬인지 출력한다.
		[예] 1과 0을 전부 제외하면 3,2,2,3 이므로 펠린드롬이다.
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
			System.out.println("아니다");
		}
		else {
			System.out.println("맞다");
		}
	}
}