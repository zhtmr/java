package test.main;

public class MainClass01 {
	
	// run ���� �� ��������� ���۵Ǵ� Ư���� �޼ҵ�
	public static void main(String[] args) {
		System.out.println("main() ���۵�");
		MainClass01.gura();  // static�� �پ��ִ� ������� class �� .�� ȣ����
		System.out.println("main() �����");
	}
	// MainClass01�� static ��� �޼ҵ� gura() �����
	public static void gura() {
		System.out.println("gura() ���۵�");
		
		System.out.println("gura() �����");
		
	}
}
