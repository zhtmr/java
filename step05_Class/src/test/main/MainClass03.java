package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();    // ������ ������ ���� null�̴�.
		Car c3=new Car();
		
		c1.name="�ҳ�Ÿ";
		c2.name="�����̵�";
		
		c1.showName();  // this�� �����Ǵ� �� : c1
		c2.showName();
		c3.showName();
		
	}
}
