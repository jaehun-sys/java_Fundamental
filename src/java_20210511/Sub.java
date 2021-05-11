package java_20210511;

public class Sub extends Super {
	String chicken;
	public void gotoSchool() {
		System.out.println("Sub gotoSchool() 호출");
	}
	
	//Overriding : 부모의 메소드를 재정의
	//작성규칙
	//1. 반환형, 메소드 이름, 매개변수 일치
	//2. 접근제어자는 부모보다 자식이 상위이거나 같으면 된다.
	public void play(String starcraft) {
		super.play("badook");	//=>부모의 기능 + 자식의 기능. 이게 없다면? 자식의 기능만 쓰겠다.
		System.out.println("Sub play(~) 호출");
	}
	
	//toString() 메소드 재정의
	public String toString() {
		return "서브클래스입니다.";
	}
}
