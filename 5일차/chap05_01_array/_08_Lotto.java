package chap05_array;

import java.util.Iterator;
import java.util.Random;

public class _08_Lotto {

	public static void main(String[] args) {
		// 1. 정수 7개를 저장할 수 있는 배열 생성
		int[] lNum = new int[7];
		
		// 2. 1~45까지의 숫자 중 랜덤한 숫자 7개 배열에 저장 (단, 중복은 제거)
		Random random = new Random();
		
		System.out.print("이번주 로또 번호는 ");
		
		for(int i = 0; i < lNum.length; i++) {
			int randomVal = random.nextInt(45) + 1; // 1~45까지
			lNum[i] += randomVal; // 랜덤으로 뽑은 값 저장
			
			//중복 제거
			if (i > 0) {
				for(int j =0; j < i; j++) {
					// 중복됐을 때
					if(lNum[i] == lNum[j]) {
						// 중복된 값이 저장된 인덱스에 다시 값을 저장하기 위해
						// i-- 해준다.
						// 외부 for문의 i++ 증감식을 만나 다시 현재 인덱스에 값을 저장할 수 있게 된다.
						i--;
						break;
					}
				}
				
			}
			// 3. 로또번호 출력
			// 0~5까지의 인덱스는 실제 당첨 번호
			// 6번 인덱스는 보너스 번호로 출력
			// 이번주 로또 번호는 1, 2, 3, 4, 5, 6, 보너스 번호 : 7
			if(i == 6) {
				System.out.print("보너스 번호 : " + lNum[i]);
			} else if(i < 6) {
				System.out.print(lNum[i] + ", ");
			}
		}
		
	}
}