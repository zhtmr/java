package test.mypac;

public class Counter {	
	// static field �����ϱ� (�޼ҵ� �ۿ� ��������)
	static int count=0;
	
	// ī��Ʈ�� �ø��� �޼ҵ�
	public static void addCount() {
		// 1 ���� ��Ű��
		//Counter.count++;
		count++;
	}
	// ���� ī��Ʈ�� ����ϴ� �޼ҵ�
	public static void showCount() {
		System.out.println("count:"+Counter.count);
	}
}
