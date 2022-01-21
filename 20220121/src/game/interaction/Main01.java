package game.interaction;

public class Main01 {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		
		Orc o1 = new Orc();
		
		w1.huntOrc(o1);
		System.out.println("---------------------");
		w1.huntOrc(o1);
		System.out.println("---------------------");
		w1.huntOrc(o1);
		

	}

}
