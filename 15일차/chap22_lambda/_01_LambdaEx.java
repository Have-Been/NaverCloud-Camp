package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.IndexOfString;

public class _01_LambdaEx {

	public static void main(String[] args) {
		index((str1, str2) -> str1.indexOf(str2));
	}
	
	// 문자열 2개를 입력받아서
	// 첫 번째 입력받은 문자열에서 
	// 두 번째 입력받은 문자열이 어느 위치(인덱스)에 있는 지 검사하는 메소드를 구현하세요.
	// 매개변수는 함수형 인터페이스인 IndexOfString을 받습니다.
	// 검사해서 첫 번째 문자열에 두 번째 문자열이 포함되어 있으면
	// 감사합니다.에서 합니의 인덱스는 2입니다. 하고 출력
	// 검사해서 첫 번째 문자열에 두 번째 문자열이 포함되어 있지 않으면
	// 감사합니다.에서 가나다를 찾을 수 없습니다. 라고 출력
	
	// return값이 출력하는 것이라서 void
	public static void index(IndexOfString indexOfString) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		System.out.println("인덱스를 찾고자 하는 문자열을 입력하세요.");
		String indexStr = sc.nextLine();
		
		// indexOf : 찾는 문자열이 없으면 -1을 리턴
		if(str.indexOf(indexStr) >= 0) {
			System.out.println(str + "에서 " + indexStr + "의 인덱스는 " + 
					str.indexOf(indexStr) + "입니다.");
		} else {
			System.out.println(str + "에서 " + indexStr + 
					"의 인덱스를 찾을 수 없습니다. ");
		}
		
		return;
	}
}
