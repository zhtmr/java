package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// showNum() 메소드를 호출해 보세요
		MainClass03.showNum(3);
		
		int myNum=999;
		// showNum() 메소드를 호출하면서 myNum을 전달
		MainClass03.showNum(myNum);
		
	}
	
	public static void showNum(int num) {
		System.out.println("num:"+num);
	}
}
