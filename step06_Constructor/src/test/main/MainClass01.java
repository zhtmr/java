package test.main;

import test.mypac.Student; // �ٸ� package���� �����Ѵٴ� �ǹ�. j.s���� @import����.

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 	Student ��ü�� 3�� ���� ��������
		 * 	3���� ���� ������ ���
		 * 
		 *  ������ name�� �ο��� ������
		 * 
		 */
		Student a=new Student();
		Student b=new Student();
		Student c=new Student();
		
		a.name="���";
		b.name="����";
		c.name="��ȯ";
	}
}
