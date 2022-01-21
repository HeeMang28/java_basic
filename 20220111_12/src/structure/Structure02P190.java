package structure;

public class Structure02P190 {
	
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 연락처 : " + p.pNum + ", 번호 : " + p.uNum);
	}

	public static void main(String[] args) {
		// 사람을 두명 만들어 보세요 (a, b)
		Person a = new Person();
		a.name = "박재현";
		a.age = 28;
		a.pNum = "010 2233 4455";
		a.uNum = 1231;
		getInfo(a);
		System.out.println("-----------------------");
		
		Person b = new Person();
		b.name = "박재순";
		b.age = 20;
		b.pNum ="010 4455 6678";
		b.uNum = 44432;
		getInfo(b);
		System.out.println("--------------------------");
		
		
		Person c = new Person();
		c.name = "김길똥";
		c.age = 33;
		c.pNum = "010 4455 7788";
		c.uNum = 10;
		getInfo(c);
		System.out.println("-------------------------");

	}

}
