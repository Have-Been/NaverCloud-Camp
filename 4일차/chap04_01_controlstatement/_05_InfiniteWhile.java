package chap04_controlstatement;

import java.util.Scanner;

public class _05_InfiniteWhile {

	public static void main(String[] args) {
		// Scanner : 사용자의 입력값을 받아주는 클래스
		// System : 현재 사용중인 운영체제의 정보를 가져오는 클래스
		// System.in : 현재 사용중인 운영체제의 입력장치, 키보드, 마우스
		Scanner sc = new Scanner(System.in);
		
		// 무한루프 구문
		// 특정조건일 때 break 구문을 사용하여 while문을 종료시킨다.
		while (true) {
			System.out.println("문자열을 입력하세요.  ");
			// Scanner.nextInt() : 입력받은 정수값을 리턴해주는 메소드. 엔터값 포함되지 않음
			// Scanner.next() : 입력받은 문자열을 리턴해주는 메소드. 엔터값 포함되지 않음
			// Scanner.nextLine() : 입력받은 문자열을 리턴해주는 메소드. 엔터값을 포함한 문자열을 리턴
			
			String inputStr = sc.nextLine();
			
			System.out.println("입력한 문자열 : " + inputStr);
			
			// 입력한 문자열이 q일때 while문을 종료시키는 if문을 작성하세요.
			// String.equalsIngnoreCase() : 대소문자 구분없이 값 비교(소문자로 비교)
			
			if (inputStr.equalsIgnoreCase("q")) { // == 으로 하면 주소값을 비교하기 때문에 안먹힘
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
			
		}

	}

}
