package test.mypac;
/*
 * 	[ Ŭ������ �뵵	]
 * 
 * 	1. static ����� ������ �ִ� ����
 * 	2. ��ü�� ���赵 ����(������)
 * 	3. Data type ����
 * 
 */
public class Car {       // j.s�� ������ �Լ��� ����� ����. ���赵 ����.
	// �ʵ�
	public String name;   // static �Ⱦ��� 2.�� ����, �ʵ�� ���� �����ص� �������. ���������� ���� ������ �־�ߵ�.
	// �޼ҵ�
	public void drive() {
		System.out.println("�޷���");
	}
	public void showName() {
		// String a=this.name;      // static������ Ŭ������ .����
		/*
		 * 	this ��� ������ �ش� Ŭ������ ��ü�� ������
		 * 	�Ǿ����� �ٷ� �� ��ü�� �������� ����Ű�� ������.
		 * 
		 */
		System.out.println("name"+this.name); 
		
		Car a=this;
	}
}
