package thiskeyword;

public class Person {
	
	private String name;
	private int age;
	private int money;
	private String major;
	
	public Person(String name, int age, int money, String major) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;
		// this 키워드는 대며앗라고 생각하면 됩니다. 
		// this는 자기 자신 객체를 지정할때 사용하는 키워드입니다.
		// this.를 사용하면 동일 클래스 내의 멤버(멤버변수, 메서드)를 참조 할 수 있습니다.
		// this()를 사용하면 생성자 내부에서 자신의 다른 생성자를 호출할 수도 있습니다.
	}
	public void getInfo() {
		System.out.println("이름 : " + this.name );
		System.out.println("나이 : " + this.age );
		System.out.println("가진 돈 : " + this.money );
		System.out.println("전공 : " + this.major );
		// 내부에 있는 데이터는 파란색으로 나오고, 받아야 할 값은 회색으로 뜬다.
	}

}
