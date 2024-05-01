package chap07_Class;

import chap07_Class.car.Car;

public class _01_Instance {

	public static void main(String[] args) {
		// 1. 정의한 클래스는 항상 변수로 선언해서 사용한다. (static 클래스 제외)
		// 그래서 클래스는 사용자가 직접 정의하는 자료형이라고도 한다.
		Car car;
		
		int a = 10;
		
		// 2. 정의한 클래스 타입의 값을 만들어주는 작업을 인스턴스라고 한다.
		// 인스턴스화를 진행하게 되면 클래스 내의 선언된 변수들과 메소드들이 메모리에 올라가고
		// 그 변수들과 메소드를 사용할 수 있는 클래스 타입의 값이 객체로 하나 만들어지게 된다.
		// 인스턴스 방식 : new 생성자();
		car = new Car(); // car에 있는 메모리들이 heap에 올라가고 객체들을 받을 수 있게 됨
		
		// println 메소드에 매개변수로 객체를 전달하게 되면 toString 메소드가 실행된다.
		System.out.println(car); // object에 있던 toString이 실행이 되며 car의 주소값이 String 으로 출력
		
		// 3. 생성된 객체의 변수에 값을 저장
		car.company = "현대";
		car.model = "제네시스";
		car.color = "검정";
		car.price = 5000;
		
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.price);
		
		// 4. 생성된 객체의 메소드 사용
		car.turnOn();
		car.speedUp();
		car.speedDown();
		car.turnoff();
		car.printCarInfo();
		
		// 인스턴스(객체)를 생성해서 새로운 메모리 공간에 할당받기 때문에 
		// car와 car2는 서로 영향을 주지 않는다. (=> 전혀 다른 객체)
		Car car2 = new Car();
		
		// null로 출력
		System.out.println(car2.company);
		// 주소값 다름
		System.out.println(car2);
		System.out.println(car == car2);
		
		Car car3 = generateCar(car);
		
		car3.printCarInfo();
		
		Car car4;
		
		String str = "aaa";
		
		car4 = new Car();
	}
	
	// 클래스는 타입의 역할도 하기 때문에 메소드의 리턴타입이나 매개변수로도 사용할 수 있다.
	// 얕은 복서
	public static Car generateCar(Car aaa) {
		Car returnCar = new Car();
		returnCar.company = aaa.company; // 현대
		returnCar.color = aaa.color; // 검정
		returnCar.model = aaa.model; // 제네시스
		returnCar.price = aaa.price; // 5000
		
		return returnCar;
	}

}
