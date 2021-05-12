package java_20210512;

public class MathDemo {
	public static void main(String[] args) {
		//올림
		double d = Math.ceil(4.2);
		System.out.println(d);
		//버림
		d = Math.floor(4.9);
		System.out.println(d);
		//반올림(float -> int)
		int i = Math.round(2.5f);
		System.out.println(i);
		//반올림(double -> long)
		long l = Math.round(4.2);
		System.out.println(l);
		
		d = Math.abs(-4.2);
		System.out.println(d);
		
		d = Math.max(4.2, 5.2);
		System.out.println(d);
		
		d = Math.min(2.4, 1002.56);
		System.out.println(d);
		
		d = Math.sqrt(2);
		System.out.println(d);
		
		l = (long)Math.sqrt(4);
		//double을 정수로 바꿀 땐 int보단 long! 21억이 넘어갈 수 있음을 위해.
		System.out.println(l);
		
		//2의 3승
		d = Math.pow(2.0, 3.0);
		System.out.println(d);
		
		d = Math.random();
		System.out.println(d);
	}
}
