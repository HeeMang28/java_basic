package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {

	public static void main(String[] args) {
		// Random객체를 생성한 다음 nextBoolean() 기능을 이용해서
		// 동전던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서
		// 프로그램이 다 끝났을때 앞면 몇회, 뒷면 몇회 인지
		// 콘솔창에 출력해주세요.
		// 실행 횟수 n회는 스캐너로 입력 받습니다.
		
		Random random = new Random();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("던질 횟수를 정해주세요.");
		int count = scan.nextInt();

		int t = 0;
		int f = 0;
		int loop = 0;
		while(loop < count) {
			loop++;
			boolean result = random.nextBoolean();
			if(result == true) {
				t += 1;
			} else if(result == false) {
				f += 1;
			}

		}
		System.out.println(count + "바퀴 돌린 결과 값 :");
		System.out.println("앞면 : " + t);
		System.out.println("뒷면 : " + f);

	}

}
