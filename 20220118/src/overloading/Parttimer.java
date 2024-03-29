package overloading;

public class Parttimer {
	
	// 파트타이머의 정보
	// 오전여부(afternoon), 시급, 가게명, 본인이름
	
	public boolean afternoon; //true면 오후, 아니면 오전
	public int pay; // 시급
	public String shopName; // 가게명
	public String name; // 본인이름
	
	// 생성자 오버로딩은, 생성자도 메서드이니 생성자를 여러 개 오버로딩 형식으로 만드는 것입니다.
	// afternoon, pay, shopName, name을 모두 받아 저장해주는 생성자를 만들어주세요.
	// 접근 제한자는 public 입니다.
	
	public Parttimer(boolean a, int p, String s, String n) {
		if(p < 9160) {
			p = 9160;
		} else {
			pay = p;
		}
		afternoon = a;
		shopName = s;
		name = n;
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오후알바 : " + afternoon);
		System.out.println("시급 : " + pay);
		System.out.println("가게명 : " + shopName);
		System.out.println("이름 : " + name);
	}
	
	
	// 오버로딩은 이름은 같은데 파라미터값의 종류나 개수가 다르면 중복 작성을 허용합니다.
	// afternoon, shopName, name만 입력받는 생성자를 하나 더 중복작성 해주세요.
	
	public Parttimer(boolean a, String sN, String n) {
		afternoon = a;
		pay = 9160;
		shopName = sN;
		name = n;
		
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오후알바 : " + afternoon);
		System.out.println("시급 : " + pay);
		System.out.println("가게명 : " + shopName);
		System.out.println("이름 : " + name);
	}

}
