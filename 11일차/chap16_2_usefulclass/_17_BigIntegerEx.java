package chap16_usefulclass;

import java.math.BigInteger;

public class _17_BigIntegerEx {

	public static void main(String[] args) {
		// 1 ~ 100까지 곱한 값을 구하세요 (100 팩토리얼 !100)
		
		// String 밖에 못받음
		BigInteger bigInteger = new BigInteger("1");
		// 단순히 1 값만 넣고 싶다면
		bigInteger = BigInteger.ONE;
		
		for(int i = 1; i <= 100; i++) {
			bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(bigInteger);
		
		long num = factorial(10);
		
		System.out.println(num);
		
		System.out.println("-------------------------------");
		// 1! = 1
		// 2! = 2
		// 3! = 6
		// ...
		// 100! = 9333...
		
		for(int i = 1; i <= 100; i++) {
			BigInteger bgInt = factorialBigInteger(BigInteger.valueOf(i));
			System.out.println(i + "! = " + bgInt);
			
		}

	}

	// factorial 클래스를 만들어서 계산하기
	public static long factorial(long num) {
		if(num == 0) {
			return 1;
		} else {
			// 재귀메소드 : 현재 메소드를 구현부안에서 호출
			// num = 10 이 들어오면
			// 10 * factorial(9)
			// 10 * 9 * factorial(8)
			// 10 * 9 * 8 * factorial(7)
			// ...
			// 10 * 9 * 8 * 7 * 6 * ... * factorial(0)
			// 0일때는 1이 리턴되어서 생략
			return num * factorial(num - 1);
		}
	}
	
	
	public static BigInteger factorialBigInteger(BigInteger bgInt) {
		// BigInteger 를 int형으로 형변환
		if(bgInt.intValue() == 0) {
			return bgInt.ONE;
		} else {
			return bgInt.multiply(factorialBigInteger(bgInt.subtract(BigInteger.ONE)));
		}
	}
}
