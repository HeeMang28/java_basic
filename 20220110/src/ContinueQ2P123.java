
public class ContinueQ2P123 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 수학(math) 평균점수를 내주시되, 합격자 평균만 내주세요.
		// 합격점수는 60점 이상입니다.
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		// 1. 종점 변수와 합격자수 변수 생성
		int mathTotal = 0;
		int mathCount = 0;
		int engTotal = 0;
		int engCount = 0;
		int comTotal = 0;
		int comCount = 0;
		// 2. 반복문 실행
		for(int score : math) { 
		   if (score < 60) {
			continue;
		   } else {
			mathCount += 1;
			mathTotal += score;
			}
		}
		for(int score : eng) { 
			   if (score < 60) {
				continue;
			   } else {
				engCount += 1;
				engTotal += score;
	}
			}for(int score : com) { 
				   if (score < 60) {
						continue;
					   } else {
						comCount += 1;
						comTotal += score;
		}
		}
		System.out.println("수학 합격자 평균 : " + (mathTotal / mathCount));
		System.out.println("영어 합격자 평균 : " + (engTotal / engCount));
		System.out.println("컴퓨터 합격자 평균 : " + (comTotal / comCount));

	}

}
