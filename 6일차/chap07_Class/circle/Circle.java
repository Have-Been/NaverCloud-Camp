package chap07_Class.circle;

public class Circle {
	// 원의 파이
	public final double PI = 3.14; // final = 초기값이 저장되어 수정불가
	//원의 반지름
	public int radius;
	
	// 기본 생성자 생성
	public Circle() {
		
	}
	// 매개변수가 있는 생성자
	public Circle(int radius) {
		// 생성자를 호출하면 객체가 생성되는데
		// this는 생성된 객체를 받아온다.
		this.radius = radius;
	}
	
	public double CirclerRadius() {
		return (double)(2 * PI * radius);
	}
	
	public double Circlerarea() {
		return (double)(PI * radius * radius);
	}
}
