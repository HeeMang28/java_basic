
public class StudyBinary01 {

	public static void main(String[] args) {
		// 산술연산자는 우리가 잘 알고 있는 사칙연산 등을
		// 활용하기 위한 연산자이며, 연산 우선순위도 그대로 계승합니다.
		// 단, %연산자의 우선순위는 *, /와 동일합니다.
		
		System.out.println(2 + 3);
		System.out.println(17 - 10);
		System.out.println(5 * 3);
		System.out.println(8 / 4);
		System.out.println(10 % 4);


		// 컴퓨터는 비교연산자를 명제로 인식하며
		// 명제의 참(true), 거짓(false)을 판단해 결과로 보여줍니다.
		System.out.println(1 > 7); // 1이 7보다 큽니까? : false 반환
		System.out.println(100 <= 100); // 100가 100보다 작거나 같습니까? : true 반환
				
		System.out.println("a" != "b"); // "a"와 "b"가 다른가? : true 반환
		System.out.println("a" == "a"); // "a"와 "a"가 같은가? : true 반환
		System.out.println(7 != 7.0); // 7.0과 7.0이 다른가? : false 반환
	}

}
