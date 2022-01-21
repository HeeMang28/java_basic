
public class StudyAssignment {

	public static void main(String[] args) {
		// 대입연산자란 특정 변수 값을 연산자 우측에 해당하는 값을 이용해
		// 연산한 결과값으로 계산해 저장하는 기능을 수행합니다.
		// 단순 연산자인 =이 있으며,
		// 복합대입연산자로 +=, -=, /=, *=, %= 등이 있습니다.
		// 대입 연산자를 사용하는 경우 코드 실행방향이 오른쪽에서 왼쪽입니다.
		int a = 7;
		System.out.println(a);
		a += 7;//a = a + 7;// a를 7만큼 증가시켜 저장하는 코드
		System.out.println(a);
		a -= 7;//a = a - 7;// a를 7만큼 감소시켜 저장하는 코드
		System.out.println(a);
		a *= 7;//a = a * 7;// a를 7배 증가시켜 저장하는 코드
		System.out.println(a);
		a /= 7;//a = a / 7;// a를 7(정수)로 나눠서 저장하는 코드
		System.out.println(a);
		a %= 7;//a = a % 7; // a를 7 나머지 연산해 저장하는 코드
		System.out.println(a);
	}

}
