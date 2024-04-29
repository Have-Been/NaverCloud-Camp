package chap04_controlstatement;

public class _04_While {

	public static void main(String[] args) {
		// 1. 1 ~ 100까지의 합
		int num = 1;
		int sum = 0;
		
		while (num <= 100) {
			sum += num ++;
			
		}
		System.out.println("1~100까지의 합 : " + sum);
		System.out.println("-----------------------------------");
		
		// 2. While문을 이용해서 1~10까지 거꾸로 출력
		
		int num2 = 10;
		
		while(num2 >= 1) {
			System.out.println("num : " + num2--);
		}
		
		System.out.println("-----------------------------------");
		
		for (int i = 10; i >= 1; i--) {
			System.out.println("i : " + i);
		}
		
	}

}
