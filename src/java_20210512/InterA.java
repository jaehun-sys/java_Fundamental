package java_20210512;
//인터페이스간의 상속은 extends 키워드를 사용하고, 다중 상속이 가능함.
public interface InterA extends InterB, InterC{
	//인터페이스의 변수는 public static final이 생략되어 있음
	double PI = 3.14;
	//인터페이스의 접근 한정자를 붙이지 않으면 public 생략되어 있음
	//abstract 생략 가능
	public abstract void mA();
}
