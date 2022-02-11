package overriding;

public class Cat extends Animal{
	public String color;
	
	public void howl() {
		System.out.println("냐오오오옹");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이 : "
				+ age + ", 성별 : " + gender + ", 색 : " + color);
		
	}

}
