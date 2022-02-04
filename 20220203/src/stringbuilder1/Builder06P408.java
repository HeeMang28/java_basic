package stringbuilder1;

public class Builder06P408 {

	public static void main(String[] args) {
		// 
		
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
