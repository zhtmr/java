package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// showNum() �޼ҵ带 ȣ���� ������
		MainClass03.showNum(3);
		
		int myNum=999;
		// showNum() �޼ҵ带 ȣ���ϸ鼭 myNum�� ����
		MainClass03.showNum(myNum);
		
	}
	
	public static void showNum(int num) {
		System.out.println("num:"+num);
	}
}
