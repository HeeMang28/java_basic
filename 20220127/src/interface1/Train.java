package interface1;

public class Train implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = T_MIN_SPD;
		this.gas = T_MAX_GAS;
		this.name = name;
		
	}

	@Override
	public void accel() {
		if(speed + T_INCREASE_SPD > T_MAX_SPD) {
			 speed = T_MAX_SPD;
		} else {
			speed += T_INCREASE_SPD;
		}
		
	}

	@Override
	public void breakSpeed() {
		if(speed - T_DECREASE_SPD < T_MIN_SPD) {
			speed = T_MIN_SPD;
		} else {
			speed -= T_DECREASE_SPD;
		}
		
	}

	@Override
	public void reFuel() {
		if(gas + T_REFUEL_GAS > T_MAX_GAS) {
			gas = T_MAX_GAS;
		}else {
			gas += T_REFUEL_GAS;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("기차 이름 : " + name + ", 현재 속도 :  " + speed + ", 현재 연료 : " + gas);
		
		
	}

}
