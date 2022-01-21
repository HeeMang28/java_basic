package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		
		Webtoon w= new Webtoon("짱구는못말려", "짱구");
		w.uploadWebtoon();
		w.uploadWebtoon();
		w.uploadWebtoon();
		w.completeWebtoon();
		w.getInfo();
		
		Webtoon w2 = new Webtoon("도라에몽", "진구" );
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.uploadWebtoon();		
		w2.completeWebtoon();
		w2.getInfo();
				
	}

}
