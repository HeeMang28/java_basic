import java.util.Arrays;

public class StudyArray {

	public static void main(String[] args) {
		// 배열은 일반 변수와 달리 하나의 변수명에 여러 값을
		// 입력할 수 있고 자료형에 []를 붙이는 것으로 선언합니다.
		// 배열은 크기를 정해서 생성할 수도 있고, 정하지 않고 생성할수도 있는데
		// 설정된 크기 이상으로 자료를 넣을 수 없습니다.
		// 배열의 크기(저장가능개수)는 "배열의 길이"라 표현합니다..
		// 배열명.length를 이용해 배열 크기를 알 수 있습니다.
		
		int a = 7;
				System.out.println(a);
				int b[] = {1, 2, 3, 4, 5};
				System.out.println(b);
				System.out.println(Arrays.toString(b));
				
				double [] c = {1.7, 2.6, 3.6, 4.5};
			  System.out.println(c);
			  System.out.println(Arrays.toString(c));
			  
			  double e[] = new double [5];
			  System.out.println(Arrays.toString(e));
			  
			  System.out.println(c[2]);
			  
			  
			  int[] d = new int[10];
			  System.out.println(Arrays.toString(d));
			  System.out.println(b.length);
			  System.out.println(c.length);
		
		
	}

}
