package arrays2;

import java.util.Arrays;

public class Arrays06 {

	public static void main(String[] args) {
		// 유니코드 이후 출현하는 이모지도 역시
		String[] arr = {"박재현", "朴在賢", "🤣🤣🤣🤣🤣🤣","abcd"};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		

}
}