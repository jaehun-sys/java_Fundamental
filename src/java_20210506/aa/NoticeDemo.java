package java_20210506.aa;

public class NoticeDemo {
	private String regdate;
	
	public static void main(String[] args) {
		Notice n = new Notice();
		NoticeDemo n1 = new NoticeDemo();
		
		n.number = 8;//public: 서로 다른 패키지에서 접근가능
		n.title = "공지사항입니다.";//protected: 서로 다른 패키지이면서 상속받은 경우에만 접근가능
		n.hit = 8;//default: 같은 패키지 내에서 접근가능
		n1.regdate = "2021-05-06";//private: 클래스 내에서 접근 가능
	}
}
