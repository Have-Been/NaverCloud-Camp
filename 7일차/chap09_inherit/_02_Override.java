package chap09_inherit;

import chap09_inherit.animal.Animal;
import chap09_inherit.animal.Bird;
import chap09_inherit.animal.Tiger;

public class _02_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Bird();
		
		// Brid에 있는 eat(), sleep() 메소드가 실행
		animal.eat(); // 모이를 쪼아 먹는다.
		animal.sleep(); // 나뭇가지에 앉아 잠을 잔다.
		
		animal = new Tiger();
		
		// Tiger 클래스의 eat, sleep이 실행
		animal.eat(); // 먹이를 먹는다. 육식을 한다.
		animal.sleep(); // 잠을 잔다. 누워서 잔다.
	}

}
