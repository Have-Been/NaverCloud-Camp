package chap16_usefulclass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// 사용자가 5개의 정수를 입력하고 배열에 저장
		// 배열에 저장된 정수 5개 중에 최대값과 최소값을 구하세요.
		// Math.max와 Math.min 메소드를 이용하세요.
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] userInt = new int[5];
		
		for(int i = 0; i < userInt.length; i++) {
			System.out.println("정수 5개를 입력하세요");
			userInt[i] = sc.nextInt();
		}
		
		int max = userInt[0];
		int min = userInt[0];
		
		for(int i = 1; i < userInt.length; i++) {
			max= Math.max(max, userInt[i]);
			min= Math.min(min, userInt[i]);
		}
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		sc.close();
	}
}
