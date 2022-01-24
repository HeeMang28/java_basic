package polymorphism;

public class Progamer extends Person {
	private String team;
	
	public Progamer(String name, int age, String team) {
		super(name, age);
		this.team = team;
	}

		public void showPerson() {

			super.showPerson();
			System.out.println("팀 : " + this.team);


		}
		
		public void showProgamer() {
			System.out.println("저는 프로게이머 입니다.");
		}
		
}
