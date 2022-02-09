import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// map 자료형을 이용해 식당 메뉴판을 만들어보겠습니다.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> gatsu = new HashMap<>();
		
		gatsu.put("치즈카츠", 9000);
		gatsu.put("돈카츠", 7500);
		gatsu.put("냉모밀", 6000);
		gatsu.put("안심돈카츠", 8500);
		gatsu.put("돈카츠정식", 9000);
		
		
		System.out.println("치즈카츠 가격 : " + gatsu.get("치즈카츠"));
		System.out.println("돈카츠 가격 : " + gatsu.get("돈카츠"));
		System.out.println("냉모밀 가격 : " + gatsu.get("냉모밀"));
		

		

	}

}
