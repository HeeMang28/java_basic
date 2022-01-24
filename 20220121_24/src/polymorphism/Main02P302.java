package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		
		Actor a1 = new Actor("송강호", 54, 2000000000);
		
		Progamer pg1 = new Progamer("이상혁", 26, "T1");
		
		a1.showPerson();
		System.out.println("----------------------");
		pg1.showPerson();
		// person 쪽 showperson 먼저 호출 되고 
		// 자식쪽으로 내려가서 showperson 호출된다.
		pg1.showProgamer();
		a1.showActor();

	}

}
