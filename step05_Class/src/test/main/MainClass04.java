package test.main;

import test.mypac.Scv;

public class MainClass04 {
	public static void main(String[] args) {
		// Scv ��ü�� 3�� ���� ������ ��������
		// ���������� ��� ������
		Scv a=new Scv();
		Scv b=new Scv();
		Scv c=new Scv();
		
		// ���� ��ü �߿��� �ϳ��� �ڿ��� ĳ��
		a.mining();
		// �ϳ��� �ǹ��� ����
		b.building();
		// �ϳ��� ������ �Ѵ�.
		c.attack();
		
		// scv�� ���ݷ��� 1 ���� ��Ű��
		Scv.ap++;
		System.out.println("���ݷ� 1 ���� ��Ų����...");
		a.attack();
		b.attack();
		c.attack();
	}
}
