package test.main;
/*
 * 	[ java ���� ������ type ]
 * 	
 * 	String
 * 
 * 	 - ���ڿ��� �ٷ궧 ����ϴ� ������ type �̴�.
 */
public class mainclass05 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵Ǿ����ϴ�.");
		int num=10;
		String name="�豸��";
		
		// ���� ������ ���� �ϸ� ����� ���� �ʴ´�.
		// �� ��������� �ʴ´�.
		int num2;    // �ڹٽ�ũ��Ʈ������ �����ϸ� �����ȿ� undefined�� ������ �ڹٿ����� �ƿ� �ȸ������
		String name2;    
		
		// �����ϴ� ������ ������ ����� ����.
		num2=20;
		name2="�ذ�";
		
		// �� ������ ����� ���ÿ� ������� �Ѵٸ�?
		int num3=0;  // �⺻������ type(0�� ���� ����)  x
		String name3=null;  // ���������� type(�� ����)  o
	}
}