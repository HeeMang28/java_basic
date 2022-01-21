
public class StudyUnary02 {

	public static void main(String[] args) {
		// 단항 연산자로 쓰인 +,-는 양수 음수 표기에 사용된다
				System.out.println(+27); //양수 27, 실제로는 27로 표기한다.
				System.out.println(-27); //-27로 표기
				
		// 비트 반전 연산자는 비트단위 값을 0 -> 1로, 1 -> 0으로 바꿔준다
				System.out.println(~1); 
		// 비트 반전 연산자는 이진수를 좀 더 공부하고 할 예정
				
		// 논리 반전 연산자 !는 true -> false, false -> true로 바꿔준다
				System.out.println(!false);
		// !false를 사용해서 ture로 바뀌었다. 
				
		// 자료형을 바꿔주는 cast연산자 ((자료형)자료)
				System.out.println((double)21);
				System.out.println((int)21.21);
				// ((double)21) 21에 double을 앞에 붙여 21.0이 되었고
				// 21.21에 (int)를 붙여 21이 되었다.

	}

}
