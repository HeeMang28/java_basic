package casting;

// Animal을 상속해주세요.
public class Cat extends Animal{
	
	//생성자를 이용해 부모쪽에 이름, 나이를 전달합니다.
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void howl() {
		System.out.println("냐옹");
	}
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}

}
