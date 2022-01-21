
public class StudySwitchCase {

	public static void main(String[] args) {
		// switch(변수) {
		//  case 값1 :
		//      실행문;
		//  case 값2 :
		//    .....
		// }
		// 위와 같이 작성합니다.
		// 마지막에 default문을 작성한다면 if~else문의 else처럼 가능합니다.
		int score = 10;
		
		switch(score) {
		case 10 :
		case 9 :
			System.out.println("수");
			break;
		case 8 :
		case 7 :
			System.out.println("우");
			break;
		case 6 :
		case 5 :
			System.out.println("미");
			break;
		case 4 :
		case 3 :
			System.out.println("양");
			break;
		default :
			System.out.println("가");
			break;
		}
	}

}
