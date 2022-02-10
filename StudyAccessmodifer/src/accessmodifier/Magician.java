package accessmodifier;

public class Magician {
	
	// 변수값은 현실에서도 특정한 물체나 사람의 상태값이 휙휙 바뀌지 않으므로
	// 외부에서 값을 함부로 고칠 수 없도록 public 대신 private으로 고칩니다.

	
	private int strangth;
	private int hp;
	private int mp;
	private int exp;
	private int money;
	private String name;
	
	public Magician(String n) {
		strangth = 2;
		hp = 15;
		mp = 20;
		exp = 0;
		money = 100;
		name = n;
	}
	public void hunt() {
		hp -= 3;
		money += 10;
		System.out.println("사냥 결과 체력이 " + hp + "가 되었고, 소지금은 " + money + "원입니다.");
	}

}
