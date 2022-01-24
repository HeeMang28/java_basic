package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		
		Magician m1 = new Magician();
		
		Archer a1 = new Archer();
		
		Warrior w1 = new Warrior();
		
		Slime s1 = new Slime();
		LittleDragon ld1 = new LittleDragon();
		
		a1.huntSlime(s1);
		System.out.println("---------------");
		m1.huntLittleDragon(ld1);
		m1.huntLittleDragon(ld1);
		m1.huntLittleDragon(ld1);


	}

}
