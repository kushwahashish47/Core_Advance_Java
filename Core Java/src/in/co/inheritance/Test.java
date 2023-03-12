package in.co.inheritance;

public class Test {							
	public static void main(String[] args) {		// in this we take only circle and shape only to understand the cases.
		Circle c = new Circle(); 					//case1 when creating child object, we can use: parent methods and child method
		c.setRadius(10);
		c.setBorderWidth(5);
		c.setColor("White");						// generally 3 case: creating child object,creating parent object and
													// parent holding reference of child
		System.out.println(c.getRadius());
		System.out.println(c.area());
		System.out.println(c.getBorderWidth());
		System.out.println(c.getColor());
	
//		Shape s = new Shape();						when creating parent object, we can't use child methods.only parents method we can use
//		s.setBorderWidth(12);
//		s.setColor("Black");
//		System.out.println(s.getBorderWidth());
//		System.out.println(s.getColor());
	
		Shape h = new Circle();						//case2: parent object hold the reference of child ,or known as upcasting,
		h.setBorderWidth(4);						//when creating parent object, we can't use child methods
		h.setColor("Blue");
		System.out.println(h.getBorderWidth());
		System.out.println(h.getColor());
		
		Shape e  = new Circle();				
		Circle i = (Circle) e ;						//type casting // in child,now we can use: child and parent method,(as case1)
		i.setRadius(55);
		i.setColor("Brown");
		i.setBorderWidth(6);
	
		System.out.println(i.getRadius());
		System.out.println(i.getColor());
		System.out.println(i.getBorderWidth());
		System.out.println(i.area());
	
		Circle z = (Circle) new Shape();			// can't do this, which is not correct way of representation.

	}	
}
