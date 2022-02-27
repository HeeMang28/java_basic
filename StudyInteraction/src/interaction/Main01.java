package interaction;

public class Main01 {

	public static void main(String[] args) {

		Seller s1 = new Seller(200);
		s1.showSeller();
		
		Buyer b1 = new Buyer(100000000);
		
		b1.Buybanana(s1, 100);
		System.out.println("---------------");
		s1.showSeller();
		System.out.println("---------------");
		b1.showBuyer();

	}

}
