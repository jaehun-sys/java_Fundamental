package java_20210507;

public class StaticMethodDemo {
	String name;
	static double interestRate;
	public void m1() {
		System.out.println("instance method m1() 호출");
	}
	public void m2() {
		//instance method 에서는 
		//모든 변수를 사용하고, 모든 메소드를 호출할 수 있음
		this.name = "이재훈";//this. => 자기자신 인스턴스
		StaticMethodDemo.interestRate = 3.4;
		this.m1();
		interestRate = 3.4;
		m1();
	}
	public static void m3() {
		System.out.println("instance method m1() 호출");
	}
	
	
	public static void m4() {
		//static method에서는 static 변수와 static 메소드만 사용할 수 있다.
		//name = "홍길동";
		interestRate = 4.3;
		//m1();
		m3();
	}
	
	
	public static void main(String[] args) {
		m3();
		m4();
		interestRate = 4.3;
		StaticMethodDemo smd = new StaticMethodDemo();
		smd.m1();
		smd.name = "이재훈";
	}
}
