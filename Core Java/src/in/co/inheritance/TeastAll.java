package in.co.inheritance;

public class TeastAll {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(100);
		r.setWidth(200);
		r.area();
		System.out.println(r.getlength());
		System.out.println(r.getWidth());
		System.out.println(r.area());
		
		Circle c = new Circle();
		c.setRadius(10);
		System.out.println(c.area());
		 
		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(10);
		System.out.println(t.area());
		
		
	}

	
}
