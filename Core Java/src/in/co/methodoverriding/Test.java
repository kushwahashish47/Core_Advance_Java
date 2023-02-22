package in.co.methodoverriding;

public class Test {
	public static void main(String[] args) {
														//in all cases child will override area over parent
	double sum =0.00;
	Shape s1[] = new Shape[3];
	
	s1[0] = new Rectangle();							//Rectangle g = (Rectangle)new Shape(); can be?
	Rectangle r = (Rectangle)s1[0];
	r.setLength(10);
	r.setWidth(10);
	r.area();
	System.out.println(r.area());	
	
	s1[1] = new Circle();
	Circle c = (Circle)s1[1];
	c.setRadius(50);
	c.area();
	System.out.println(c.area());
	
	s1[2] = new Triangle();
	Triangle t = (Triangle)s1[2];
	t.setBase(10);
	t.setHeight(15);
	t.area();
	System.out.println(t.area());
	
	for (int i =0;i<s1.length;i++) {
		sum = sum +s1[i].area();
		
	}System.out.println(sum);
	
	
	
	}															
}