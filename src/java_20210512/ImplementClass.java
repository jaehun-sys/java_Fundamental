package java_20210512;
//클래스에서 인터페이스를 상속받을 때는 implements 키워드를 사용
public class ImplementClass implements InterA{
	//인터페이스에 있는 메소드는 다 추상메소드이기 때문에 오버라이딩을 다 해야함.
	public void mA() {
		System.out.println("mA 메소드");
	}
	public void mB() {
		System.out.println("mB 메소드");
	}
	public void mC() {
		System.out.println("mC 메소드");
	}
}
