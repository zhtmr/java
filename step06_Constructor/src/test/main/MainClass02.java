package test.main;

import test.mypac.Student;

public class MainClass02 {
	public static void main(String[] args) {
		// 1.default 생성자를 호출해서 객체 생성
		Student s1=new Student();
		s1.name="이지용";
		
// 생성자의 종류에 따라 
		
		// 2.인자로 String type을 전달받는 생성자를 호출해서
		// 객체 생성
		Student s2=new Student("여재옥");
		Student s3=new Student("유승렬");
		
		
	}
}
