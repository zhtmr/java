package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// Car type 참조값을 담을 c1이라는 이름의 빈 지역변수 만들기. 
		// 값은 나중에 넣어주겠다는 의미
		Car c1=null;
		
		// c1 에 Car type 참조값 얻어내서 대입하기
		c1=new Car();
		
		c1.drive();
		c1.name="그랜저";
		
		c1.showName();
		

	}
}
