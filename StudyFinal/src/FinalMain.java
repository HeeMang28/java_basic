
public class FinalMain {

	public static void main(String[] args) {
		// final 키워드는 클래스, 메서드 , 
		// 변수에 적용되고 abstract(추상 메서드)와 동시에 사용 될 수 없습니다.
		// 
		final int a = 50;
		// final을 썻기 때문에 a 의 값을 바꿀 수 없습니다.
		// ex ) a = 80;
		// final 클래스는 자식 클래스를 가질 수 없고, 외부에서만 객체 생성을 통해서
		// 사용할 수 있습니다. 대표적으로 String에 많이 씁니다.
		final int WARRIOR_HP = 10;
		final int MONSTER_EXP = 10;
		// 자주쓰이는 코드들은 고정값으로 위와 같이 상수 처리해서 코드에 대입해주는게
		// 이러면 변수명만으로도 어떤 의미지 인지 유추 가능해서
		// 가독성이 높아집니다.
		// final이 붙은 변수는 대문자로만 적으며, 단어사이는 _로 연결합니다.
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
	}

}
