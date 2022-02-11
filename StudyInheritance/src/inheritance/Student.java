package inheritance;


//클래스 명칭 오른쪽에 <extends 부모클래스 이름> 을 적습니다.
//이렇게 상속한 클래스는 부모, 자식클래스가 하나의 객체 내부에
//공존하는 형태로 메모리에 생성됩니다.
public class Student extends Person {
	
	public int stuNum;
	
	
	public void getStuInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age
				+ ", 학번 : " + stuNum);
	}

}
