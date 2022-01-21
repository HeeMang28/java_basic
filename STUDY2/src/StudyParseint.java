
public class StudyParseint {

	public static void main(String[] args) {
		// 정수자료는 문자로 바꾸고 싶을때
		// "문자열" + 정수자료를 하면 자동으로 문자로 변경됩니다.
		// 그러나 문자 전체가 정수로만 이루어진 문자열을 
		// 정수로 치환하기 위해서는 별도의 문법을 사용합니다.
		String str = "1995"; // 문자열 "1995"
		int year = Integer.parseInt(str); 
		// Interger.parseInt(문자열) 을 집어넣으면 정수로 교환해줌
		System.out.println(year + 27);
		// 정수 + 27 = 2022
		System.out.println(str + 27);
		// 문자열 + 27 = 문자열27
	}

}
