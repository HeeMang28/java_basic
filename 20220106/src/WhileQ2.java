import java.util.Scanner;

public class WhileQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		
		int num = scan.nextInt();
		int count = 0;
		while(count < num) {
			count++;
			System.out.println("*");
			
		}
		

	}

}
