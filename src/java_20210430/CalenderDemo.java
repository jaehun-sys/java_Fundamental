package java_20210430;

public class CalenderDemo {

	public static void main(String[] args) {
		/*
		 * 달력 만들기
		 * 1. 1년 1월 1일은 월요일
		 * 2. 1년은 365일이고, 윤년은 366일 - 2월 29일
		 * 3. 윤년은 4년마다 발생하고 그중에서 100배수는 제외하고 400배수는 제외하지 않는다.
		 * 4. 2021년 4월 30일은 무슨 요일일까요?		
		 * 힌트) 2020년까지 총일수, 1-3월까지 총일수, 30을 더해서 7로 나눈 나머지가
		 * 		1이면 월요일, 2이면 화요일...
		 */
		int year = 2021;
		int month = 5;
		int day = 3;
		
		//2020년까지의 윤년 총 카운트
		int leap = 2020/4 - 2020/100 + 2020/400;
		
		//2021년 month월 day일 까지의 모든 일수 % 7
		int key = ((2020-leap)*365 + leap*366 + 31 + 28 + 31 + 30 + day) % 7;
		
		if(key==1) {
			System.out.println("월");
		}
		else if(key==2) {
			System.out.println("화");
		}
		else if(key==3) {
			System.out.println("수");
		}
		else if(key==4) {
			System.out.println("목");
		}
		else if(key==5) {
			System.out.println("금");
		}
		else if(key==6) {
			System.out.println("토");
		}
		else{
			System.out.println("일");
		}
	}

}
