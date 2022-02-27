package interaction;

public class Buyer {
	private int money;
	private int banana;
	private int BANANA_PRICE;
	
	public Buyer(int money) {
		this.money = money;
		this.banana = 0;
		this.BANANA_PRICE = 1200;
	}
	public void showBuyer() {
		System.out.println("구매자의 정보입니다.");
		System.out.println("현재 소지금 : " + this.money + ", 현재 바나나 개수 : " + banana);
	}
	public void Buybanana(Seller seller, int banana) {
		if(seller.getBanana() < banana) {
			System.out.println("바나나가 모자랍니다. 현재 바나나 개수 :" + seller.getBanana());
			return;
		}
		this.money -= banana * BANANA_PRICE;
		this.banana += banana;
		seller.sellBanana(banana);
	}

}
