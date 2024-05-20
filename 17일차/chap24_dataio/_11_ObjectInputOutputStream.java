package chap24_dataio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import chap24_dataio.car.Car;

public class _11_ObjectInputOutputStream {

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		
		carList.add(new Car("현대", "아반떼", 3000, 190.7));
		carList.add(new Car("현대", "소나타", 4000, 200.5));
		carList.add(new Car("현대", "제네시스", 6000, 210.11));
		
		try {
			// 1. ObjectOutputStream 객체 생성
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream(
							"D:/lecture/Java/javaprograming/src/chap24_dataio/Car.txt"	
					)
			);
			
			// 2. ObjectOutPutStream을 이용해서 객체 출력
			for(Car car : carList) {
				// 2-1. writeObject(매개변수) : 매개변수로 주어진 객체를 바이트로 직렬화하여 출력
				objectOutputStream.writeObject(car);
			}
			
			objectOutputStream.flush();
			objectOutputStream.close();
			
			// ObjectInputStream 객체 생성
			ObjectInputStream objectInputStream = new ObjectInputStream(
					new FileInputStream(
							"D:/lecture/Java/javaprograming/src/chap24_dataio/Car.txt"
					)
			);
			
			// 4. ObjectInputStream을 이용하여 객체로 읽어오기
			for(int i = 0; i < 3; i++) {
				// 5. readObject : 읽은 내용을 Object 타입으로 리턴
				// Object 로 리턴되기 때문에 사용할 클래스 형태오 형변환한다.
				Car car = (Car)objectInputStream.readObject();
				
				System.out.println(car);
			}
			
			objectInputStream.close();
		} catch (FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
