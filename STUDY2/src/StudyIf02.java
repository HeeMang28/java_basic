import java.util.Scanner;

public class StudyIf02 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		double su;
		
		System.out.println("수를 입력해주세요. ");
		su = scan.nextDouble();
		
		if(su > 0) {
		System.out.println(su +"는 0보다 큽니다.");
		} 
		scan.close();
		
		

	}

}
