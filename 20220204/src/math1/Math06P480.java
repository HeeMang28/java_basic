package math1;

public class Math06P480 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random()  을 이용해 1/3확률로 가위,바위,보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보 > 가위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		// 힌트) 컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우를 따져서
		// 조건식에 ||을 사용합니다.
		
		// 0 = 가위, 1 = 바위, 2 = 보
		// 0 > 2, 1 > 0, 2 > 1

		int my = (int)(Math.random() * 3);
		
		int com = (int)(Math.random() * 3);
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		if((my == PAPER && com == SCISSORS) || (my == SCISSORS && com == ROCK) 
			|| (my == ROCK && com == PAPER)) {
			System.out.println("내가 이겼습니다.");
		} else if ((my == PAPER && com == SCISSORS) || (my == SCISSORS && com == ROCK)
				|| (my == ROCK && com == PAPER)) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (my == com){ //else를 써도되지만 가독성 측면에서 else if를 써줌
			System.out.println("무승부입니다.");
		}
		
		
	

		
				/*
		// 가장 기본적으로 생각하기 쉬운 결과 도출
		if(my == 0 && com == 2) {
			System.out.println("사용자가 승리했습니다.");
			System.out.println("사용자가 뽑은것 : 가위(0)");
			System.out.println("컴퓨터가 뽑은것 : 보(2)");
		
		} else if(my == 1 && com == 2) {
			System.out.println("컴퓨터가 승리했습니다");
			System.out.println("사용자가 뽑은것 : 바위(1)");
			System.out.println("컴퓨터가 뽑은것 : 보(2)");
		} else if(my == 2 && com == 2) {
			System.out.println("무승부입니다.");
			System.out.println("사용자가 뽑은것 : 보(2)");
			System.out.println("컴퓨터가 뽑은것 : 보(2)");
		} else if(my == 2 && com == 1) {
			System.out.println("사용자가 승리했습니다.");
			System.out.println("사용자가 뽑은것 : 보(2)");
			System.out.println("컴퓨터가 뽑은것 : 바위(1)");
		} else if(my == 2 && com == 0) {
			System.out.println("컴퓨터가 승리했습니다.");
			System.out.println("사용자가 뽑은것 : 보(2)");
			System.out.println("컴퓨터가 뽑은것 : 가위(0)");
		} else if(my == 1 && com == 1) {
			System.out.println("무승부입니다.");
			System.out.println("사용자가 뽑은것 : 바위(1)");
			System.out.println("컴퓨터가 뽑은것 : 바위(1)");
	} else if(my == 0 && com == 1) {
		System.out.println("컴퓨터가 승리했습니다.");
		System.out.println("사용자가 뽑은것 : 가위(0)");
		System.out.println("컴퓨터가 뽑은것 : 바위(1)");
} else if(my == 0 && com == 0){
	System.out.println("무승부입니다.");
	System.out.println("사용자가 뽑은것 : 가위(0)");
	System.out.println("컴퓨터가 뽑은것 : 가위(0)");
} else {
	System.out.println("사용자가 승리했습니다.");
	System.out.println("사용자가 뽑은것 : 바위(1)");
	System.out.println("컴퓨터가 뽑은것 : 가위(0)");
}
}
}
		*/
	}
}