
public class StudyAndOr {

	public static void main(String[] args) {
		// 논리 연산자는 둘 이상의 논리식을 나열해서 제시할 때 사용합니다.
		// 논리식1 & 논리식2 의 경우 양쪽 모두 true인 경우
		// 논리식1 | 논리식2 의 경우는 한 쪽 이상의 논리식이 다 true인 경우
		// 최종 조건식을 ture로 판단해줍니다.
		System.out.println((70 > 50) & (10 > 50)); // (참) & (거짓), 최종 결과 : 거짓
		System.out.println(70 >50 | 10 > 50); // 참 | 거짓, 최종 결과 : 참
		
		// &, |와 똑같이 작동하되, 왼쪽의 조건식만으로 모든 결과가 확정되면
		// 오른쪽 항은 계산하지 않고 넘어갑니다.
		// 에러가 발생하는 오른쪽 연산(0으로 나누기)를 생략하는지 테스트하기.
		System.out.println((4+ 3 < 7) && (0 < 3 / 0));
		System.out.println((6 > 4) || (0 < 2/0));
	}

}
