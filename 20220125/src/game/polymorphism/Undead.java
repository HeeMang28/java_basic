package game.polymorphism;

// 현재 Monster 클래스에 대한 다형성을 활용하기 위해 설계했으므로
// 모든 몬스터 계열 클래스는 Monster를 상속받습니다.
public class Undead extends Monster{
	
	public Undead() {
		super(7, 5, "언데드", 15);
	}

}
