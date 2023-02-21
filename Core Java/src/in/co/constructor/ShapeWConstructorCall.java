package in.co.constructor;

public class ShapeWConstructorCall {
	public static void main(String[] args) {
		ShapeWConstructor S1 = new ShapeWConstructor();
		ShapeWConstructor S2 = new ShapeWConstructor("white", 150);
	
	System.out.println(S2.getColor());
	System.out.println(S2.getBorderWidth());
	}	


}
