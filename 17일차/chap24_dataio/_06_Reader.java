package chap24_dataio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class _06_Reader {

	public static void main(String[] args) {
		try {
			// 1. Reader 객체 생성
			Reader reader = new FileReader(
					"D:/lecture/Java/javaprograming/src/chap24_dataio/Writer.txt"
			);
			
			// 2. 모든 문자를 읽기 위한 while문 선언
			while(true) {
				// 유니코드 형태로 하나씩 읽어옴
				int data = reader.read();
				
				if(data == -1) {
					break;
				}
				
				// 유니코드에 맞는 문자열 출력
				System.out.print((char)data);
				// 메모장에 적혀있는 대로 출력함
			}
			
			// 4. 스트림이 한 번 닫히면 다시 사용할 수 없다.
			reader.close();
			
			// 사용하려면 다시 선언해야 한다.
			reader = new FileReader(
					"D:/lecture/Java/javaprograming/src/chap24_dataio/Writer.txt"
			);
			
			// 5. 문자배열로 입력받기
			char[] readData = new char[60];
			
			while(true) {
				// 읽어들인 문자 개수 리턴해주는 read 메소드
				int cnt = reader.read(readData);
				
				if(cnt == -1) {
					break;
				}
				
				System.out.println("읽어들인 문자 개수 : " + cnt);
				for(char c : readData) {
					System.out.println(c + ", ");
				}
			}
			
			reader.close();
			
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
			
		}

	}

}
