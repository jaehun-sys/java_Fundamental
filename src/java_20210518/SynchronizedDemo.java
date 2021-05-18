package java_20210518;

public class SynchronizedDemo implements Runnable{
	int x;
	int y;
	@Override
	public void run() {	//or public synchronized void run()
		synchronized(SynchronizedDemo.class) {			
			for(int i=0; i<1000; i++) {
				x++;
				y++;
				String threadName = Thread.currentThread().getName();
				System.out.println("x : " + x + ", y : " + y + " - " +threadName);
			}
		}
	}
	
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
	}
}
