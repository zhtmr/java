package test.main;

import test.mypac.YourUtil;  // �ٸ� ��Ű���� �ִ� Ŭ������ �����ϱ� ���ؼ��� import�� �ؾ��Ѵ�.

public class MainClass05 {
	public static void main(String[] args) {
		// main �޼ҵ忡�� MyUtill Ŭ���� ��� �޼ҵ� ȣ���ϱ�
		MyUtill.sendMessage();
		MyUtill.screenCapture();
		
		// YourUtil Ŭ������ �ִ� �޼ҵ带 ���� ȣ��
		YourUtil.fileDown();
		YourUtil.fileUp();
	}
}
