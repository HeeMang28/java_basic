package accessmodifier;

public class Magician extends Commoner {
	
	
	public Magician(String name) {
		super(name);
		
	}
	
	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		//hp -= 2; //private 요소는 자식쪽에서도 컨트롤 불가능.
		// public인 setter의 일종인 setHp()를 대신 활용합니다.
		// setHp(5)인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청입니다.
		// 현재 원하는 것은 현재 hp값에서 2가 깍인 값이 새로운 hp로 저장되는것입니다.
		// setter와 getter(setHp(), getHp()를 적절히 활용해
		// 전투할때마다 체력이 2씩 깍이도록 로직을 작성해주세요.
		
		setHp(getHp() - 2);
		// 경험치도 마찬가지로
		// exp += 10; 을 직접 실행할 수 없으므로
		// setExp()를 활용합니다.
		// 현재 원하는 것은, 현 ext값에서 사냥시마다 10씩 증가하는것입니다.
		setExp(getExp() + 10);
		 
	}
	
	public void getInfo() {
		// 심지어 private는 수정만 안되는게 아니라 조회도 불가능합니다.
		// 따라서 getter를 이용해 상태를 조회할 수 있게 해주세요.
		System.out.println("현재 체력 : " + getHp() + "현재 마나 : " + getMp());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 레벨 : " + getLv());
		System.out.println("현재 유저명 : " + getName());
	
	}
	
	//firaball 기능을 추가해주세요.
	// 마나가 3줄고, 경험치는 20 증가합니다.
	
	public void fireball() {
		System.out.println("파이어볼");
		setMp(getMp() - 3);
		
		setExp(getExp() + 20);
	}
	
	

}
