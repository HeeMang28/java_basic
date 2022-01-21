
public class MethodQ2 {
	
	public static int mul(int a, int b, int c) {
		return a * b * c;
	}
	
	public static void Info() {
		System.out.println("안녕하세요.");
		System.out.println("자바 메서드 학습중입니다.");
		System.out.println("1번의 호출로 3줄을 콘솔에 작성합니다.");
	}
	
	// mul 메서드를 선언해주세요.
	// 이 메서드는 여러분들이 임의로 이름붙인 정수 3개를 입력받아
	// 3개를 곱한 값을 return해줍니다.
	
	// info 메서드를 선언해주세요.
	// 이 메서드는 내부에서
	// "안녕하세요"
	// "자바 메서드 학습중입니다."
	// 1번의 호출로 3줄을 콘솔에 작성합니다."
	// 라는 문장만 출력하고 return은 없습니다.

	public static void main(String[] args) {
		int d = mul(3, 4, 5);
		
		System.out.println(d);
		Info();
		for(int i = 0; i < 3; ++i) {
			Info();
		}

		

	}

}
