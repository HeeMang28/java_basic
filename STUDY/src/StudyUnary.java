
public class StudyUnary {

	public static void main(String[] args) {
		// 단항연산자 ++, --
		// ++, --는 숫자의 왼쪽이나 오른쪽에 붙을 수 있습니다.
		// 왼쪽에 붙는 경우는 전위 수식이라 부르며, 오른쪽은 후위 수식이라 부릅니다.
		// 어느 방향에 붙느냐에 따라 실행순서가 달라집니다.
		// ++는 대상 변수의 숫자를 1증가, --는 대상 변수의 숫자를 1감소 합니다.
		 int a = 9;
		 System.out.println(++a);
		 // a앞에 ++가 붙은 전위 수식이기때문에 콘솔에 값을 입력하기 전에
		 // a에 +1을 먼저 해줍니다.a(1) + 1
		 // 그 후 더한 값을 콘솔에 찍어줍니다.  sysout(a(10))
		 System.out.println(a); //sysout(a(10))
		 
		 System.out.println(a++);
		 // a 뒤에 ++가 붙은 후위 수식이기때문에 콘솔에 값을 입력한 후에
		 // sysout(a(10))
		 // 그 후에 1을 더해줍니다. a(10) + 1
		 System.out.println(a); // sysout(a(11))

	}

}
