package java_20210517;

public class RunnableDemo implements Runnable{
	//Runnable 인터페이스 쓰려면 run메소드 오버라이딩 해줘야함.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<1000; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : " + i);
		}
	}
	public static void main(String[] args) {
		System.out.println("start");
		
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1, "첫번째 스레드");
		t1.start();
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread(r2, "두번째 스레드");
		t2.start();
		
		System.out.println();
	}
}
