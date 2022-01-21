package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("박재현");
		// public은 외부 지역에서 마음대로 바꿀수잇음.
		//w1.hp = 1000000;
		w1.hunt();
		w1.hunt();
		w1.hunt();
		
		

	}

}
