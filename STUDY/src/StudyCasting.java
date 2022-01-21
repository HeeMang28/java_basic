
public class StudyCasting {

	public static void main(String[] args) {
		// 원래는 서로 다른 자료형간에는 연산이 불가능하지만
		// 편의상 컴퓨터가 자동으로 자료형을 보정해주는 경우가 있는데
		// 이를 가리켜 자료 형 변환이라고 합니다. 자료 형 변환에는
		// 자동 형변환인 Promotion과 강제 형 변환인 Casting이 있습니다.
		int a = 12;
		double b = 24.31;
		System.out.println(a + b);
		// 자동 형 변환을 통해 int -> double 로 바뀌어 36.31이 된다.
		// 강제 형 변환은 바꾸고 싶은 자료 왼쪽에 (바꿀자료형)자료 를 적어주면 된다.
		System.out.println(a + (int)b );
		// double 인 b의 강제 형변환은 통해서 36이라는 값이 나온다.

	}

}
