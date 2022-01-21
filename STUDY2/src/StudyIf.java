
public class StudyIf {

	public static void main(String[] args) {
		// 조건식이 참인경우는 {  } 사이의 실행할구문 세트를 전부 실행하지만
		// 조건식이 거짓인 경우는 무시하고 넘어갑니다.
		// if문의 중괄호 영역이 종료된 다음 작성하는 구문은
		// if문의 참 거짓과는 상관없이 실행됩니다.
		
		int a = 7;
		if(a < 8) {
			// if문 중괄호 내부 영역에 있어서 조건식의 영향을 받는 구문
			System.out.println("a는 8보다 작습니다.");
		} System.out.println("참 거짓과는 상관없이 실행");

	}

}
