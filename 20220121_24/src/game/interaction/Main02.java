package game.interaction;

public class Main02 {

	public static void main(String[] args) {
		
		Warrior w2 = new Warrior();
		
		Slime s1 = new Slime();
		
		LittleDragon ld1 = new LittleDragon();
		
		w2.huntSlime(s1);
		System.out.println("-----------------------");
		w2.huntLittleDragon(ld1);
		System.out.println("-----------------------");
		w2.huntLittleDragon(ld1);
		

	}

}
