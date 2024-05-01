package chap07_Class;

import chap07_Class.student.Student;

public class _04_UseOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("홍길동", 20, "컴퓨터공학");
		
		student1.StudentPrint();
		
//		String[] strArr = new String[5];
		Student[] studentArr = new Student[3];
		
		studentArr[0] = new Student("홍길동", 20, "컴퓨터공학");
		studentArr[1] = new Student("임꺽정", 22, "화학공학");
		studentArr[2] = new Student("장길산", 20, "수학과");
		
		for(Student st : studentArr) {
			st.StudentPrint();
		}
	}

}
