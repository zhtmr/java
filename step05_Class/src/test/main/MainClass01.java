package test.main;

import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		// Car Ŭ������ �̿��ؼ� ��ü �����ϱ�(���赵 ��üȭ�ϱ�)
		Car c1 = new Car();  // ���赵�� ��üȭ �ϴ� new. Car type������ ����.
		c1.drive();       // heap���� �ҷ��ö��� �������� ������ ��Ƽ� ������ .����
		c1.name="�ҳ�Ÿ";
		
		Car c2=new Car();
		c2.drive();
		c2.name="�����̵�";
		
		// ��ü�� �ʵ忡 �ִ� ������ �����ؼ� ������ ���
		String a=c1.name;
		String b=c2.name;
	}
}
