package chap07_Class;

import chap07_Class.car.CarConstrutor;
import chap07_Class.circle.Circle;

public class _02_Constructor {

	public static void main(String[] args) {
		// 기본생성자에서 company를 현대로 지정했기 때문에
		// 생성된 객체의 company는 현대로 초기화된 상태
		CarConstrutor car = new CarConstrutor();
		
		System.out.println(car.company);
		System.out.println(car.model);
		
		CarConstrutor kiacar = new CarConstrutor("기아");
		
		System.out.println(kiacar.company);
		System.out.println(kiacar.color);
		
		CarConstrutor blackGenesis = new CarConstrutor("현대", "제네시스", "검정", 5000);
		blackGenesis.printCarInfo();
		
		Circle cir = new Circle(4);
		
		System.out.println(cir.CirclerRadius());
		System.out.println(cir.Circlerarea());
	}
	
}
