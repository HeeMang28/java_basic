import java.util.Scanner;

public class StudyForQ5 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해주세요.
		// 입력받은 정수의 제곱 형태로 정사각형이 찍히도록
		// 중첩 반복문을 작성해주세요
		// ex) 3 입력시
		// ***
		// ***
		// ***
		// 위와 같이 3 * 3 형태로 출력
		// 가로줄을 출력할때는 System.out.print("*");를
		// 다음줄로 커서를 내릴때만 System.out.println();를 씁니다.
		
		
		
		for(int i = 4; i > 0; --i) {
			for(int j = 0; j < i; ++j) {
				System.out.print("*");
			} System.out.println();
			
		}

	}

}
