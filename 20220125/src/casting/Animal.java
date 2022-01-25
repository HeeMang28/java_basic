package casting;

public class Animal {
	// 이름, 나이를 가집니다.
	private String name;
	private int age;
	
	// 생성자에서는 모두 입력받아 초기화합니다.
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void sit() {
		System.out.println("앉습니다.");
	}

}
