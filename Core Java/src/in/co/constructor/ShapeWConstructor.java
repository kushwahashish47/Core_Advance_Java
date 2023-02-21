package in.co.constructor;

public class ShapeWConstructor {
	private String color;
	private int borderWidth;
	
	public ShapeWConstructor() {
		System.out.println("Default" );
	}
	public ShapeWConstructor(String color, int borderwidth) {
		this.color = color;
		this.borderWidth = borderwidth;
	}
	public  String getColor() {
		return color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
}
