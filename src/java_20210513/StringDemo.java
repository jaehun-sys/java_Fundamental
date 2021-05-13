package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
		//String에다가 char 배열을 넣을 수 있다.
		char[] c = {'h', 'e', 'l', 'l', 'o'};
		String string = new String(c,0,2);
		System.out.println(string);
		String str = new String(c);
		System.out.println(str);
		
		//문자열 중에 특정 문자 하나만 반환하는 메소드
		//Index는 0부터 시작
		char c1 = str.charAt(1);
		System.out.println(c1);
		
		//문자열 연결하는 메소드
		//만약에 str을 new로 생성안하고 ""로ㅗ 생성했으면, 카비지컬렉터로 날라감.
		str = str.concat("123");
		System.out.println(str);
		
		str = new String("abc.zip");
		//endsWith(String msg) => msg문자열로 끝나면 true,
		//그렇지 않으면 false
		if(str.endsWith("zip")) {
			System.out.println("압축 파일입니다.");
		}
		else if(str.endsWith("doc")) {
			System.out.println("워드 문서입니다.");
		}
		else {
			System.out.println("파일입니다.");
		}
		String url = new String("http://www.naver.com");
		String path = new String("/news/board.do?id=123&cat=1");
		//startsWith(String msg) => msg문자열로 시작하면 true,
		//그렇지 않으면 false
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}
		else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}
		else {
			System.out.println("페이지가 존해하지 않습니다.");
		}
		//equals() => 문자열 비교,
		//equalsIgnoreCse() => 대소문자 구분하지 않고 비교
		
		String m1 = new String(" hello ").trim();
		String m2 = new String("hello");
		if(m1.equals(m2)) {
			System.out.println("true");
		}
		else {
			System.out.println(false);
		}
		//getBytes() => 문자열을 바이트 배열로 반환하는 메소드
		String m3 = new String("안녕하세요.");
		byte[] b = m3.getBytes();
		System.out.println(b.length);
		
		//앞에서부터 찾음
		String m4 = new String("111111-111118");
		int index = m4.indexOf("-");
		System.out.println(index);
		
		//끝에서부터 찾음
		String m5 = new String("qwerpo.iuwqe.ropiu.zip");
		int lastIndexOf = m5.lastIndexOf(".");
		System.out.println(lastIndexOf);
		
		System.out.println(m4.substring(0, m4.indexOf("-")));
		System.out.println(m4.substring(m4.indexOf("-")+1));
		
		System.out.println(m5.substring(0, m5.lastIndexOf(".")));
		System.out.println(m5.substring(m5.lastIndexOf(".")+1));
		
		String m6 = new String("010-1234-9875");
		System.out.println(m6.substring(0,m6.indexOf("-")));
		System.out.println(m6.substring(m6.indexOf("-")+1, m6.lastIndexOf("-")));
		System.out.println(m6.substring(m6.lastIndexOf("-")+1));
		
		String[] m6_ = m6.split("-");
		for(String value : m6_) {
			System.out.println(value);
		}
		
		int a1 = Integer.parseInt(m4.substring(0,1));
		String m7 = 123+"";
		String m8 = String.valueOf(123);
		String m9 = m6.replaceAll("-", "_");
		System.out.println(m9);
		
		String m10 = new String("hello");
		String m11 = m10.toUpperCase();
		System.out.println(m11);
		String m12 = m11.toLowerCase();
		System.out.println(m12);
		
		double d = 123456.345;
		String m13 = String.format("%,.2f", d);
		System.out.println(m13);
		System.out.format("%s",m13);
	}
}
