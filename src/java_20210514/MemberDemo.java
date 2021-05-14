package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.insert("us03098","이재훈",10);
		m.insert("oiu2353","이재훈1",20);
		m.insert("zclkv234","이재훈2",30);
		m.insert("ulasgjh2","이재훈3",40);
		m.show();
		
		ArrayList<Member> list = m.select();
		
		m.update("us03098","이재훈",34);
		m.show();
		
		m.delete("us03098");
		m.show();
		
		m.select("oiu2353");
	}
}
