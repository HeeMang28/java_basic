import java.util.Arrays;

public class StudyEngancedFor {

	public static void main(String[] args) {
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 넣습니다.
		// 이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼입니다.

		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 위 3개의 변수명으로 배열을 만들어 자료를 담아주신 다음
		// 과목별 평균점수를 enhanced for문을 이용해 구한 다음
		// 콘솔창에 출력해주세요.		
		int math[] = {96, 23, 52, 82, 72, 31, 58};
		
		int []eng = {62, 42, 68, 31, 80, 77, 45};
		int com[] = {10, 28, 39, 74, 65, 90, 98};
		int mathTotal = 0;
		int engTotal = 0;
		int comTotal = 0;
		for(int a : math) {
	        mathTotal += a;
			
		} for(int b : eng) {
			engTotal += b;
		} for(int c : com) {
			comTotal += c;
		} System.out.println("다음 학생들의 평균점수는");
		System.out.println("수학의 평균점수 : " + mathTotal/ math.length);
		System.out.println("영어의 평균점수 : " + engTotal/ eng.length);
		System.out.println("영어의 평균점수 : " + comTotal/ com.length);
		}
		
	}

