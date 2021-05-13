package java_20210513;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//HashSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 순서가 없음
		//HashSet set = new HashSet();
		//TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고, natural ordering을 한다.
		//natural ordering TreeSet
		TreeSet set = new TreeSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(11);
		set.add(14);
		set.add(41);
		set.add(15);
		
		//HashSet 클래스는 자체적으로 출력할 방법이 없음.
		//HashSet을 Iterator로 변환해서 출력해야 함.
		Iterator i = set.iterator();
		while(i.hasNext()) {	//hasNext() : Iterator에 출력할 객체가 존재하는가?
			Integer temp = (Integer)i.next();	//있으면 데려와
			System.out.println(temp);
		}
		
		TreeSet lottoSet = new TreeSet();
		while(true) {
			int random = (int)(Math.random()*45)+1;	//1~45의 랜덤값
			lottoSet.add(random);	//auto-boxing. 원래 primitive type 못들어감. 
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		Iterator j = lottoSet.iterator();
		while(j.hasNext()) {
			Integer temp = (Integer)j.next();
			System.out.print(temp + " ");
		}
	}
}
