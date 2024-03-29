
public class SwitchCase01P99 {

	public static void main(String[] args) {
		// switch ~ case 구문은 변수에 들어있는 자료가
		// case문에 제시된 자료와 일치하는지 여부로 논리식을 실행합니다.
		// switch(변수) {
		//  case 값1 :
		//      실행문;
		//  case 값2 :
		//    .....
		// }
		// 위와 같이 작성합니다.
		// 마지막에 default문을 작성한다면 if~else문의 else처럼 가능합니다.
		
		int a = 3; // int a 의 a와 switch(a) 의 a만 일치시켜주면된다. 무조건
		switch(a) {
		    case 1:
			    System.out.println("one");
 // 각 케이스 종료시마다 break; 를 마지막에 달아줘야 원하는 부분만 실행하고 빠져나옴.
		    case 2:
		    	System.out.println("two");
		    case 3:
		    	System.out.println("three");
		    case 4:
		    	System.out.println("four");
		    	break;
		    case 5:
		    	System.out.println("five");
		    	break;
		    default:
		    	System.out.println("1~5가 아니네요.");
		    	break; // 가독성을 위해 필요없는 break; 이지만 작성하기도 함.
			
		}

	}

}
