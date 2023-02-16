package in.co.inheritance;

public class Shapee {
	private String color;
	private int borderWidth;
	
	public Shapee() {
		System.out.println("Default" );
	}
	
	public Shapee(String color, int borderwidth) {
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
