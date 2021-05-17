package java_20210517;

public class TryCatchDemo {
	public static double getAvgs(int k, int e) {
		int sum = k + e;
		double avg = (double)sum/2;
		return avg;
	}
	//javac TryCatchDemo.java => compile
	//java TryCatchDemo 10 20 30
	//Run Configuration -> Arguments - Program arguments
	//-> 10 20 => 정상 실행
	//-> 10 a => NumberFormatException
	//-> 10 => ArrayIndexOutOfBoundsException
	//-> 
	public static void main(String[] args) {
		try {			
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);

			double average = getAvgs(korean, english);
			System.out.println("국어,영어의 평균 점수 : " + average + "입니다.");
		}catch(NumberFormatException e) {
			//catch 블럭의 수행문을 만들 때 2가지 형태로 코딩한다.
			//1. 에러 메시지를 출력(개발자에게)
			//2. 에러 메시지를 출력(사용자에게)
			
			//e.printStackTrace();	//error stack 모두 다 보고 싶은 경우
			System.err.println(e.getMessage());	//어디서 에러났는지 출력
			System.err.println("문자를 넣어주세요!");
		}catch(ArrayIndexOutOfBoundsException e) {
			//catch 블럭의 수행문을 만들 때 2가지 형태로 코딩한다.
			//1. 에러 메시지를 출력(개발자에게)
			//2. 에러 메시지를 출력(사용자에게)
			
			//e.printStackTrace();
			System.err.println(e.getMessage());	//에러 메시지만 출력
			System.err.println("인자 2개가 필요해!");
		}finally {
			System.out.println("무조건 수행되는 블럭-finally");//예외가 나던 안나던
		}
	}
}
