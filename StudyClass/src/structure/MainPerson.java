package structure;

public class MainPerson {
	
	public static void getInfo(Person p) {
		System.out.println(p.name + "님의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 휴대폰 번호 : " + p.pNum);
	}

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "짱아";
		p1.pNum = "010 1234 5678";
		getInfo(p1);
		

	}

}
