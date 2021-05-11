package java_20210504;

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
		int day = 4;
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean isLeafYear = (year%4==0 && year%100!=0) || year%400==0;
		
		//2020년까지의 총 카운트
		int totalCount = 365*(year-1) + (year-1)/4 - (year-1)/100 + (year-1) + 400;
		int thisYear = 0;
		
		//윤년일 경우 2월이 29일이 됨
		if(isLeafYear) monthArray[1] = 29;
		
		//올해 해당 월까지 합
		for(int i=0; i<month-1; i++) {
			thisYear += monthArray[i];
		}
		//올해 일까지 합
		thisYear += day;
		totalCount += thisYear;
		
		int key = totalCount%7;
		
		String ans = "";
		if(key==1) {
			ans ="월";
		}
		else if(key==2) {
			ans ="화";
		}
		else if(key==3) {
			ans ="수";
		}
		else if(key==4) {
			ans ="목";
		}
		else if(key==5) {
			ans ="금";
		}
		else if(key==6) {
			ans ="토";
		}
		else{
			ans ="월";
		}
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + ans + "요일입니다.");
	}

}
