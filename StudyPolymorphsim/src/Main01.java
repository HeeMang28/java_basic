
public class Main01 {

	public static void main(String[] args) {
		
		Person p1 = new Person(6, "짱구");
		Person pg1 = new Progamer(27, "이상혁", "T1");
		
		p1.showPerson();
		System.out.println("-----------------");
		pg1.showPerson();
		// pg1은 Person 타입이므로 showProgamer를 할수가 없다.
		// show progamer를 받기 위해서는 progamer타입으로 생성을 해줘야한다.

	}

}
