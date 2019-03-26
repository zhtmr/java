package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		showSum(1874, 48498);  // 같은 클래스 안에있는 멤버 메소드끼리는 클래스명 생략가능
		MainClass04.showSum(20, 30);
	}
	/*
	 * 	메소드 명 : showSum
	 * 	전달받는 인자의 갯수 : 2개
	 * 	전달받는 인자의 데이터 type : 2개 모두 int type
	 * 	메소드 내에서의 동작 : 전달받은 2개 정수의 합 출력
	 */
	public static void showSum(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("두 수의 합:"+sum);
	}
}
