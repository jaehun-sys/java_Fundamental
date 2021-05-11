package java_20210507;

public class Calendar {
	private int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 0;
	private boolean isLeafYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	private int key(int year, int month, int day) {
		//year년까지의 총 카운트
				int totalCount = 365*(year-1) + (year-1)/4 - (year-1)/100 + (year-1) + 400;
				int thisYear = 0;
				
				//윤년일 경우 2월이 29일이 됨
				if(isLeafYear(year)) monthArray[1] = 29;
				
				//올해 해당 월까지 합
				for(int i=0; i<month-1; i++) {
					thisYear += monthArray[i];
				}
				//올해 일까지 합
				thisYear += day;
				totalCount += thisYear;
				
				return totalCount%7;
	}
	
	//연, 월, 일을 집어넣으면 "몇년 몇월 몇일은 무슨요일입니다."
	public void print(int year, int month, int day) {
		
		int whatDay = key(year,month,day);
		
		String ans = "";
		if(whatDay==Calendar.MONDAY) {
			ans ="월";
		}
		else if(whatDay==TUESDAY) {
			ans ="화";
		}
		else if(whatDay==WEDNESDAY) {
			ans ="수";
		}
		else if(whatDay==THURSDAY) {
			ans ="목";
		}
		else if(whatDay==FRIDAY) {
			ans ="금";
		}
		else if(whatDay==SATURDAY) {
			ans ="토";
		}
		else{
			ans ="월";
		}
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + ans + "요일입니다.");
	}
	
	//연, 월을 집어넣으면 월 달력이 나오는 캘린더
	public void print(int year, int month) {
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		if(isLeafYear(year)) {
			monthArray[1] = 29;
		}
		
		int blank = key(year,month,1);

		for(int j=0; j<blank; j++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <= monthArray[month-1]; i++) {			
			System.out.print(i + "\t");
			if((i+blank)%7==0) System.out.println();
		}
	}
		
	//연을 집어넣으면 연 달력이 나오는 캘린더
	public void print(int year) {

		for(int i=0; i<12; i++) {
			System.out.println();
			System.out.println();
			print(year,i+1);
		}
	}
}
