package test.main;

import test.mypac.YourUtil;  // 다른 패키지에 있는 클래스를 참조하기 위해서는 import를 해야한다.

public class MainClass05 {
	public static void main(String[] args) {
		// main 메소드에서 MyUtill 클래스 멤버 메소드 호출하기
		MyUtill.sendMessage();
		MyUtill.screenCapture();
		
		// YourUtil 클래스에 있는 메소드를 각각 호출
		YourUtil.fileDown();
		YourUtil.fileUp();
	}
}
