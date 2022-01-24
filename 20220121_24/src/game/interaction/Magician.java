package game.interaction;

public class Magician {
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
	

	public Magician() {
		this.hp = 15;
		this.mp = 20;
		this.atk = 3;
		this.exp = 0;
		this.lv = 1;
	}
	

	public void huntOrc(Orc orc) {

		if(orc.getHp() <= 0) {
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}

		orc.doBattle(this.atk);

		if(orc.getHp() <= 0) {
			this.exp += 10;
			System.out.println("오크를 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("법사의 경험치 : " + this.exp);
		} else {
		

		this.hp -= orc.getAtk();
		}
		System.out.println("법사의 남은 체력 : " + this.hp);
	}	
		public void huntLittleDragon(LittleDragon LittleDragon) {

			if(LittleDragon.getHp() <= 0) {
				System.out.println("작은드래곤은 이미 죽은 상태입니다.");
				return;
			}
			LittleDragon.doBattle(this.atk);
			if(LittleDragon.getHp() <= 0) {
				this.exp += 30;
				System.out.println("작은드래곤을 죽였습니다. 경험치가 30 올랐습니다.");
				System.out.println("법사의 경험치 : " + this.exp);
			} else {
			
			this.hp -= LittleDragon.getAtk();
			}
			System.out.println("법사의 남은 체력 : " + this.hp);
	}
		public void huntSlime(Slime Slime) {

			if(Slime.getHp() <= 0) {
				System.out.println("슬라임은 이미 죽은 상태입니다.");
				return;
			}
			Slime.doBattle(this.atk);
			if(Slime.getHp() <= 0) {
				this.exp += 5;
				System.out.println("슬라임을 죽였습니다. 경험치가 5 올랐습니다.");
				System.out.println("법사의 경험치 : " + this.exp);
			} else {
			
			this.hp -= Slime.getAtk();
			}
			System.out.println("법사의 남은 체력 : " + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}
	

}
