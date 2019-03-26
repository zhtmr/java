// 이 클래스가 속한 패키지를 표시한다.
package test.main;

public class MainClass07 {
	// run 했을때 실행순서가 시작되는 특별한 메소드
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됨");
		
		// int type num 이라는 지역변수 만들어서
		// 10 대입하기
		int num=10;
		
		// boolean type isRun 이라는 지역변수 만들어서
		// true 대입하기
		boolean isRun=true;
		
		// String type name 이라는 지역변수 만들어서
		// String type 객체의 참조값 대입하기
		String name="김구라";
		
		num=20;
		
		name="해골";
		String name2=null;
		name=null;
		
		
	}
}
