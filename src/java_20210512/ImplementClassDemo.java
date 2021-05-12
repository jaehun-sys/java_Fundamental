package java_20210512;

public class ImplementClassDemo {
	public static void main(String[] args) {
		//클래스를 통해 인터페이스 객체를 메모리에 로드할 수 있음.
		InterA i = new ImplementClass();
		i.mA();
		i.mB();
		i.mC();
		System.out.println(InterA.PI);
		
		String str1 = new String("HELLO");
		char[] c = {'H', 'E', 'L'};
		String str2 = String.valueOf(c);
	}
}
