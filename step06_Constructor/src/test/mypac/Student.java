package test.mypac;

public class Student {
	public String name;  // 호출할 때마다 다른 이름 받기위해 null로 생성
	
	// 1.default 생성자(따로 정의하지 않아도 new로 호출됨, 생성 시에 준비작업 가능)
	public Student() {
		System.out.println("Student() 생성자 호출됨");
	}
	
	// 2.인자로 String type을 전달 받는 생성자(생성자 다중정의(오버로딩))
	public Student(String name) {
		// 인자로 전달된 값을 필드에 저장하기
		this.name=name;
	}
	
	public void study() {
		System.out.println("공부를 해요");
	}
	
	public void goSchool() {
		System.out.println("학교를 가요");
	}
}
