package java_20210503;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i=1;	//초기값
		while(i<=10) {//조건
			sum += i;
			i++;	//증감
		}
		
		int j=1;
		for(;j<=10;) {
			sum+=j;
			j++;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다", sum);
		
		i=1;		
		while(i<=9) {
			System.out.printf("%n%d단 입니다.%n",i);
			j=1;
			while(j<=9) {
				System.out.printf("%d * %d = %d%n",i,j,i*j);
				j++;
			}
			i++;
		}
	}
}
