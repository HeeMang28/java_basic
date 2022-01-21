package structure;

public class ClassMain01P196 {
	// PersonClass를 조회할 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass 내부에 필요한 메서드를 작성해놨기 때문입니다.

	public static void main(String[] args) {
		
		PersonClass a = new PersonClass();
		
		a.name = "짱구";
		a.age = 7;
		a.pNum = "010 짱구는 못말려";
		a.uNum = 2;
		a.glasses = true;
		
		PersonClass b = new PersonClass();
		
		b.age = 3;
		b.glasses = false;
		b.name = "짱아";
		b.pNum = "010 부리부리대마왕";
		b.uNum = 4;
		// 만든 사람 두명의 정보를 콘솔에 찍어보세요.
		// *힌트 getInfo의 소속은
		a.getInfo();
		
		

	}

}
