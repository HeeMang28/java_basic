package constructor;

public class Main01P204 {

	public static void main(String[] args) {
		
		
	Car c1 = new Car("박재현");
	//c1.gas = 100;
	//c1.speed = 0; //기본값= 설정을 위해 생성자를 활용합니다.
	//c1.owner = "박재현";
	c1.getInfo();
	c1.accelSpeed();
	c1.reFuel();
	c1.breakSpeed();
	c1.getInfo();
	
	Car c2 = new Car("짱구");
	
	c2.accelSpeed();
	c2.getInfo();
	
	

	}

}
