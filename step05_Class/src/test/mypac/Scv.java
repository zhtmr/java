package test.mypac;

public class Scv {
	// �⺻ ü�� �ʵ� {��ü���� ��������� �����}
	public int hp=50;
	// ���ݷ�(static)�ʵ� {�ϳ��� ��������� ������ �����}
	public static int ap=5;
	
	// �ڿ��� ĳ�� ���
	public void mining() {		
		System.out.println("�ڿ��� ĳ��");
	}
	
	public void building() {
		System.out.println("�ǹ��� �����");
	}
	
	public void move() {
		System.out.println("������ �ؿ�");
	}
	
	public void attack() {
		System.out.println("������ �ؼ� "+Scv.ap+"�������� ���ؿ�"); // static�� �����Ҷ� Ŭ������ .����
	}
	
}
