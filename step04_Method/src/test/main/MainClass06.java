package test.main;

import test.mypac.Counter;

public class MainClass06 {
	public static void main(String[] args) {
		Counter.addCount();
		Counter.addCount();
		Counter.addCount();      // static 영역을 불러올때는 class명에 .찍음
		
		Counter.showCount();
	}
}
