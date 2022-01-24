
public class StudyMethodQ2 {
	

	public static int mul(int a, int b, int c) {
		return a * b * c;
	}

	public static void info() {
		System.out.println("안녕하세요");
		System.out.println("자바 메서드 학습중입니다.");
		System.out.println("1번의 호출로 3줄을 콘솔에 작성합니다.");
	}
	
	 public static void main(String[] args) {
		 int d = mul(1, 2, 3);
		 System.out.println(d);
		 for(int i = 0; i < 3; ++i) {
			 info();
		 }
	}

}
