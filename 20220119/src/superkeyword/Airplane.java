package superkeyword;

public class Airplane {
	// 비행기는 속도를 갑니다.
	protected int speed;
	// 생성자는 속도를 입력받아 저장해줍니다.

	public Airplane(int speed) {
		this.speed = speed;
		
	}
	public void fly() {
		if((this.speed + 500) > 900) {
			this.speed = 900;
		} else {
			this.speed += 500;
		}
		System.out.println("현재 비행기는 시속 " + speed + "km/h로 비행중.");
	}
	public void breakspeed() {
		if(this.speed - 100 < 0) {
			this.speed = 0;
		} else {
			this.speed -= 100;
		}
		System.out.println("감속결과" + speed + "km/h 로 비행중.");
	}

	

}
