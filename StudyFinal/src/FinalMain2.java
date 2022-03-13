
public class FinalMain2 {

	public static void main(String[] args) {
		// final static을 쓰기 위해서는
		// 소속을 써줘야 합니다.
		// 여기서는 country 라는 곳에 면적들을 저장했기 때문에
		// country.상수명을 적어줘야합니다.
		System.out.println("프랑스의 면적 : " + Country.FRANCE);
		System.out.println("스페인의 면적 : " + Country.SPAIN);
		System.out.println("스웨덴의 면적 : " + Country.SWEDEN);
		System.out.println("노르웨이의 면적 : " + Country.NORWAY);
		System.out.println("독일의 면적 : " + Country.GERMANY);
		System.out.println("핀란드의 면적 : " + Country.FINLAND);
		System.out.println("폴란드의 면적 : " + Country.POLAND);
		System.out.println("이탈리아의 면적 : " + Country.ITALY);

	}

}
