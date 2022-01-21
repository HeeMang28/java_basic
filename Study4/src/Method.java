
public class Method {
	// method는 자주 사용할 코드를 특정한 이름으로 붙여둔 것입니다.
	// method 내부에는 불완전한 코드가 들어올 수 있습니다.
	// method는 이 불완전한 코드를 완성시킬 자료를 요청할 수 있습니다.
	// method는 실행 결과물을 약속해야 사용할 수 있고,
	// 실행 결과물이 있다면, return문을 이용해 약속된 실행결과물을
	// 호출 위치로 보내줍니다.
	// method는 main외부에 작성합니다.
	
	public static void add(Double a, int b) {
		// void는 결과물 없음을 의미 합니다.
		// add라는 이름은 main내부에서 호출해야만 합니다.
		System.out.println("a 는 " + a + ", b 는 " + b + "입니다.");
	} // 아직은 a 와 b를 몰라 불완정한 코드이다.
	
	public static void main(String[] args) {
		
		add(0.5, 3);
		
		
	}
}
