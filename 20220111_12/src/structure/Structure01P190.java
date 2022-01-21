package structure;

public class Structure01P190 {

	public static void main(String[] args) {// 실행부
		// 이제부터는 실행코드의 정의(define)코드를 분리합니다.
		// main이 있는 클래스는 실행코드만 관리하고
		// 실제 로직은 다른 .java 파일에 저장합니다.
		
		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person p1 = new Person();
		// p1내부의 정의된 변수들을
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name = "박재현";//100번지.name
		p1.age = 28;
		p1.pNum = "010-2344-2341";
		p1.uNum = 7;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.pNum);
		System.out.println(p1.uNum);
		// 또 다른 사람 p2를 생성해주세요.
		
		// p2의 name, agew, pNum, uNum을
		// 부여해서 콘솔에 찍어주세요.
		
		Person p2 = new Person();
		p2.name = "김길똥";
		p2.age = 35;
		p2.pNum = "010-2344-2312";
		p2.uNum = 100;
		System.out.println(p2.name + "의 정보입니다.");
		System.out.println("이름 :" + p2.name + " 나이 : " + p2.age + " 연락처 : " + p2.pNum + " 회원번호 : " + p2.uNum) ;
				
	}

}
