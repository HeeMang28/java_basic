package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 몇 장을 사야 당첨되는지 시뮬레이션 해보겠습니다.
		List<Integer> lotto = new ArrayList<>();
		List<Integer> first = new ArrayList<>();
		int getNum = 0;
		int getNum2 = 0;
		int count = 0;
		while(lotto.size() != 6) {
			getNum = (int)(Math.random() * 45) +1;
			
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
		Collections.sort(lotto);
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
		while(!lotto.equals(first)) {
			first.clear();
			
			while(first.size() != 6) {
				getNum2 = (int)(Math.random() * 45) +1;
				
				if(!first.contains(getNum2)) {
					first.add(getNum2);
				}
				if(lotto == first) {
					return;
				}
				System.out.println("" + lotto + first);
				count += 1;
			
		}

		
	

	}
		System.out.println("구매한 로또복권의 개수 :" + count);

}
}