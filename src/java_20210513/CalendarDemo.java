package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);//24시간
		//int hour = cal.get(Calendar.HOUR);	//12시간
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d년 %d월 %d일\n",year,month+1,day);
		System.out.printf("%d:%d:%d\n", hour,minute,second);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		StringBuffer message = new StringBuffer();
		System.out.println(dayOfWeek);
		if(dayOfWeek == Calendar.SUNDAY) {//1
			message.append("일요일");
		}
		else if(dayOfWeek == Calendar.MONDAY) {//2
			message.append("월요일");
		}
		else if(dayOfWeek == Calendar.TUESDAY) {//3
			message.append("화요일");
		}
		else if(dayOfWeek == Calendar.WEDNESDAY) {//4
			message.append("수요일");
		}
		else if(dayOfWeek == Calendar.THURSDAY) {//5
			message.append("목요일");
		}
		else if(dayOfWeek == Calendar.FRIDAY) {//6
			message.append("금요일");
		}
		else if(dayOfWeek == Calendar.SATURDAY) {//0
			message.append("토요일");
		}
		System.out.printf("%d년 %d월 %d일 %s입니다.\n",year,month+1,day,message.toString());
		
		//ctrl + shift + o => 자동 import
		cal.set(2020,4,13);//month는 0부터 시작해서 +1을 해주어서 계산해야함
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초 E요일");
		Date d = cal.getTime();
		String display = sdf.format(d);
		System.out.println(display.toString());
		//해당 월의 마지막 날짜를 반환
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
	}
}
