package test.main;

import test.mypac.Student; // 다른 package에서 참조한다는 의미. j.s에서 @import느낌.

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 	Student 객체를 3개 만들어서 참조값을
		 * 	3개의 지역 변수에 담고
		 * 
		 *  각각의 name을 부여해 보세요
		 * 
		 */
		Student a=new Student();
		Student b=new Student();
		Student c=new Student();
		
		a.name="재옥";
		b.name="지용";
		c.name="지환";
	}
}
