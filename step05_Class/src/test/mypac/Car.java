package test.mypac;
/*
 * 	[ 클래스의 용도	]
 * 
 * 	1. static 멤버를 가지고 있는 역할
 * 	2. 객체의 설계도 역할(생성자)
 * 	3. Data type 역할
 * 
 */
public class Car {       // j.s의 생성자 함수와 비슷한 느낌. 설계도 역할.
	// 필드
	public String name;   // static 안쓰면 2.번 역할, 필드는 변수 선언만해도 만들어짐. 지역변수는 값을 무조건 넣어야됨.
	// 메소드
	public void drive() {
		System.out.println("달려요");
	}
	public void showName() {
		// String a=this.name;      // static에서는 클래스명에 .찍음
		/*
		 * 	this 라는 예약어는 해당 클래스로 객체가 생성이
		 * 	되었을때 바로 그 객체의 참조값을 가리키는 예약어다.
		 * 
		 */
		System.out.println("name"+this.name); 
		
		Car a=this;
	}
}
