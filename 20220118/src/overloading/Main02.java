package overloading;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시급을 15000원으로 해 주시고
		// 다른 하나는 입력 없이 생성해주세요.
		
		Parttimer p2 = new Parttimer(false, "메가커피", "짱구");
        System.out.println("---------------------");
        Parttimer p1 = new Parttimer(true, 15000, "커피", "짱아");
		System.out.println("---------------------");

	}

}
