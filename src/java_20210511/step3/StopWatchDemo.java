package java_20210511.step3;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopNanoWatch s = new StopNanoWatch();
		
		s.start();
		for(long i=0; i<30_000_000_000L; i++) {
			
		}
		s.stop();
		
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %,.9f",elapsedTime);
	}
}
