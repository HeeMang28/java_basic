package accessmodifier2;

// Warrior를 적은 뒤 컨트롤+스페이스를 하면 자동으로 근처 패키지에서
// 일치하는 이름의 클래스가 있을때 import구문을 삽입해줍니다.
import accessmodifier.Warrior;

public class MainP197 {

	public static void main(String[] args) {
		// 자바는 같은 패키지에 들어있는 요소는
		// import 없이 바로 가져다 쓸 수 있습니다.
		// 하지만, 서로 다른 패키지에 속한 클래스를 호출할때는
		// 마치 Scanner를 쓸 때 처럼
		// import를 해줘야합니다.
		Warrior w1 = new Warrior("박재현");
		//w1.hp = 1000000;
		w1.hunt();
		w1.hunt();
		w1.hunt();

	}

}
