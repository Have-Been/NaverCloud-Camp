package chap15_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_Throws {

	public static void main(String[] args) {
		try {
			test();
			String[] strArr = new String[4];
			printStringArray(strArr);
			
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		} catch (NullPointerException ne) {
			System.out.println(ne.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}
	
	// throws는 해당 메소드가 호출되는 곳에 예외처리를 위임하는 것이다.
	// 메소드를 호출하는 곳에서 try ~ catch 구문으로 예외처리를 하던가 아니면 다시 한번 throws로
	// 예외처리를 위임할 수 있다.
	// throws의 위치는 매개변수의 소괄호 뒤, { 앞에 작성한다.
	
	public static void test() throws NumberFormatException, IOException{
		// BufferedReader : 입력 스트림으로부터 효율적으로 데이터를 읽기 위한 클래스
		// 문자 단위로 데이터를 읽을 수 있다. 한 번에 여러 문자를 읽어들이고 버퍼에 저장해두었다가
		// 사용자가 요청할 때마다 버퍼에서 읽어온다.
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int age = 0;
		
		// parseInt : 문자열을 정수로 변환하는 메소드, Integer 안에 속해있다.
		// in : BufferedReader와 같은 입력 스트림을 나타냄
		// readLine : 사용자로부터 한 줄의 문자열을 입력받음
		age = Integer.parseInt(in.readLine());
		// 사용자로부터 받은 문자열을 정수로 변환하는 값을 age에 저장
	}
	
	public static void printStringArray(String[] strArr) throws NullPointerException {
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i].length());
		}
	}
}
