import java.util.Scanner;

public class ContinueQ1 {

	public static void main(String[] args) {
		// 1부터 n까지 총합을 구하되 홀수끼리만 더한
		// 총합을 구하는 구문을 작성해주세요.
		// continue문을 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		
		int n = scan.nextInt();
		int count = 0;
		int total = 0;
		
	   while(count < n) {
		    count += 1;
		    if(count % 2 == 0) {
		    	continue;
		    }
		    total += count; 
		    System.out.println("종합은 " + total + " 입니다.");
		}
	}

}
