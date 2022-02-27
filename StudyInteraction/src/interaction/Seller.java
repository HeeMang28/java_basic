package interaction;

public class Seller {
	private int money;
	private int banana;
	private int BANANA_PRICE;
	
	public Seller(int banana) {
		this.money = 0;
		this.banana = banana;
		this.BANANA_PRICE = 1200;
	}
	public void showSeller() {
		System.out.println("판매자의 정보 입니다.");
		System.out.println("현재 소지금 : " + this.money + ", 바나나 개수 : " + this.banana);
	}
	public void sellBanana(int banana) {
		if(this.banana < banana) {
			System.out.println("바나나가 모자랍니다.");
			return;
		}
		this.banana -= banana;
		this.money += banana * BANANA_PRICE;
		
	}
	public int getBanana() {
		return banana;
	}
}

