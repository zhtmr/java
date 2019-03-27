package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();    // 생성된 시점의 값은 null이다.
		Car c3=new Car();
		
		c1.name="소나타";
		c2.name="프라이드";
		
		c1.showName();  // this에 참조되는 값 : c1
		c2.showName();
		c3.showName();
		
	}
}
