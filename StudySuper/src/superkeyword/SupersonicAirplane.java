package superkeyword;

public class SupersonicAirplane extends Airplane {

	public SupersonicAirplane(int speed) {
		super(speed);
		System.out.println("현재 초음속 비행기 속도 : " + speed);
	}

	public void fly () {
		
		if (speed + 500 <= 900) {
			super.fly(); 
		} else {
			
		  if(speed + 500 <= 1300) {
			 speed += 500; 
		} else {
			speed = 1300; 
		}
	} System.out.println("초음속 비행중입니다 : " + speed + "km/h");
	}	
}

