package exception2;

public class TryCatchEX {

	public static void main(String[] args) {
		String[] name = {"김자바", "제이에스피", "박스프링"};
		
		try {
			// 0, 1, 2번 인덱스까지 가지는데 3까지 조회하도록 반복문 작성
			// for(int i = 0; i< 3; i++) {
			// 	System.out.println(name[i]);
			// }
			// 리스트 내부 요소를 조회할때는 향상된 for문을 쓰는게 좋습니다.
			// 절대 인덱스를 오버할 일이 없습니다.
			for(String n : name) {
				System.out.println(n);
			}
		} catch(Exception e) {
			System.out.println("더 이상 학생이 없는데 인덱스를 계속 돌렸습니다.");
		} finally {
			System.out.println("집계가 끝났습니다.");
		}

	}

}
