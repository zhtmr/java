package test.main;
/*
 * 	[ java 참조 데이터 type ]
 * 	
 * 	String
 * 
 * 	 - 문자열을 다룰때 사용하는 데이터 type 이다.
 */
public class mainclass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		int num=10;
		String name="김구라";
		
		// 지역 변수는 선언만 하면 만들어 지지 않는다.
		// 즉 실행되지도 않는다.
		int num2;    // 자바스크립트에서는 선언만하면 변수안에 undefined가 있지만 자바에서는 아예 안만들어짐
		String name2;    
		
		// 대입하는 시점에 변수가 만들어 진다.
		num2=20;
		name2="해골";
		
		// 빈 변수를 선언과 동시에 만들고자 한다면?
		int num3=0;  // 기본데이터 type(0을 넣은 상태)  x
		String name3=null;  // 참조데이터 type(빈 상태)  o
	}
}
