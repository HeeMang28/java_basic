
public class Method02P204 {
	
	public static int add2(int a) {
		return a +1;
	}

	public static void main(String[] args) {
		// 반환자료가 void가 아닌 경우에는 호출 위치에
		// return문 오른쪽 자료를 그대로 갖다놓습니다.
		
		int b = add2(67);
		// int b = 68;
		
		System.out.println(b); 

	}

}
 