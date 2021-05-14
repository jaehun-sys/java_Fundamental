package java_20210514;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		//HashMap : key 값은 유일해야 하고, value는 객체의 중복을 허용함.
		HashMap map = new HashMap();
		
		map.put("a", "1111");	//왼쪽은 키값, 오른쪽은 객체
		map.put("b", "2222");	
		map.put("c", "3333");	
		
		String value1 = (String)map.get("a");
		String value2 = (String)map.get("b");
		String value3 = (String)map.get("c");
		
		System.out.printf("%s, %s, %s \n", value1, value2, value2);
		
		Set keySet = map.keySet();
		
		Iterator i = keySet.iterator();
		while(i.hasNext()) {	//맵에 있는 요소 죄다 뽑아내기
			String key = (String)i.next();
			String value = (String)map.get(key);
			System.out.printf("%s : %s \n", key, value);
		}
	}
}
