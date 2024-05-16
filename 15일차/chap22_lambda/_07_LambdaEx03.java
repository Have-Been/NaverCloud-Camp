package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.BasicCalculator;

public class _07_LambdaEx03 {

	public static void main(String[] args) {
		// calc 메소드를 호출하면서
		// 연산자의 형태에 따라
		// +는 덧셈
		// -는 뺄셈
		// *는 곱셈
		// /는 나눗셈
		// %는 나머지
		// 연산이 되도록 람다식을 구성하세요
		
		// calc에서 오류가 난다! 왜일까?
		// -> 헉 마지막에 return을 안해서 오류가 났음
		int result = calc((num1, num2, str) -> {
			/*
			 * 람다식으로 추상메소드의 구현체를 전달하는데 
			 * 추상메소드의 형태와 동일해야한다.
			 * 리턴 타입 및 매개변수의 개수
			 * */
			if(str.equals("+")) {
				System.out.println("두 값을 덧셈한 결과 : ");
				return num1 + num2;
				
			}
			else if(str.equals("-")) {
				System.out.println("두 값을 뺄셈한 결과 : ");
				return num1 - num2;
			}
			else if(str.equals("*")) {
				System.out.println("두 값을 곱셈한 결과 : ");
				return num1 * num2;
			}
			else if(str.equals("/")) {
				System.out.println("두 값을 나눗셈한 결과 : ");
				return num1 / num2;
			}
			else if(str.equals("%")) {
				System.out.println("두 값을 나머지한 결과 : ");
				return num1 % num2;
			}
			else {
				System.out.println("연산자를 잘못 입력하셨습니다.");
			}
			
			return 0;
		});
		
		// return만 하고 출력안하기 에반데
		System.out.println(result);

	}
	
	public static int calc(BasicCalculator basicCalculator) {
		// 정수 두개 입력받고
		// +, -, *, /, % String 타입으로 입력받아서
		// basicCalculator의 calculate 메소드를 리턴하도록 구현하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 한 개를 입력하세요.");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("정수 한 개를 입력하세요.");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("연산자를 입력하세요. (+, -, *, /, % 중 하나)");
		String str = sc.nextLine();
		
		return basicCalculator.calculate(num1, num2, str);
		
	}
}
