import java.util.Scanner;

public class StudyScanner {

	public static void main(String[] args) {
		// 코드 실행 중 특정한 값을 사용자에게 
		// 직접 입력받고 싶은 경우 스캐너기능을 사용합니다.
		// Scanner라고 적은 부분에 마우스를 갖다대고 import를 해주세요
		// 만약 안 나오면 r 오른쪽에 커서를 두고 ctrl + space를 눌러서 자동완성 시켜줘도 됩니다.
		// java.util 을 골라주면 됩니다.
		Scanner scan = new Scanner(System.in);
		// scan.next~~~() 시리즈는 콘솔에 아무 안내도 나오지 않기 때문에
		// 아래처럼 안내문장을 추가로 넣어주면 좋습니다.
		
		// 아래의 닉네임을 적어주세요.
		System.out.println("닉네임을 입력해주세요 : ");
		String name = scan.nextLine();
		
		// 아래의 키를 적어주세요.
		System.out.println("키를 입력해주세요 : ");
		double height = scan.nextDouble();
		
		System.out.println("닉네임 :" + name);
		System.out.println(" 키 : " + height);
		
		scan.close();
		

	}

}
