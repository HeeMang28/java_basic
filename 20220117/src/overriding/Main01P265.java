package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말을 하나 생성해주시고
		// 오버라이드된 매서드들을 하나씩 호출해보세요.
		
		Horse h1 = new Horse();
		h1.name = "말";
		h1.age = 1;
		h1.gender = "수컷";
		h1.rank = 2;
		
		h1.howl();
		h1.getInfo();
		
		Dog d1 = new Dog();
		d1.name = "봉희";
		d1.age = 4;
		d1.gender = "암컷";
		d1.color = "갈색";
		
		d1.howl();
		d1.getInfo();
		
		

	}

}
