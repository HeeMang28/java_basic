import java.util.Scanner;

public class StudyElseIf {

	public static void main(String[] args) {
		// else if는 추가적인 조건을 달 때 사용합니다.
		// if문 다음에 작성하며, else문 이전에 작성합니다.
		// else if는 else와는 달리 조건식을 기입해야 합니다.
		// else if문은 몇 개라도 작성할 수 있습니다.
		// if~else if로 조건식을 여러개 달 경우 위쪽 조건식이 우선순위가 높습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		
		int su = scan.nextInt();
		
		if (su > 0 ) { 
			System.out.println("양수입니다.");
		} else if(su == 0) { 
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
	}

}
