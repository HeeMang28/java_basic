package polymorphism;

// 부모클래스를 Person으로 가지도록 상속을 해주세요.

public class Student extends Person {
	private int grade;
	
 public Student(String n, int a, int grade) {
	 super(n, a);
	 this.grade = grade;

	}
	// 학생의 동급인 grade(성적) 변수를 선언합니다.
	public void showPerson() {
		// 부모쪽 showPerson() 에 이미 name, age를 출력해주는 구문이 있음.
		super.showPerson();
		System.out.println("성적 : " + this.grade);
	// super()를 이용해 Person(부모) 생성자까지 커버하는 생성자를 만들어주세요.
	// name, age, grade 까지 모두 입력 받습니다.
	// 부모쪽에서 쓸 자원인 name, age는 부모쪽으로 넘겨준 다음
	// grade만 자신이 받아서 씁니다.

	}
	// 상속받은 ShowPerson()을 활용한 메서드를 추가로 작성해 grede도 찍히게 해주세요.
	public void showStudent() {
		System.out.println("저는 학생입니다.");
	}
	// "저는 학생입니다."라고 콘솔에 찍는 showStudent 메서드를 Student에만 작성합니다.

}
