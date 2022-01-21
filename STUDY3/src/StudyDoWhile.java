
public class StudyDoWhile {

	public static void main(String[] args) {
		// do ~ while문은 do 이하의 구문이 먼저 한 번 실행된 뒤에
		// 조건식을 검사하므로 결과가 ture이든 false이든 무조건 한번은
		// 실행됩니다.
		int a = 1;
		do {
			a += 3;
			System.out.println("몇번 실행 될까요?");
		} while(a < 13); 

}
}