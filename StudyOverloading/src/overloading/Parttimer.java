package overloading;

public class Parttimer {

	public boolean afternoon;
	public int pay;
	public String shopName;
	public String name;
	

	
	public Parttimer(boolean a, int p, String sn, String n) {
		if(p < 9160) {
			p = 9160;
		} else {
			pay = p;
		}
		afternoon = a;
		shopName = sn;
		name = n;
		System.out.println("오후알바 : " + afternoon);
		System.out.println("시급 : " + pay);
		System.out.println("가게명 : " + shopName);
		System.out.println("이름 : " + name);
		
	}
	public Parttimer(boolean a, String sn, String n) {
		pay = 9160;
		afternoon = a;
		shopName = sn;
		name = n;
		System.out.println("오후알바 : " + afternoon);
		System.out.println("시급 : " + pay);
		System.out.println("가게명 : " + shopName);
		System.out.println("이름 : " + name);
	}
	
	
}
