package java_20210512;

class Test{
	String name;
	Test(String name){
		this.name = name;
	}
	//equals() 오버라이딩 하는 거임. (alt + shift + s -> Generate 해시코드...)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	//alt + shift + s -> generate toString()...
	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}
	
}

public class ObjectDemo {
	public static void main(String[] args) {
		Test t1 = new Test("이재훈");
		Test t2 = new Test("이재훈");
		Test t3 = t2;
		System.out.println(t1==t2);	//서로 다른 객체를 참조하는 변수를 갖고 있음.
		System.out.println((t1.name).equals(t2.name));
		System.out.println(t2.equals(t3));
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		//toString()이 생략되어있음. hashCode를 16진수로 바꾸어 표현.
		System.out.println(t1.toString());	
	}
}
