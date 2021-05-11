package java_20210503;

public class SwitchDemo {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";		
		
		switch(month) {
		case 1,2,12:
			season = "겨울";
			break;
		case 3,4,5:
			season = "봄";
			break;
		case 6,7,8:
			season = "여름";
			break;
		case 9,10,11:
			season = "가을";
			break;
		default:
			season = "없는 계절";
			break;
		}
		System.out.println(month + "월은 " + season + "입니다.");
		
	}

}
