package chap24_dataio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _02_ByteOutputStream {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream(
					"D:/lecture/Java/javaprograming/src/chap24_dataio/_02_ByteOutputStream02.txt"
			);
			
			// 1. byte 배열로 출력
			byte[] byteArr = new byte[5];
			
			for(byte i= 0; i < byteArr.length; i++) {
				byteArr[i] = i;
			}
			
			// byte의 첫번째부터 3번째까지 출력
			os.write(byteArr, 1, 3);
			
			os.flush();
			
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}

	}

}
