package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		// 생성한 객체의 정보를 get~~~~~info()를 이용해 콘솔에도 같이 찍어주세요.
		
		Student s3 = new Student();
		s3.name = "둘리";
		s3.age = 100;
		s3.stuNum = 2;
		
		Salaryman sa1 = new Salaryman();
		sa1.name = "박재현";
		sa1.age = 20;
		sa1.salary = 30000000;
		
		s3.getStuInfo();
		sa1.getSalaryInfo();
		

	}

}
