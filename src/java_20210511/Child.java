package java_20210511;

public class Child extends Parent{
	String phone;
	double weight;
	double height;
	//부모의 인자 세개도 여기서 초기화
	public Child(String name, String address, int age, String phone, double weight, double height) {
		super(name, address, age);//초기화는 super로 초기화
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}
	public Child(String phone, double weight, double height) {
		super();	//부모클래스의 디폴트 생성자를 호출.
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}
	
}
