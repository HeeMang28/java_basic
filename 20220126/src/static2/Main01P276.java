package static2;

public class Main01P276 {

	public static void main(String[] args) {
		
		System.out.println(Asean.getPresentationScore());
		
		
		Asean a1 = new Asean(20, 20, 20);
		Asean a2 = new Asean(10, 30, 25);
		Asean a3 = new Asean(15, 25, 30);
		Asean a4 = new Asean(20, 30, 30);
		a1.showAseanInfo();
		System.out.println("-----------------");
		a2.showAseanInfo();
		System.out.println("-----------------");
		a3.showAseanInfo();
		System.out.println("-----------------");
		a4.showAseanInfo();
		
		
		

	}

}
