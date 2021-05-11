package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] args) {
		//char 리터럴 => 문자 표현법
		char c1 = '이';
		char c2 = '재';
		char c3 = '훈';
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		//char 리터럴 => 유니코드 표현법
		char c4 = '\uc774';
		char c5 = '\uc7ac';
		char c6 = '\ud6c8';
		
		System.out.print(c4);
		System.out.print(c5);
		System.out.println(c6);
		
		//char 리터럴 => 아스키코드 표현법
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		
		//문자 중에 사용할 수 없는 문자는 ',\
		//사용하기 위해서는 앞에 \ 붙이기
		char c10 = '\'';
		char c11 = '\\';
		char c12 = '"';
		
		System.out.println(c10);
		System.out.println(c11);
		System.out.println(c12);
		
		//특수문자 \t \n
		System.out.print("안녕하세요.\n저는 이재훈입니다.\n잘 부탁드립니다.\n");
		
		System.out.println("아이디\t이름\t지역");
		System.out.println("us03098\t이재훈\t서울");
	}
}
