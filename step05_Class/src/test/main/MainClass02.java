package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// Car type �������� ���� c1�̶�� �̸��� �� �������� �����. 
		// ���� ���߿� �־��ְڴٴ� �ǹ�
		Car c1=null;
		
		// c1 �� Car type ������ ���� �����ϱ�
		c1=new Car();
		
		c1.drive();
		c1.name="�׷���";
		
		c1.showName();
		

	}
}
