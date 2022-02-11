package constructor;

public class BasketballPlayer {
	
	public int height;
	public int jumpheight;
	
	
	public BasketballPlayer(int h, int j) {
		height = h;
		jumpheight = j;
		
		System.out.println("이 농구 선수의 키는 : " + height + ", 점프력은 : " + jumpheight + " 입니다.");
		
	}
	
	public void dunkShoot() {
		if (height + jumpheight > 300) {
			System.out.println("덩크 슈웃");
		} else {
			System.out.println("덩크에 실패했습니다.");
		}
	}
}
