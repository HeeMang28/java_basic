
public class StudyWhile {

	public static void main(String[] args) {
		// while문은 실행여부를 조건식 비교를 통해서만 결정합니다.
		// 한 번 실행하기로 결정되면 모든 타겟 실행문을 실행합니다.
		// 실행이 끝나면 다시 while 구문으로 복귀합니다.
		// 추가 비교를 통해 실행/탈출 여부가 결정됩니다.
		// while문의 조건식이 어떻게 해석해도 
		// 무조건 true로 판단되는 조건식을 넣으면
		// 절대 끝나지 않는 무한루프문이 됩니다.
		// 이 경우 강제탈출구문인 break를 써야만 종료할 수 있습니다.
		int a = 0;
		while (a < 7) {
			a += 1;
			System.out.println(a + "입니다.");
		}

	}

}
