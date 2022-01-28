package system1;

public class TimeCheck02p384 {

	public static void main(String[] args) {
		// try ~ catch구문의 소요시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요.
		// throw로 발생시키면 됩니다.
		
		// 시작시간 측정
		long start = System.currentTimeMillis();
		System.out.println("시작 시간 : " + start);
		
		long all = 0;
		
		for(long i = 0; i < 200000000L; i++) {
			all += i;
		}
		
		int randomNum = (int)(Math.random() * 8);
		System.out.println("나온 난수 값 : " + randomNum);
		
		try {
			if(randomNum > 5) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				System.out.println("정상 범위의 난수 발생");
			}
		} catch(Exception e) {
			System.out.println("이런건 없었습니다.");
		}
		
		// 끝나는 시간 측정
		long end = System.currentTimeMillis();
		System.out.println("끝난 시간 : " + end);
		System.out.println("소요 시간 : " + (end - start));

	}

}
