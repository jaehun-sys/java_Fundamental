package java_20210511.step5;

public class StopWatchDemo {
	public static void run(StopWatch s) {
		s.execute();
	}
	public static void main(String[] args) {
		StopMilliWatch s = new StopMilliWatch();
		run(s);
	}
}
