
public class Test {
	private int check;
	private int finalTerm;
	private int middleTerm;
	
	private static int presentation = 20;
	public Test(int check, int finalTerm, int middleTerm) {
		this.check = check;
		this.finalTerm = finalTerm;
		this.middleTerm = middleTerm;
	}
	public void testScore() {
		System.out.println("출석 점수 : " + this.check);
		System.out.println("중간고사 점수 : " + this.middleTerm);
		System.out.println("기말고사 점수 : " + this.finalTerm);
		System.out.println("발표 점수 : " + presentation);
	}
	public static int getPresentation() {
		return presentation;
	}
	public static void setPresentation(int presentation) {
		Test.presentation = presentation;
	}

}
