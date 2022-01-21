package thiskeyword;

public class Person {
	
	private String name; // 바깥쪽 name
	private int age;
	private int money;
	private String major;
	
	
	public Person(String name, int age, int money, String major) {
		this.name = name; // 안쪽 name
		this.age  = age; // 오른쪽에 있는건 전달 받은 값을 넣어야하고 왼쪽에 있는건 대입해야하는거
		this.money = money;
		this.major = major;

	}
	public void getInfo() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age + ", 소지금액 : " + this.money + ", 전공 : " + this.major);
	} // 내부에 있는 데이터는 파란색, 받아야 할 값은 회색으로뜸

}
