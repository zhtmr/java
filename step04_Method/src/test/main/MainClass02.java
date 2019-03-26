package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		MainClass02.showMsg("A");  // 2.호출하면서 data 만들어서 참조값 전달 
		
		String str="또 만났군요~"; 
		MainClass02.showMsg(str);   // 3.메소드(함수)안에서 변수 만들고 전달한 경우
		
	}
	// MainClass02의 static 멤버 메소드
	public static void showMsg(String msg) { // 1.호출할 data type정하고 (call by reference)
		System.out.println("msg:"+msg);  
	}
}
