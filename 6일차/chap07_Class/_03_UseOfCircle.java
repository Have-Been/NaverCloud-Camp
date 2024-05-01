package chap07_Class;

import chap07_Class.circle.Circle;

public class _03_UseOfCircle {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		
		System.out.println(circle.radius);
		System.out.println(circle.CirclerRadius());
		System.out.println(circle.Circlerarea());
		
	}

}
