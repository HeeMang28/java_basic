package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사");
		Orc o1 = new Orc();

		
		w1.hunt(o1);
		System.out.println("-----------------------");
		w1.hunt(o1);
		System.out.println("-----------------------");
		w1.hunt(o1);

		

		
		

	}

}
