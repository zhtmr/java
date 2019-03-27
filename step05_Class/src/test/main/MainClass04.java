package test.main;

import test.mypac.Scv;

public class MainClass04 {
	public static void main(String[] args) {
		// Scv 객체를 3개 만들어서 각각의 참조값을
		// 지역변수에 담아 보세요
		Scv a=new Scv();
		Scv b=new Scv();
		Scv c=new Scv();
		
		// 만든 객체 중에서 하나는 자원을 캐고
		a.mining();
		// 하나는 건물을 짓고
		b.building();
		// 하나는 공격을 한다.
		c.attack();
		
		// scv의 공격력을 1 증가 시키기
		Scv.ap++;
		System.out.println("공격력 1 증가 시킨이후...");
		a.attack();
		b.attack();
		c.attack();
	}
}
