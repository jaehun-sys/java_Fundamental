package java_20210511;

public class ShapeDemo {
	public static void main(String[] args) {
		ShapeManager manager = ShapeManager.getInstance();
		Triangle t = new Triangle();
		manager.run(t);
		/*↓구조적인 문제 때문에 추상클래스가 필요하다..
		Shape s = new Rectangle();
		s.draw();
		
		s = new Triangle();
		s.draw();
		
		s = new Circle();
		s.draw();
		*/
	}
}
