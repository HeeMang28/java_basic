import java.util.Scanner;

public class BreakQ1 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받으세요.
		// 1~n까지 차곡차곡 순서대로 더해나갔을때
		// 1부터 몇까지 더해야 입력된 정수를 초과하는지 계산해주는
		// 프로그램을 작성해주세요.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int n = scan.nextInt();
		int count = 1;
		int Total = 0;
		while(true) {
			
			Total += count;
			if(Total > n) {
				break;
			}
			count++;
		} System.out.println(n + "까지의 총합은 " + Total + "입니다.");
		
	}

}
