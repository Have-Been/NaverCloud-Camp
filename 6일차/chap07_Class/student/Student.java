package chap07_Class.student;

public class Student {
	public String name;
	public int age;
	public String major;
	
	// 기본생성자
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	public void StudentPrint() {
		// 생성자에서 this 객체가 생성된 객체를 의미한다면
		// 인스턴스 메소드에서 this 객체는 해당 메소드를 소유하고 있는 객체를 의미한다.
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공 : " + major);
	}
	
}
