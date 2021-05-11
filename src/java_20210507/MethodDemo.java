package java_20210507;

//ctrl + f7 로 프로젝트랑 클래스 생성할 수 있음
//Window => Preference => java에서 Template에서 단축키 설정할 수 있음
public class MethodDemo {

	public void print(int year, int month) {
		System.out.println("\n일\t월\t화\t수\t목\t금\t토");
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean isLeafYear = isLeafYear(year);
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		for (int i = 1; i <= monthArray[month-1]; i++) {
			System.out.print(i+"\t");
			if(i%7==0) System.out.println();
		}
	}

	public void ascending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - (i + 1); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public boolean isLeafYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	// first, second => 매개변수(parameter)
	public int plus(int first, int second) {
		return first + second;
	}

	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		// 10, 20 => 인자(argument)
		int sum = m.plus(10, 20);
		System.out.printf("%d\n", sum);

		boolean leafYear = m.isLeafYear(2400);
		System.out.printf("%s \n", leafYear);

		int[] test = { 10, 20, 9, 1, 30, 23, 15, 7, 3 };
		m.ascending(test);
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		
		m.print(2020, 2);
		
	}
}
