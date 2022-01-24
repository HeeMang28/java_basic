import java.util.Scanner;

public class StudyMethodQ3 {

	public static double FtoC(double f) {
		double c = (f - 32) / 1.8;
		return c;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("화씨 온도를 입력해주세요.");
		double f = scan.nextDouble();
		
		double result = FtoC(f);
		System.out.println("화씨 " + f + "도를 섭씨로 바꾸면");
		System.out.println(result + "도입니다.");
	}
}
