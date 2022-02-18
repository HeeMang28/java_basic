package overloading;

public class Main01 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		c1.plus(3);
		c1.plus(10 + 30);
		c1.plus("히망");
		c1.plus(3.14);
		
		System.out.println("-----------------------------------");
		Parttimer p1 = new Parttimer(true, 10000, "스타벅스", "짱구");
		System.out.println("-------------------------------");
		Parttimer p2 = new Parttimer(false, "이디야커피", "짱아");

	}

}
