package test.main;

import test.mypac.Counter;

public class MainClass06 {
	public static void main(String[] args) {
		Counter.addCount();
		Counter.addCount();
		Counter.addCount();      // static ������ �ҷ��ö��� class�� .����
		
		Counter.showCount();
	}
}
