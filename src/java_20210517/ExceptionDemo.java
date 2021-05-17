package java_20210517;

import java.util.ArrayList;

public class ExceptionDemo {
	public static void main(String[] args) {
		//java.lang.NumberFormatException => 예외 처리를 해야 함.
		//aaaa1 => 예외 처리를 해야 함.
		//12.34 => 코드를 변경해야 함.
		//int i = Integer.parseInt("aaaa1");
		//System.out.println(i);
		//java.lang.NumberFormatException
		double d = Double.parseDouble("12.34");
		System.out.println(d);
		
		//java.lang.ArrayIndexOutOfBoundsException
		//배열의 범위를 벗어나면 발생하는 예외
		int[] arr = {1,2,3,4};
		//System.out.println(arr[4]);
		
		//java.lang.INdexOutOfBoundsException
		//Collection에서 범위를 벗어나면 발생하는 예외
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123);	//auto-boxing
		//System.out.println(list.get(1));
		
		//java.lang.NullPointerException
		//객체를 생성하지 않고 메소드를 사용하면 발생하는 예외
		String str = null;
		//System.out.println(str.length());
		
		//java.lang.ArithmeticException
		int a = 10;
		int b = 0;
		//System.out.println(a/b);
	}
}
