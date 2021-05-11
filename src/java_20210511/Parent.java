package java_20210511;

public class Parent {
	String name;
	String address;
	int age;
	
	//alt + shift + s => c : default 생성자 생성 단축키.
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//alt + shift + s => o : 매개변수 있는 생성자 자동 생성 단축키.
	public Parent(String name, String address, int age) {
		super();	//생성자는 첫줄에 쓰는 것.
		this.name = name;
		this.address = address;
		this.age = age;
	}	
}
