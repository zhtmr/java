package test.mypac;

public class Student {
	public String name;  // ȣ���� ������ �ٸ� �̸� �ޱ����� null
	
	// 1.default ������(���� �������� �ʾƵ� new�� ȣ���, ���� �ÿ� �غ��۾� ����)
	public Student() {
		System.out.println("Student() ������ ȣ���");
	}
	
	// 2.���ڷ� String type�� ���� �޴� ������(������ ��������(�����ε�))
	public Student(String name) {
		// ���ڷ� ���޵� ���� �ʵ忡 �����ϱ�
		this.name=name;
	}
	
	public void study() {
		System.out.println("���θ� �ؿ�");
	}
	
	public void goSchool() {
		System.out.println("�б��� ����");
	}
}
