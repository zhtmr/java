package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		MainClass02.showMsg("A");  // 2.ȣ���ϸ鼭 data ���� ������ ���� 
		
		String str="�� ��������~"; 
		MainClass02.showMsg(str);   // 3.�޼ҵ�(�Լ�)�ȿ��� ���� ����� ������ ���
		
	}
	// MainClass02�� static ��� �޼ҵ�
	public static void showMsg(String msg) { // 1.ȣ���� data type���ϰ� (call by reference)
		System.out.println("msg:"+msg);  
	}
}
