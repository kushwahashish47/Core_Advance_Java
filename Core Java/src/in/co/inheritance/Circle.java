package in.co.inheritance;

public class Circle {
	private static final int PI = 0;
	private int radius;
	private double area;
	
	public void setRadius(int radius){
		this.radius = radius;
		}
	public int getRadius() {
		return radius;
		
	}
	public double area () {
		area = PI*radius*radius;
		return area;
	}
}
