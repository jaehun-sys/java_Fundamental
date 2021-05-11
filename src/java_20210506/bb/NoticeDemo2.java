package java_20210506.bb;
import java_20210506.aa.Notice;

public class NoticeDemo2 extends Notice{
	//서로 다른 패키지의 클래스를 사용하기 위해서는
	//import 구분을 사용하여야 한다.
	//package => import => class 순으로 코딩되어야 한다.
	
	public static void main(String[] args) {		
		Notice n2 = new Notice();
		n2.number = 8;//서로 다른 패키지에서도 접근 가능
		//n3.title = "";//protected 접근 불가능(상속받으면 가능)
		//n2.hit = 10;//default 접근 불가능
		//n1.regdate = "";//private 서로 다른 패키지에서 접근 불가능
		
		NoticeDemo2 n3 = new NoticeDemo2();
		n3.title = "";//protected 가능(상속받으면 가능)
		//n2.hit = 10;//default 접근 불가능
		//n1.regdate = "";//private 서로 다른 패키지에서 접근 불가능
	}
}
