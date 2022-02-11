package overriding;

public class Main {

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		c1.age = 2;
		c1.color = "갈색";
		c1.gender = "수";
		c1.name = "냐옹이";
		
		c1.getInfo();
		c1.howl();

	}

}
