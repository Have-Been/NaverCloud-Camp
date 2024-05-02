package chap10_polymorphism;

import chap10_polymorphism.tv.LgTv;
import chap10_polymorphism.tv.Tv;
import chap10_polymorphism.tv.samsungTv;

public class _01_Polymorphism {

	public static void main(String[] args) {
		// 1. 다형성을 이용하여 Tv 객체 바꾸며 사용하기
		Tv tv = new LgTv();
		tv.powerOn();
		
		tv = new samsungTv();
		tv.powerOn();
		
		tv = new LgTv();
		tv.channelDown();
		
		tv = new samsungTv();
		tv.channelDown();
	}

}
