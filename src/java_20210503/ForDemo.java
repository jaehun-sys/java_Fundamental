package java_20210503;

public class ForDemo {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다",sum);
		
		sum = 0;
		for(int i=0; i<=10; i+=2) {
			sum += i;
		}
		System.out.printf("\n1부터 10까지 짝수의 합은 %d 입니다.%n",sum);
		
		for(int first = 2; first <= 9; first++) {
			System.out.printf("%n%d단 입니다.%n", first);
			for(int second=0; second<=9; second++) {
				System.out.printf("%d * %d = %d%n", first, second, first*second);
			}
		}
		
		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;
		//1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수다
		//예)2,3,5,...
		for(int i=2; i<=100; i++) {
			int count = 0;
			for(int j=2; j*j<=i; j++) {
				if(i%j==0) {
					count++;
					break;
				}
				totalIndex++;
			}
			if(count==0) {
				totalCountOfPrimeNumber++;
				System.out.print(i+"\t");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
