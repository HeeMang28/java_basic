package superkeyword;

public class Airplane {
	
	protected int speed;
	
	public Airplane(int speed) {
		this.speed = speed;
		
	}
	public void fly() {
		if((this.speed + 300 > 900)) {
			this.speed = 900;
		} else {
			this.speed += 300;
		}
		System.out.println("현재 비행기의 속도는 : " + speed + "입니다.");
	}
	public void breakspeed() {
		if((this.speed - 100) < 0) {
			this.speed = 0;
		} else {
			this.speed -= 100;
		}
	}

}
