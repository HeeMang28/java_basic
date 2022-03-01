
public class Progamer extends Person {
	private String team;
	
	public Progamer(int age, String name, String team) {
		super(age, name);
		this.team = team;
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("소속 팀 : " + this.team);
	}
	public void showProgamer() {
		System.out.println("저는 프로게이머 입니다.");
	}

}
