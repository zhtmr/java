package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass03 {
	public static void main(String[] args) {
		// Computer 객체를 생성해서 참조값을 c1이라는 이름의
		// 지역변수를 만들어서 담아보세요
		Computer c1=new Computer(new Cpu());
	}
}
