package test.main;

import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		// Car 클래스를 이용해서 객체 생성하기(설계도 실체화하기)
		Car c1 = new Car();  // 설계도를 실체화 하는 new. Car type참조값 얻어옴.
		c1.drive();       // heap영역 불러올때는 참조값을 변수에 담아서 변수에 .찍음
		c1.name="소나타";
		
		Car c2=new Car();
		c2.drive();
		c2.name="프라이드";
		
		// 객체의 필드에 있는 내용을 참조해서 변수에 담기
		String a=c1.name;
		String b=c2.name;
	}
}
