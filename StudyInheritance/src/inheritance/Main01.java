package inheritance;

public class Main01 {

	public static void main(String[] args) {
		// Student가 Person을 상속했기 때문에
		// Student는 Person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.age = 20;
		s1.name = "짱구";
		s1.stuNum = 7;
		
		s1.getInfo();
		s1.getStuInfo();

	}

}
