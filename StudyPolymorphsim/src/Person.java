
public class Person {
	private int age;
	private String name;
	// 다형성이란  객체가 여러 형태를 가진다 라는 의미로 보면 됩니다.
	// 다형성은 상속을 전제조건으로 합니다.
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		
	}
	public void showPerson() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
