package in.co.methodoverriding;

public class Shape {
	private String color;
	private int borderWidth;
	
	public void setColor(String color) {
		this.color = color;
	}
	public  String getColor() {
		return color;
	}
	public void setBorderWidth( int bwth) {
		this.borderWidth= bwth;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
