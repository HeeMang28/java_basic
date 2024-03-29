package game.interaction;

public class Warrior {
	// Warrior의 특성으로
	// 체력(hp), 마나(mp), 공격력(atk), 경험치(exp), 레벨(lv)를 넣어주세요.
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
	
	// 생성자를 생성해서 아무것도 입력받지 않고
	// 체력은 20, 마나는 10, 공격력은 4, 레벨은 1, 경험치는 0이 자동입력되게 해주세요.
	public Warrior() {
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.exp = 0;
		this.lv = 1;
	}
	
	// 오크와 교전할 수 있도록 huntOrc()를 만들어보겠습니다.
	public void huntOrc(Orc orc) {
		// orc의 체력을 검사해서 0 이하라면 공격 없이
		// 오크가 이미 죽은 상태입니다. 라는 멘트만 뜨게 해주세요.
		// 메서드가 종료되게 해주세요.
		if(orc.getHp() <= 0) {
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}
		// orc의 doBattle을 호출해 먼저 오크 체력을 깍고
		orc.doBattle(this.atk);
		// 오크가 전사의 공격으로 죽은 경우 경험치를 10 더해주시고
		// 오크가 죽었습니다. 라는 멘트가 뜨고 메서드가 종료되게 해주세요.
		if(orc.getHp() <= 0) {
			this.exp += 10;
			System.out.println("오크를 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("전사의 경험치 : " + this.exp);
		} else {
		
		// 오크 공격력만큼 자신의 체력을 차감해줍니다.
		this.hp -= orc.getAtk();
		}
		System.out.println("전사의 남은 체력 : " + this.hp);
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
				System.out.println("전사의 경험치 : " + this.exp);
			} else {
			
			this.hp -= LittleDragon.getAtk();
			}
			System.out.println("전사의 남은 체력 : " + this.hp);
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
				System.out.println("전사의 경험치 : " + this.exp);
			} else {
			
			this.hp -= Slime.getAtk();
			}
			System.out.println("전사의 남은 체력 : " + this.hp);
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
