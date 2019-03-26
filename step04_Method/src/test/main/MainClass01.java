package test.main;

public class MainClass01 {
	
	// run 했을 때 실행순서가 시작되는 특별한 메소드
	public static void main(String[] args) {
		System.out.println("main() 시작됨");
		MainClass01.gura();  // static이 붙어있는 멤버들은 class 명에 .찍어서 호출함
		System.out.println("main() 종료됨");
	}
	// MainClass01의 static 멤버 메소드 gura() 만들기
	public static void gura() {
		System.out.println("gura() 시작됨");
		
		System.out.println("gura() 종료됨");
		
	}
}
