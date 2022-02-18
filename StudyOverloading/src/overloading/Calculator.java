package overloading;

public class Calculator {
	public void plus(int a) {// 파라미터로 int a값만 요구
		System.out.println(a + "에 7을 더한 값은" + (a + 7) + "입니다.");
	}
	
	public void plus(int a, int b) {//파라미터로 int a, int b를 요구
		System.out.println(a + "에" + b + "를 더한 값은 " + (a + b) + "입니다.");
	}
	
	public void plus(double a) { // 파라미터값으로 double a 요구
		System.out.println(a + "에 0.99를 더한 값은" +(a + 0.99) + "입니다.");

}
	public void plus(String str) { // 파라미터값으로 String str 요구
		System.out.println(str + "은 연산 대상이 아닙니다.");
	}
	}


