package polymorphism;

public class Actor extends Person {
	private int salaly;
	
	public Actor(String name, int age, int salaly) {
		super(name, age);
		this.salaly = salaly;
	}
	
	public void showPerson() {

		super.showPerson();
		System.out.println("연봉 : " + this.salaly);


	}
	
	public void showActor() {
		System.out.println("저는 배우 입니다.");
	}
}
