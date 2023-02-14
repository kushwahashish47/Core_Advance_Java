package in.co.oop;

public class TestShape {
 public static void main(String[] args) {

	Shape s = new Shape();
	
	s.setBorderWidth(1);
	s.setColor("White");
	System.out.println(s.getColor());
	System.out.println(s.getBorderWidth());
}
}
