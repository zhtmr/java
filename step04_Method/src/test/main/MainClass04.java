package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		showSum(1874, 48498);  // ���� Ŭ���� �ȿ��ִ� ��� �޼ҵ峢���� Ŭ������ ��������
		MainClass04.showSum(20, 30);
	}
	/*
	 * 	�޼ҵ� �� : showSum
	 * 	���޹޴� ������ ���� : 2��
	 * 	���޹޴� ������ ������ type : 2�� ��� int type
	 * 	�޼ҵ� �������� ���� : ���޹��� 2�� ������ �� ���
	 */
	public static void showSum(int num1,int num2) {
		int sum=num1+num2;  // �������� ����
		System.out.println("�� ���� ��:"+sum);
	}
}
