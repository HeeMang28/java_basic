package game.interaction;

public class LittleDragon {
	
	private int hp;
	private int atk;
	
	public LittleDragon() {
		this.hp = 7;
		this.atk = 5;
	}
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("작은드래곤의 남은 체력 : " + this.hp);
	}
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

}
