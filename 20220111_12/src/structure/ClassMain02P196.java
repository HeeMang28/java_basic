package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		
		Car a = new Car();
		
		a.model = "페라리";
		a.price = 300000000;
		a.owner = "짱구";
		
		Car b = new Car();
		
		b.model = "쏘나타";
		b.price = 30000000;
		b.owner = "신봉선";
		
		a.getInfo();
		System.out.println("----------------------");
		b.getInfo();
		

	}

}
