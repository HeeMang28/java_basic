package overloading;

public class Main01 {

	public static void main(String[] args) {
		// 1. Calculator를 생선해주세요.
		Calculator c1 = new Calculator();
		// 2. plus(int)를 호출 해보겠습니다.
		c1.plus(4);
		c1.plus(1, 3);
		
		c1.plus(0.5);
		c1.plus("박재현");
		
		
	}

}
