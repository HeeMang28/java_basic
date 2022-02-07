package calender1;

import java.util.Calendar;

public class Calender01P470 {

	public static void main(String[] args) {
		// Calender는 현재 시간을 일반적인 방식이 아닌 요일, 오전/오후 등으로
		// 달력기준으로 표기해주는 방식입니다.
		// Calender.getInstance()를 이용해 사용합니다.
		// 추상클래스여서 new키워드로 직접 생성해 쓸 수 없습니다.
		// Calender now = new Calender();
		Calendar now = Calendar.getInstance();
		
		// now.get(Calender.원하는정보); 형식으로 조회합니다.
		System.out.println("년도 : " + now.get(Calendar.YEAR));
		// 월을 조회해보세요. 월은 0부터 세서 마지막에 1을 더해줘야함.
		System.out.println("월 : " + (now.get(Calendar.MONTH) + 1));
		// 일은 DAY_OF_MONTH입니다.
		System.out.println("일 : " + now.get(Calendar.DAY_OF_MONTH));// DATE로도 대체가능함
		// 요일도 얻을 수 있는데, 요일은 1이 일요일, 7이 토요일입니다.(0이 없음)
		System.out.println("요일 : " + now.get(Calendar.DAY_OF_WEEK));
		// 오전 0, 오후 1
		System.out.println("오전, 오후여부 : " + now.get(Calendar.AM_PM));
		System.out.println("시 : " + now.get(Calendar.HOUR));
		System.out.println("분 : " + now.get(Calendar.MINUTE));
		System.out.println("초 : " + now.get(Calendar.SECOND));
		
	}

}
