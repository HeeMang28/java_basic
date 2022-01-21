package structure;

public class Structure03P190 {
	
	public static void getInfo(Cat c) {
		System.out.println(c.name + "의 정보입니다.");
		System.out.println(" 이름 : " + c.name + " 나이 : " + c.age + " 성별 : " + c.gender);
	}
	

	public static void main(String[] args) {
		
		Cat a = new Cat();
		a.name = "냐옹";
		a.age = 2;
		a.gender = "수컷";
		
		Cat b = new Cat();
		b.name = "옹냐";
		b.age = 5;
		b.gender = "암컷";
		getInfo(a);
		
		System.out.println("------------------------");
		getInfo(b);
		
				
				

	}

}
