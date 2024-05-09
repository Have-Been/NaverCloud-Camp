package chap18_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_ArrayListEx {

	public static void main(String[] args) {
		// 2. 사용자가 입력한 문자열을 StringBuilder 객체에 저장하고
		// 길이를 10씩 잘라서 List<StringBuilder>에 저장하고 출력하세요.
		Scanner sc2 = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		
		StringBuilder userStrB = new StringBuilder(sc2.nextLine());
		
		List<StringBuilder> sbList = new ArrayList<>();
		
		for(int i = 0; i < userStrB.length(); i+=10) {
			if(i + 10 < userStrB.length()) {
				sbList.add(
						new StringBuilder(
								userStrB.substring(i, i+10)
						)
				);
			} else {
				sbList.add(
						new StringBuilder(
								userStrB.substring(i, userStrB.length())
						)
				);
			}
		}
		
		for(StringBuilder sb2 : sbList) {
			System.out.println(sb2);
		}
		
//		System.out.println("---- 문제 1번 ----");
//		System.out.println(userStrBackUp());
	}
	// 1. 사용자가 입력한 5개의 문자열을 List<String>에 저장해서 리턴하는 메소드를 구현하세요.
	public static List<String> userStrBackUp() {
		Scanner sc1 = new Scanner(System.in);
		
		List<String> userStr = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			System.out.println("문자열 1개를 입력하세요 (총 5개)");
			String user = sc1.nextLine();
			userStr.add(user);
		}
		
		return userStr;
		
	}
	
}
