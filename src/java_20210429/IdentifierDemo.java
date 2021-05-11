//패키지명도 식별자에 포함되기 때문에 식별자 규칙을 지켜야 한다.
package java_20210429;
//클래스명도 식별자에 포함됨
//클래스명의 첫글자는 대문자로, 두 단어 합성은 낙타표기법으로
public class IdentifierDemo {
	//메서드명도 식별자에 포함됨
	//클래스명을 제외한 모든 이름은 소문자로 시작
	public static void main(String[] args) {
		int age = 20;
		String name = "hello";
		//첫글자는 숫자를 사용할 수 없음
		String father1Name = "john";
		//공백을 사용할 수 없음
		String motherName = "Michelle";
		//예약을 사용할 수 없음
		//String void = "empty";
		
		//자바는 유니코드를 지원하기 때문에 한글도 시별자로 사용가능하지만 안쓰는게 좋음
		String 이름 = "성영한";
		
		System.out.println(이름);
	}
}
