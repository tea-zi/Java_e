package E5_배열5_프로젝트;

public class 배열5_프로젝트_문자열연습 {
	public static void main(String[] args) {
		String[][] data = {
				{"1001" ,"김철수" , "10"},
				{"1002" ,"이만수" , "60"},
				{"1003" ,"김성수" , "90"},
				{"1004" ,"오지호" , "55"},
		};
		for(int i = 0; i < data.length; i++) {			
			System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2]);			
		}	
		System.out.println("---------------------------------------------------");
		System.out.println("점수가 60점이상인 [학생번호 이름 점수] 출력 : ");
		
		for(int i = 0; i < data.length; i++) {
			int score =  Integer.parseInt(data[i][2]);
			if(score >= 60) {
				System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2]);
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("시험문제중 1문제가 전부 정답처리되었다. 학생들 점수를 5점씩 인상하시오");
		
		for(int i = 0; i < data.length; i++) {
			int score = Integer.parseInt(data[i][2]);
			score += 5;
			data[i][2] = score + "";
		}		
		for(int i = 0; i < data.length; i++) {			
			System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2]);			
		}		
	}
}