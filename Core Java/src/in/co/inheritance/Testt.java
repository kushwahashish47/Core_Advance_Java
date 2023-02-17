package in.co.inheritance;

public class Testt {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Triangle t = new Triangle();
		
		r.setLength(10);
		r.setWidth(40);
		c.setRadius(10);
		t.setHeight(10);
		t.setBase(10);
		System.out.println(r.area());
		System.out.println(c.area());
		System.out.println(t.area());
		}

}
