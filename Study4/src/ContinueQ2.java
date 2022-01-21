
public class ContinueQ2 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 수학(math) 평균점수를 내주시되, 합격자 평균만 내주세요.
		// 합격점수는 60점 이상입니다.
		
		int math[] = {96, 23, 52, 82, 72, 31, 58};
		int eng[] = {62, 42, 68, 31, 80, 77, 45};
		int com[] = {10, 28, 39, 74, 65, 90, 98};
		int mathTotal = 0;
		int mathcount = 0;
		int engTotal  = 0;
		int engcount  = 0;
		int comTotal  = 0;
		int comcount  = 0;
		
		for(int score : math) {
			if(score < 60) {
				continue;
		} else {
			mathcount += 1;
			mathTotal += score;
		}

	} 

	for(int score : eng) {
		if(score < 60) {
			continue;
		} else {
			engcount += 1;
			engTotal += score;
			
		}

	} 
	for(int score : com) {
		if( score < 60) {
			continue;
		} else {
			comcount += 1;
			comTotal += score;
		} 
		
	} System.out.println("수학 합격자 평균은 " + mathTotal/mathcount  );
	System.out.println("영어 합격자 평균은 " + engTotal/engcount  );
	System.out.println("컴터 합격자 평균은 " + comTotal/comcount  );
	   
	   
}
}