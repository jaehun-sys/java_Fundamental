package java_20210510;

public class VarArgDemo {
	public long sum(int... temp) {
		long sum = 0;
		for (int i=0; i<temp.length; i++) {
			sum += temp[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		VarArgDemo v = new VarArgDemo();
		long s1 = v.sum(10,20);
		System.out.println(s1);
		//Variable Arguments
		//overloading을 하고 싶긴 한데, 정확히 매개변수를 몇 개 줄지 모를 때 쓸 수 있음.
		s1 = v.sum(80,30,75,95);
		System.out.println(s1);
	}
}