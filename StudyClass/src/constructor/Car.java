package constructor;

public class Car {
	public int speed;
	public int gas;
	public String owner;
	
	public Car(String o) {
		speed = 0;
		gas = 50;
		owner = o;
	}
	
	public void getInfo() {
		System.out.println("차주 : " + owner + ", 현재 스피드 : " + speed + ", 현재 가스 : " + gas);
	}
	public void aceelSpeed() {
		speed += 10;
		gas -= 2;
		
	}
	public void reFuel() {
		gas += 50;
		
	}
	public void breakSpeed() {
		speed -= 10;
	}

}
