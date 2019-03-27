package test.mypac;

public class Scv {
	// 기본 체력 필드 {객체마다 만들어지는 저장소}
	public int hp=50;
	// 공격력(static)필드 {하나만 만들어지는 고유한 저장소}
	public static int ap=5;
	
	// 자원을 캐는 기능
	public void mining() {		
		System.out.println("자원을 캐요");
	}
	
	public void building() {
		System.out.println("건물을 지어요");
	}
	
	public void move() {
		System.out.println("정찰을 해요");
	}
	
	public void attack() {
		System.out.println("공격을 해서 "+Scv.ap+"데미지를 가해요"); // static을 참조할땐 클래스명에 .찍음
	}
	
}
