package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있습니다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// Animal c1, d1, a1 으로 받아주세요.
		
		Animal c1 = new Cat("냐옹", 1);
		
		Animal d1 = new Dog("봉희", 4);
		
		Animal a1 = new Animal("사자", 7);
		// c1, d1, a1에 대해서 .sit()을 각각 호출해보세요.
		
		a1.sit();
		System.out.println("-----------------");
		c1.sit();
		System.out.println("-----------------");
		d1.sit();
		
		// 각 자료형의 근본적 자료형에 맞춰서 되돌려보겠습니다.
		Cat cat = (Cat)c1;
		// c1은 Animal타입이나, 힙에 저장된 데이터가 Cat
		// 이므로 Cat으로 변환이 가능함
		cat.howl();
		
		Dog dog = (Dog)d1;
		dog.come();
		
	
		

	}

}
