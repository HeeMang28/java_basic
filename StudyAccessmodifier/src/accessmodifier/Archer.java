package accessmodifier;

public class Archer extends Commoner {
	
	public Archer(String name) {
		super(name);
	}
	public void hunt() {
		System.out.println("아쳐가 사냥을 시작합니다.");
		
		setHp(getHp() - 2);
		
		setExp(getExp() + 10);
	}
	public void getInfo() {
		System.out.println(getName() + "의 정보입니다.");
		System.out.println("현재 HP : " + getHp());
		System.out.println("현재 MP : " + getMp());
		System.out.println("현재 Exp : " + getExp());
		System.out.println("현재 lv : " + getLv());
	}

}
