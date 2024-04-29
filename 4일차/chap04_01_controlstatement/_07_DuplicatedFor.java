package chap04_controlstatement;

import java.util.Iterator;

public class _07_DuplicatedFor {

	public static void main(String[] args) {
		// 1. 중첩 for문
		for (int i = 0; i < 5; i++) {
			// 총 5번 반복
			for(int j = 0; j < 5; j ++) {
				// 총 25회 반복
				System.out.println("i: " + i + ", j: " + j);
			}
			System.out.println("i값 증가");
		}
		System.out.println("-------------------");
		// 2. 2~9단까지 구구단 출력
		for(int k = 2; k <= 9; k++) {
			System.out.println("-------------------");
			System.out.println(k + "단");
			for(int l = 1; l <= 9; l++) {
				System.out.println(k + "*" + l + "=" + (k * l));
			}
		}
		System.out.println("-------------------");
		// 3. 
		// *****
		// *****
		// *****
		// *****
		// *****
		// 위 모양대로 출력할 수 있는 중첩 for문을 작성하세요.
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 4. AB + BA = 99를 만족하는 A, B값을 모두 출력하는 중첩 for문을 작성하세요(A, B는 0~9까지의 정수)
		for(int a = 0; a < 10; a++) {
			for(int b = 0; b < 10; b++) {
				int numAB = a * 10 + b; // 10을 곱하는 이유 : 10의 자리인 a를 만드려고
				int numBA = b * 10 + a;
				if(numAB + numBA == 99) {
					System.out.println("a : " + a + " b : " +b);
				}
			}
		}
	
	}

}
