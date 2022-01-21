package accessmodifier;

public class Dog {// 정의부
	// 강아지의 정보를 자율적으로 4개 부여해주세요.
	// String name은 고정입니다.
	
	// 생성자로 강아지 정보를 처리하시되
	// 이름은 무조건 입력받게 해 주세요.
	
	// 수치 정보값이 변경되는 형태의 메서드 하나를 만들어주세요.
	
	public double weight;
	public String name;
	public String breed;
	public int age;
	
	public Dog (String n) {
		name = n;
		breed = "시츄";
		age = 1;
		weight = 0.1;
		
	} public void newyear() {
		age += 1;
		System.out.println("새해가 밝았습니다." + name + "의 나이는 " + age + "살 입니다.");
	}
	

}
