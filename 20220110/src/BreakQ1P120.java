import java.util.Scanner;

public class BreakQ1P120 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받으세요.
		// 1~n까지 차곡차곡 순서대로 더해나갔을때
		// 1부터 몇까지 더해야 입력된 정수를 초과하는지 계산해주는
		// 프로그램을 작성해주세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니까?");
		
		int goal = scan.nextInt();
		int count = 1;
		// 바퀴수(1바퀴, 2바퀴, 3바퀴 .....n바퀴)
		int total = 0;
		// 총합(0부터 시작해서 누적된 값을 구함)
		while(true) {// 몇 바퀴를 돌아야 하는지 모르니 무한루프로 시작
			
			total += count;
			if(total > goal) {
				System.out.println("목표값 : " + goal);
				System.out.println("총 합 : " + total);
				System.out.println("몇 까지 더했나? : " + count);
				break;
				
		}
			count++;		
				}
		System.out.println("1부터 " + count + "까지의 총합은 " +
				goal + "을 초과한 값인 " + total + "입니다.");
		scan.close();		}

	}
