package java_20210511;

public class SubDemo {
	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.money);
		sub.makeMoney();
		System.out.println(sub.chicken);
		sub.gotoSchool();
		
		sub.play("~~~");	//자식 객체를 생성했음. 자식의 play가 먼저임.
		
		Super sup = new Super();
		System.out.println(sup.money);
		sup.makeMoney();
		sup.play("~~");
		
		//Polymorphism 다형성
		Super sup1 = new Sub();
		System.out.println(sup1.money);
		sup1.makeMoney();
		sup1.play("~~");
		
		//toString메소드 : Object 클래스에 있는 것.
		//재정의했음.
		System.out.println(sub.toString());	
		System.out.println(sub);
		
		//자식 누군가가 toString을 Overriding 했다면 자식 메소드가 호출됨.
		Object obj = new Sub();
		System.out.println(obj.toString());
	}
}
