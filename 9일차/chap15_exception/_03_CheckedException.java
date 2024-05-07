package chap15_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_CheckedException {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int age = 0;
		
		// IOException은 checkedException으로 무조건 예외처리 코드를 작성해야 한다.
		// readLine 메소드의 정의로 이동해보면 throws 구문으로 IOException을 던지고 있기 때문에
		// readLine 메소드를 호출하는 곳에서 IOException에 대한 예외처리를 해야 한다.
		// 에러가 발생하기 때문에 예외처리 필수
//		try {
			age = Integer.parseInt(in.readLine());
			
//		}catch (IOException ie) {
//			
//		}
//
	}

}
