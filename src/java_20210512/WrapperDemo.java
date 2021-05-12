package java_20210512;

//ctrl + shift + o => auto import
import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		//자바 1.4 이전 버전에서는 primitive data type을 
		//Collection에 저장할 수 없어서 primitive data type을 객체화할 수 있는
		//Wrapper 클래스로 변환하여 저장해야 했다.
		ArrayList list = new ArrayList();
		//아래와 같애 1을 저장할 수 없음.
		//list.add(1);
		list.add(new Integer(1));
		
		//1.primitive data type => wrapper class(valueOf(~)(생성자 사용)
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		//2.Wrapper class => Primitive data type(intValue());
		int i3 = i1.intValue();
		int i4 = i2.intValue();
		int i5 = i3 + i4;
		System.out.println(i5);
		
		//3.숫자로 구성된 String => primitive data type
		//Integer.parseInt("10");
		String s1 = "12345";
		int i6 = Integer.parseInt(s1);
		
		//4.auto-boxing : primitive data type -> Wrapper class로 자동 바뀜
		Integer i7 = 100;
		Integer i8 = 200;
		
		//5.auto-unboxing : wrapper class -> primitive data type로 자동 바뀜
		int i9 = i7+i8;
		
		
	}
}
