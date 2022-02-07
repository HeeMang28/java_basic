package stringbuilder1;

public class Builder06P408 {

	public static void main(String[] args) {
		// 앞에서부터 빼면 이상하게 빼지기 때문에 뒤에서 부터 뺌.
		
		StringBuilder a = new StringBuilder("abcdefghijklnmopqrstuvwxyz");
		System.out.println(a);
		int checkNum = a.length() % 3;
		
		System.out.println(checkNum);
		
		int loopNum = a.length() - checkNum;
		
		for(int i = loopNum; i > -1; i--) {
			if(i % 3 == 0) {
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);

	}

}
