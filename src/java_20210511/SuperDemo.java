package java_20210511;

class A{
	int a;
	A(int a){
		super();	//가 숨어있음.
		this.a = a;
	}
}
class B extends A{	//둘다
	B(){			//접근제어자 안붙인다.
		super(10);	//얘가 디폴트 생성자를 호출. 지 부모의 매개변수 있는 생성자를 호출
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
	}
}
