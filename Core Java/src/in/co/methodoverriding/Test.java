package in.co.methodoverriding;

public class Test {
	public static void main(String[] args) {
														//in all cases child will override area over parent
	double sum =0.00;
	Shape s1[] = new Shape[3];
	
	s1[0] = new Rectangle();							//Rectangle r = (Rectangle)new Shape();don't do like that.
	Rectangle r = (Rectangle)s1[0];
	r.setLength(10);
	r.setWidth(10);
	r.area();
	
	
	System.out.println("Rect Area =" + r.area());	
	
	s1[1] = new Circle();
	Circle c = (Circle)s1[1];
	c.setRadius(5);
	c.area();
	System.out.println("Circle area = "+c.area());
	
	s1[2] = new Triangle();
	Triangle t = (Triangle)s1[2];
	t.setBase(10);
	t.setHeight(15);
	t.area();
	System.out.println("Triangle area=" + t.area());
	
	for (int i =0;i<s1.length;i++) {
		sum = sum +s1[i].area();
		
	}System.out.println(sum);
	
	
	
	}															
}