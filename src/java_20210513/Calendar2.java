package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar2 {
	private Calendar cal;
	public Calendar2() {
		cal = Calendar.getInstance();
	}
	//연, 월, 일을 집어넣으면 "몇년 몇월 몇일은 무슨요일입니다."
	public void print(int year, int month, int day) {
		cal.set(year, month-1, day);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일입니다.");
		System.out.println(sdf.format(cal.getTime()));
	}
	
	//연, 월을 집어넣으면 월 달력이 나오는 캘린더
	public void print(int year, int month) {
		cal.set(year, month-1,1);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int count = 0;
		
		for(int j=0; j<dayOfWeek-1; j++) {
			System.out.print("\t");
			count++;
		}
		
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {			
			System.out.print(i + "\t");
			count++;
			if(count%7==0) System.out.println();
		}
		System.out.println();
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
