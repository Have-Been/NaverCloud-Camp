package chap04_controlstatement;

import java.util.Scanner;

public class _09_Break02 {

	public static void main(String[] args) {
		// 2. 사용자가 입력한 숫자 단까지 구구단을 출력하는 프로그램을 작성하세요. 0을 입력하면 종료하세요.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("원하는 구구단의 숫자를 입력하세요. (0을 입력 시 프로그램이 종료됩니다.)");
			int userNum = sc.nextInt();
			
			for(int i = 2; i <= userNum; i++) {
				System.out.println(i + "단");
				for(int j = 1; j <= 9; j++) {
					// 내부 for문을 중단하는 break
					// j가 4가 되는 순간 내부 for문이 종료되고 외부 for문의 증감식으로 이동한다.
					if(j > 3)
						break;
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			}
			System.out.println("-----------------");
			if(userNum == 0) { // 0을 입력하면 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
		sc.close();
	}

}
