package in.co.inheritance;

public class TestRectangleWConstructor {

	public static void main(String[] args) {
		
		 RectangleWConstruct r = new RectangleWConstruct();
		 RectangleWConstruct r1 = new RectangleWConstruct(25,25);
		
		 System.out.println(r1.getLength());
		 System.out.println(r1.getWidth());
		 System.out.println(r1.area());
	}

}
