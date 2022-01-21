package constructor;

public class Webtoon {
	// 웹툰 이름 name , 연재횟수 series, 작가 painter, 완결여부 complete
	
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	public Webtoon(String n, String p) {
		series = 1;
		name = n;
		painter = p;
		complete = false; 
	}
	
	// 웹툰 정보 조회하기 getInfo()를 만들어주세요
	public void getInfo() {
		System.out.println(" 제목 : " + name + ", 회차 : " + series + ", 작가 : " + painter + ", 완결여부 : " + complete );
	}
	public void uploadWebtoon() {
		series += 1;
	}
	public void completeWebtoon() {
		 complete = true;
		}
	}
	
	
