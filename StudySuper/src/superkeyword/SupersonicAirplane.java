package superkeyword;

public class SupersonicAirplane extends Airplane {

	public SupersonicAirplane(int speed) {
		super(speed);
	
	}

	public void fly () {
		
		if(speed + 300 <= 900 ) {
			super.fly();
		} else {
			
			if(speed + 300 >= 1300) {
				speed = 1300;
			} else {
				speed += 300;
			}
			System.out.println("초음속 비행중입니다 : " + speed + "km/h");
		}

	}
}
