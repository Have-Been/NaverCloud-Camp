package chap04_controlstatement;

public class _10_Continue01 {

	public static void main(String[] args) {
		// 1. for문에서의 continue : 아래 코드를 실행하지 않고 증감식으로 이동
		for(int i = 0; i < 10; i++) {
			// 0
			if(i < 5) {
				continue;
				// i가 5보다 작으면 continue로 인해 아래 print 코드는 실행되지 않고
				// 증감하다가 i가 5보다 크면 print코드 실행
			}
			
			System.out.println(i);
		}
		
		// 2. while문에서의 continue : 아래의 코드를 실행하지 않고 조건식으로 이동
		int num = 0;
		
		while (++num <= 100) {
			// 1 ~ 100중 3의 배수만 제외하고 출력
			if(num % 3 == 0) {
				continue;
			}
			
			System.out.println(num);
			
		}
	}

}
