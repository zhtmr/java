package test.mypac;

public class Counter {	
	// static field 정의하기 (메소드 밖에 변수선언)
	static int count=0;
	
	// 카운트를 올리는 메소드
	public static void addCount() {
		// 1 증가 시키기
		//Counter.count++;
		count++;
	}
	// 현재 카운트를 출력하는 메소드
	public static void showCount() {
		System.out.println("count:"+Counter.count);
	}
}
