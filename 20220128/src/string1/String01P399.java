package string1;

public class String01P399 {

	public static void main(String[] args) {
		// String 클래스의 주요 메서드 확인
		// 1. charAt();
		String greeting = "Hello Java";
		char get = greeting.charAt(6);
		System.out.println(get);
		
		// 자바는 문자열 인덱싱을 허용하지 않습니다.
		// System.out.println(greeting[6]); <- 파이썬 같은 경우는 가능하다.
		// 하지만 자바에서는 안된다.

	}

}
