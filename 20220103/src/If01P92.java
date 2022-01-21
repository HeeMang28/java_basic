
public class If01P92 {

	public static void main(String[] args) {
		// 아래와 같이 작성하며
		// if(조건식) {
		//  실행할구문1;
		//  실행할구문2;
		//    ......
		// }
		// 조건식이 참인경우는 {  } 사이의 실행할구문 세트를 전부 실행하지만
		// 조건식이 거짓인 경우는 무시하고 넘어갑니다.
		int a = 5;
		
		if(a < 6) {
			// if문 중괄호 내부 영역에 있어서 조건식의 영향을 받는 구문
			System.out.println("a는 6보다 작습니다.");
		}
		// if문의 중괄호 영역이 종료된 다음 작성하는 구문은
		// if문의 참 거짓과는 상관없이 실행됩니다.
		System.out.println("무조건 실행됩니다.");

	}

}
